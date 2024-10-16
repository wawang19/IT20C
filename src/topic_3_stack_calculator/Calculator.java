/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_3_stack_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator extends JFrame implements ActionListener {
    private Stack<Integer> stack = new Stack<>();
    private JTextArea display;

    public Calculator() {
        setTitle("Stack Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Display area
        display = new JTextArea(5, 20);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 16));
        display.setMargin(new Insets(10, 10, 10, 10));
        add(new JScrollPane(display), BorderLayout.NORTH);

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 3, 10, 10));

        // Number buttons (0-9)
        for (int i = 0; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(new Font("Arial", Font.BOLD, 16));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        // Operation buttons
        String[] operations = {"+", "-", "*", "/"};
        for (String op : operations) {
            JButton button = new JButton(op);
            button.setFont(new Font("Arial", Font.BOLD, 16));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789".contains(command)) {
            // Push number to stack
            int number = Integer.parseInt(command);
            stack.push(number);
            displayStack();
        } else {
            // Perform operation
            performOperation(command);
        }
    }

    private void performOperation(String operation) {
        if (stack.size() < 2) {
            display.append("Need at least two numbers on the stack.\n");
            return;
        }

        int b = stack.pop();
        int a = stack.pop();
        int result = 0;

        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    display.append("Cannot divide by zero.\n");
                    stack.push(a);
                    stack.push(b);
                    return;
                }
                result = a / b;
                break;
        }

        stack.push(result);
        display.append("Result of " + a + " " + operation + " " + b + " = " + result + "\n");
        displayStack();
    }

    private void displayStack() {
        display.append("Current Stack: " + stack + "\n\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
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

    }
}
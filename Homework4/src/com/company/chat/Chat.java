package com.company.chat;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Anna Bondarenko
 * @version 24.02.19
 */

class Chat extends JFrame implements ActionListener {

    final String WINDOW_TITLE = "Chat window";
    final int WINDOW_WIDTH = 400;
    final int WINDOW_HEIGHT = 500;
    final String BTN_SEND = "Send";

    // area for chat
    JTextArea chatArea;
    // field for entering messages
    JTextField messageField;

    public static void main(String[] args) {
        new Chat();
    }

    /**
     * Create a window and all the necessary elements on it
     */
    Chat() {
        setTitle(WINDOW_TITLE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null); // to the center
        // area for chat
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollBar = new JScrollPane(chatArea);
        //panel for message field and send button
        JPanel bp = new JPanel();
        bp.setLayout(new BoxLayout(bp, BoxLayout.X_AXIS));
        messageField = new JTextField();
        messageField.addActionListener(this);
        JButton send = new JButton(BTN_SEND);
        send.addActionListener(this);
        // add elements to the window
        bp.add(messageField);
        bp.add(send);
        add(BorderLayout.CENTER, scrollBar);
        add(BorderLayout.SOUTH, bp);
        setVisible(true);
    }

    /**
     * Listener of events from message field and send button
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if (messageField.getText().trim().length() > 0) {
            chatArea.append(messageField.getText() + "\n");
        }
        messageField.setText("");
        messageField.requestFocusInWindow();
    }
}
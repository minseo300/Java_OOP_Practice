package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InitialFrame extends JFrame {
    JFrame frame;
    JButton customerButton, ownerButton;
    public InitialFrame() {

        customerButton=new JButton("손님");
        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ownerButton=new JButton("사장님");
        ownerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        frame.setTitle("Hello OOP");
        JPanel btnPanel = new JPanel();
        btnPanel.add(customerButton);
        btnPanel.add(ownerButton);
        frame.add(btnPanel);
        frame.setSize(500,700);
        frame.setVisible(true);
    }

}

package org.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGui extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input: ");
    private JRadioButton radioButton = new JRadioButton("Select that");
    private JRadioButton radioButton1 = new JRadioButton("Select this");
    private JCheckBox check = new JCheckBox("Input: ", false);

   public SimpleGui(){
       super("Simple Example");
       this.setBounds(100,100,250,100);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       Container container = this.getContentPane();
       container.setLayout(new GridLayout(3,2,2,2));
       container.add(label);
       container.add(input);

       ButtonGroup group = new ButtonGroup();
       group.add(radioButton);
       group.add(radioButton1);
       container.add(radioButton);
       radioButton.setSelected(true);
       container.add(radioButton1);
       container.add(check);
       button.addActionListener(new ButtonEventListener());
       container.add(button);

   }

   class ButtonEventListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
           String message = "";
           message += "Button was pressed\n";
           message += "Text is"+ input.getText() + "\n";
           message += (radioButton.isSelected() ? "Radio#1" : "Radio#2" + "is selected:\n");
           message += "Checkbox is "+ ((check.isSelected()) ?"checked" : "unchecked");
           JOptionPane.showMessageDialog(null, message, "Output",JOptionPane.PLAIN_MESSAGE);

       }
   }
}

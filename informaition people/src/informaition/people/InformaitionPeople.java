/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informaition.people;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
 import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
import java.awt.FlowLayout;

public class InformaitionPeople implements ActionListener {
JComboBox box;
public InformaitionPeople(){
    JFrame frame = new JFrame("VistDate");

JPanel panel = new JPanel();

box = new JComboBox();


box.addItem(1);
box.addItem(2);
box.addItem(3);
box.addItem(4);
box.addItem(5);
box.addItem(6);
box.addItem(7);
box.addItem(8);
box.addItem(9);
box.addItem(10);
box.addItem(11);
box.addItem(12);
box.addItem(13);
box.addItem(14);
box.addItem(15);
box.addItem(16);
box.addItem(17);
box.addItem(18);
box.addItem(19);
box.addItem(20);
box.addItem(21);
box.addItem(22);
box.addItem(23);
box.addItem(24);
box.addItem(25);
box.addItem(26);
box.addItem(27);
box.addItem(28);
box.addItem(29);
box.addItem(30);
box.addItem(31);

box.addActionListener(this);
panel.add(box);

frame.getContentPane().add(panel);
frame.pack();

frame.setVisible(true);
}
public void actionPerformed(ActionEvent e) {

System.out.println("vistDate: " +box.getSelectedIndex());
}
    
    public static void main(String[] args) {
          new InformaitionPeople (){
      };
    
         try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } 
          catch (Exception evt) {}
  
    JLabel l;
    JTextField t;
    JButton b;
    JFrame f = new JFrame("informaition patient");
    Container cp = f.getContentPane();
    cp.setLayout(new GridBagLayout());
    cp.setBackground(UIManager.getColor("control"));
    GridBagConstraints c = new GridBagConstraints();

    c.gridx = 0;
    c.gridy = GridBagConstraints.RELATIVE;
    c.gridwidth = 1;
    c.gridheight = 1;
    c.insets = new Insets(2, 2, 2, 2);
    c.anchor = GridBagConstraints.EAST;

    cp.add(l = new JLabel("Name:", SwingConstants.RIGHT), c);
    l.setDisplayedMnemonic('n');

    cp.add(l = new JLabel("age:", SwingConstants.RIGHT), c);
    l.setDisplayedMnemonic('c');
    cp.add(l = new JLabel("ID:", SwingConstants.RIGHT), c);
    l.setDisplayedMnemonic('s');
    cp.add(l = new JLabel("bold gruop:", SwingConstants.RIGHT), c);
    l.setDisplayedMnemonic('z');
    cp.add(l = new JLabel("Telephone:", SwingConstants.RIGHT), c);
    l.setDisplayedMnemonic('t');
       cp.add(l = new JLabel("Addres:", SwingConstants.RIGHT), c);
    l.setDisplayedMnemonic('t');
    cp.add(b = new JButton("Delete"), c);
    b.setMnemonic('l');

    c.gridx = 1;
    c.gridy = 0;
    c.weightx = 1.0;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.anchor = GridBagConstraints.CENTER;

    cp.add(t = new JTextField(35), c);
    t.setFocusAccelerator('n');
    c.gridx = 1;
    c.gridy = GridBagConstraints.RELATIVE;
    cp.add(t = new JTextField(35), c);
    t.setFocusAccelerator('h');
    cp.add(t = new JTextField(35), c);
    t.setFocusAccelerator('c');
    cp.add(t = new JTextField(35), c);
    t.setFocusAccelerator('s');
    cp.add(t = new JTextField(35), c);
    t.setFocusAccelerator('z');
    cp.add(t = new JTextField(35), c);
    t.setFocusAccelerator('t');
    c.weightx = 0.0;
    c.fill = GridBagConstraints.NONE;
    cp.add(b = new JButton("OK"), c);
    b.setMnemonic('o');

    f.pack();
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) {
        System.exit(0);
      }
    });
    f.setVisible(true);
     JFrame frame = new JFrame("GendarandBooldGroup ");

        JPanel entreePanel = new JPanel();
        final ButtonGroup entreeGroup = new ButtonGroup();
        JRadioButton radioButton;
        entreePanel.add(radioButton = new JRadioButton("Group A+"));
        radioButton.setActionCommand("Group A+");
        entreeGroup.add(radioButton);
        entreePanel.add(radioButton = new JRadioButton("Group O+"));
        radioButton.setActionCommand("Group O+");
        entreeGroup.add(radioButton);
        entreePanel.add(radioButton = new JRadioButton("Group B+", true));
        radioButton.setActionCommand("Group B+");
        entreeGroup.add(radioButton);

        final JPanel condimentsPanel = new JPanel();
        condimentsPanel.add(new JCheckBox("male"));
        condimentsPanel.add(new JCheckBox("female"));
        condimentsPanel.add(new JCheckBox("other"));

        JPanel orderPanel = new JPanel();
        JButton orderButton = new JButton("submit");
        orderPanel.add(orderButton);

        Container content = frame.getContentPane(); 
        content.setLayout(new GridLayout(3, 1));
        content.add(entreePanel);
        content.add(condimentsPanel);
        content.add(orderPanel);

        orderButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent ae) {
            String entree =
              entreeGroup.getSelection().getActionCommand();
            System.out.println(entree + " Boold Group");
            Component[] components = condimentsPanel.getComponents();
            for ( Component c : components ) {
              JCheckBox cb = (JCheckBox)c;
              if (cb.isSelected())
                System.out.println("sex:  " + cb.getText());
            }
          }
        });

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(300, 150);
        frame.setVisible(true);
         JFrame.setDefaultLookAndFeelDecorated(true);
//        JFrame frame = new JFrame(" informaition patient");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb1 = new JButton("patient name");      
        JButton jb2 = new JButton("age");
        JButton jb3 = new JButton("ID"); 
         JButton jb4 = new JButton("StafName"); 
          JButton jb5 = new JButton("VisitDate"); 
        
         JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(jb1);
        panel.add(jb2);
         panel.add(jb3);
          panel.add(jb4);
           panel.add(jb5);
         frame.add(panel);
        frame.pack();
        frame.setVisible(true);
       
    }

    
    
}

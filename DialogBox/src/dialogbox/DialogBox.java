/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogbox;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class DialogBox {

   
    public static void main(String[] args) {
      JFrame f=new JFrame();
       String b;
       int d;
       b=JOptionPane. showInputDialog(null,"Enter number integer");
       d=Integer.parseInt(b);
       if(d%4==2)
     
      
          JOptionPane.showMessageDialog(null, "Nmuber is even  "+d);
       else
       JOptionPane.showMessageDialog(null, "That number Is odd  "+d);
       int result =JOptionPane.showConfirmDialog(f, "DO another?!");
       DialogBox A=new DialogBox();
  
    }

  
    
}

    
    


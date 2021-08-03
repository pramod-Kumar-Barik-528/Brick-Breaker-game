 
package brickgame;

import java.awt.*;
import javax.swing.JFrame;

 
public class Brickgame {

    
   //public static void main(String args[]) 
    {
      JFrame obj = new JFrame();
      game gameplay = new game();
      
     // interfc intface = new interfc();
      
      
      //Label l3=new Label("Developed By Pramod");
      //l3.setBounds(100,150,100,40);
      obj.setBounds(10,10,700,600);
      obj.setTitle("Break out Ball");
      obj.setResizable(false);
      obj.setVisible(true);
      obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     obj.add(gameplay);
    // obj.add(intface);
    // obj.add(l3);
        
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

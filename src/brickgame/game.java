/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package brickgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Dell
 */
public class game extends JPanel implements KeyListener,ActionListener

//public class Gameplay extends JPanel implements KeyListener,ActionListener 
{

  private boolean play = false;
  private int score = 0;
  
  private int totalBrick = 21;
  
  private Timer time;
  private int dealy = 8;
  
  private int playerx = 310;
  
  private int ballposx = 120;
  private int ballposy = 350;
  private int ballxdir = -1;
  private int ballydir = -2;
  
  
  private Mapp map;
  
  //background Image 1.1
   Image img,img1;
    
 // Label l3=new Label("Developed By Pramod");
  
  
  public game()
  {
      map = new Mapp(3,7);
      addKeyListener(this);
      setFocusable(true);
      setFocusTraversalKeysEnabled(false);
      
      time = new Timer(dealy, this);
      time.start();
      
      //Bcakground Image 1.2
      img = Toolkit.getDefaultToolkit().createImage("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Brickgame\\src\\brickgame\\111.jpg");
   //img1 = Toolkit.getDefaultToolkit().createImage("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Brickgame\\src\\brickgame\\ball12.png");
     
      
      
  }
    public void paint(Graphics g)
    {
        //background
        g.setColor(Color.cyan);
        g.fillRect(1,1,692,592);
      Graphics2D Graphics;
      Graphics2D Graphics2D;
      
      //background Image 1.3
    //super.paintComponent(g);
        
      g.drawImage(img, WIDTH, dealy, this);
       
        //drawing map
        map.draw((Graphics2D )g);
        
      //border        
        g.setColor(Color.yellow);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
        g.fillRect(691,0,3,592);
        
        //scores
        g.setColor(Color.WHITE);
        g.setFont(new Font("Copperplate Gothic Light",Font.BOLD,25));
        g.drawString(""+score,590,30);
        
        //water mark
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Copperplate Gothic Light",Font.BOLD,12));
        g.drawString("Developed BY Pramod",520,560);
        
        //paddle        
        g.setColor(Color.GREEN);
        g.fillRect(playerx,550,100,8);
        
        //ball
         g.setColor(Color.YELLOW);
        g.fillOval(ballposx,ballposy,20,20);
         //g.drawImage(img1, WIDTH, dealy, this);
       // g.drawOval(ballposx,ballposy,20,20);
        
        
        //game over
        if(totalBrick <= 0)
        {
             play = false;
            ballxdir = 0;
            ballydir = 0;
            g.setColor(Color.red);
             g.setFont(new Font("serif",Font.BOLD,30));
           g.drawString(" YoU WoN",260,300);
           
           g.setFont(new Font("serif",Font.BOLD,20));
           g.drawString("press Enter to Restart : ",230,350);
           //this.setVisible(false);
              //  new game().setVisible(true);
        }
        
        if(ballposy > 570)
        {
            play = false;
            ballxdir = 0;
            ballydir = 0;
            g.setColor(Color.red);
             g.setFont(new Font("serif",Font.BOLD,30));
           g.drawString("Game Over scores :  "+score,190,300);
           
           g.setFont(new Font("serif",Font.BOLD,20));
           g.drawString("press Enter to Restart : ",230,350);
         // this.setVisible(false);
              // new OPTION().setVisible(true);
           //g.dispose();
        }
        
        g.dispose();
         
        
    }
    
    //setVisible(true);
    
    
    @Override
    public void keyTyped(KeyEvent e) {
       //throw new UnsupportedOperationException("Not supported yet.");
         
    }

    @Override
    public void keyPressed(KeyEvent e) {
       //throw new UnsupportedOperationException("Not supported yet."); 
 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet.");
       time.start();
       if(play)
       {
          if(new Rectangle(ballposx,ballposy,20,20).intersects(new Rectangle(playerx,550,100,8)))
          {
              ballydir = -ballydir;
          }
           
          
          //brake code
          A:for(int i=0; i<map.map.length;i++)
             {
                 for(int j =0;j<map.map[0].length;j++)
                 {
                     if(map.map[i][j] > 0)
                     {
                         int brickx =j*map.brickwidth+80;
                         int bricky = i*map.brickheight+50;
                         int brickwidth = map.brickwidth;
                         int brickheight = map.brickheight;
                         
                         Rectangle rect = new Rectangle(brickx,bricky,brickwidth,brickheight);
                         Rectangle ballRect = new Rectangle(ballposx,ballposy,20,20);
                         Rectangle brickRect = rect;
                         
                         if(ballRect.intersects(brickRect))
                         {
                             map.setBrickvalue(0,i,j);
                             totalBrick --;
                             score += 5;
                             
                             if(ballposx +19 <= brickRect.x || ballposx + 1 >= brickRect.x + brickRect.width )
                             {
                                 ballxdir = -ballxdir;
                             }
                             else
                             {
                                 ballydir = -ballydir;
                             }
                             break A;
                         }
                         
                         
                     }
                 }
             }
          
          
           
           ballposx += ballxdir;
           ballposy += ballydir;
           if(ballposx < 0)
           {
               ballxdir = -ballxdir;
           }
          if(ballposy < 0)
           {
               ballydir = -ballydir;
           }
          if(ballposx > 670)
           {
               ballxdir = -ballxdir;
           }
       }
       
      // this.setVisible(false);
              //  new game().setVisible(true);
       repaint();
       
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); 
    
      if(e.getKeyCode() == KeyEvent.VK_RIGHT)
      {
          if(playerx >= 600)
          {
              playerx = 600;
          }
          else
          {
              moveRight();
          }
      }
       if(e.getKeyCode() == KeyEvent.VK_LEFT)
      {
           if(playerx < 10)
          {
              playerx = 0;
          }
          else
          {
              moveLeft();
          }
      }  
      
      if(e.getKeyCode() == KeyEvent.VK_ENTER)
      {
          if(!play)
          {
              play = false;
              ballposx = 120;
              ballposy = 350;
              ballxdir  = -1;
              ballydir = -2;
              playerx = 310;
              score = 0;
              totalBrick = 21;
             // map = new Mapp(3,7);
           
              this.setVisible(false);
           
                new OPTION().setVisible(true);
              //repaint();
          }
      }
       
    }
 public void moveRight()
 {
     play = true;
     playerx+=20;
 }
 public void moveLeft()
 {
     play = true;
     playerx-=20;
 }   
    
}

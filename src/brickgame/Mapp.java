/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickgame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import static java.awt.image.ImageObserver.WIDTH;
 


public class Mapp 

{
    public int map[][];
    public int brickwidth;
    public int brickheight;
    Image img12;
    public Mapp(int row, int col)
    {
        map = new int[row][col];
        for(int i=0; i<map.length; i++)
        {
            for(int j=0; j<map[0].length;j++)
            {
                map[i][j] = 1;
            }
        }
     brickwidth = 540/col;
     brickheight = 150/row;
     
     
     img12 = Toolkit.getDefaultToolkit().createImage("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Brickgame\\src\\brickgame\\bk1.jpg");
    
    
    }
      
    public void draw(Graphics2D g)
    {
       
        for(int i=0; i<map.length; i++)
        {
           
            for(int j=0; j<map[0].length;j++)
            {
                
                if(map[i][j]>0)
                {
                    g.setColor(Color.PINK);
                    
                    g.fillRect(j*brickwidth+80,i*brickheight+50,brickwidth,brickheight);
                  
                    //brake border
                    
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    
                    g.drawRect(j*brickwidth+80,i*brickheight+50,brickwidth,brickheight);
                    
                }
            }
        } 
    }

    public void setBrickvalue(int value ,int row,int col)
    {
        map[row][col] = value;
        
    }


}

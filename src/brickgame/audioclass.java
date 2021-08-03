 
package brickgame;
 
import jaco.mp3.player.MP3Player;
import java.io.*;


public class audioclass 
{
    //finding the absolute path
      File f = new File("src\\");
        String path = f.getAbsolutePath();
       
     //bar
        
         String wait = (path+"\\brickgame\\audio\\"+"please_wait.mp3");
    MP3Player wait1 = new MP3Player(new File(wait));
        
        //bar
         String devlp = (path+"\\brickgame\\audio\\"+"Developed.mp3");
    MP3Player devlp1 = new MP3Player(new File(devlp));
        //bar
     String load = (path+"\\brickgame\\audio\\"+"loading_game.mp3");
    MP3Player load1 = new MP3Player(new File(load));
        
         String play = (path+"\\brickgame\\audio\\"+"Play.mp3");
    MP3Player play1 = new MP3Player(new File(play));
    
     String help = (path+"\\brickgame\\audio\\"+"help.mp3");
    MP3Player help1 = new MP3Player(new File(help));
        
         String About = (path+"\\brickgame\\audio\\"+"About.mp3");
    MP3Player About1 = new MP3Player(new File(About));
    
     String exit = (path+"\\brickgame\\audio\\"+"exit.mp3");
    MP3Player exit1 = new MP3Player(new File(exit));
    
         String back = (path+"\\brickgame\\audio\\"+"back.mp3");
    MP3Player back1 = new MP3Player(new File(back));
        
        
    
      String wc = (path+"\\brickgame\\audio\\"+"wcp.mp3");
    MP3Player wc1 = new MP3Player(new File(wc));
        
     // String back = (path+"\\brickgame\\audio\\"+"back.mp3");
   // MP3Player back1 = new MP3Player(new File(back));
        
    
}

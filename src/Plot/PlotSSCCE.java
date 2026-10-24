/*
CC0 1.0 Universal (CC0 1.0) Public Domain Dedication

To the extent possible under law, the author(s) have dedicated all copyright
and related rights to this software to the public domain worldwide. This
software is distributed without any warranty.

You may copy, modify, distribute, and perform the work, even for commercial
purposes, all without asking permission.

For more information, see <https://creativecommons.org/publicdomain/zero/1.0/>
*/
/*
This is free and unencumbered software released into the public domain.

Anyone is free to copy, modify, publish, use, compile, sell, or distribute
this software, either in source code form or as a compiled binary, for any
purpose, commercial or non-commercial, and by any means.

In jurisdictions that recognize copyright laws, the author(s) dedicate any
and all copyright interest in the software to the public domain. We make
this dedication for the benefit of the public at large and to the detriment
of our heirs and successors. We intend this dedication to be an overt act
of relinquishment in perpetuity of all present and future rights to this
software under copyright law.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For more information, please refer to <https://unlicense.org/>
*/
/**
 *
 * @author Rajesh V Pai
 */
package Plot;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Rajesh V Pai
 */
public class PlotSSCCE extends JPanel {
    private static BufferedImage bi=new BufferedImage(768,1024,BufferedImage.TYPE_INT_RGB);
    ImageIcon icon= new ImageIcon(bi);
    public static JFrame frame = new JFrame("SSCCE");   
   public PlotSSCCE(int sizex, int sizey){
       add(new JLabel(icon));
       
       for(int y=0; y < sizey ; y++){
           for (int x=0; x < sizex; x++){
                Color color=Color.BLACK;
                int colorValue=color.getRGB();
                bi.setRGB(x, y, 0);
          }
       }
       
   } 
   public static void createAndShowGUI(int sizex, int sizey){
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.add(new PlotSSCCE(sizex,sizey));
       frame.setLocationByPlatform(true);
       frame.pack();
       frame.setVisible(true);
   }
   public static void showPixel(String Description, int x,int y,int Mycolor){
       bi.setRGB(x, y, Mycolor);
    }
   public static void main(String[] args){
       EventQueue.invokeLater(new Runnable(){
       public void run(){
           createAndShowGUI(768,1024);
       }
   });
   }
   public void paintComponent(Graphics g){
       super.paintComponent(g);
       //g.drawLine(CalculusRNGDiff.x, CalculusRNGDiff.y, CalculusRNGDiff.x, CalculusRNGDiff.y);
   }
}

package 生成验证码;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
* 随机生成四位验证码,并输出图像
* @author Declan
*
*/
@WebServlet("/CodeServlet")
public class CodeServlet extends HttpServlet {
   private static final int WIDTH = 60;
   private static final int HEIGHT = 20;

   public void service(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {       
       response.setContentType("image/jpeg");
      
//       防止浏览器缓冲
       response.setHeader("Pragma", "No-cache");
       response.setHeader("Cache-Control", "no-cache");
       response.setDateHeader("Expires", 0);
      
       HttpSession session = request.getSession();
      
       BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
       Graphics g = image.getGraphics();
      
       char[] rands = getCode();
      
       drawBackground(g);
       drawRands(g,rands);
      
       g.dispose();
      
      
//       使用JPEGImageEncoder
//       ServletOutputStream out = response.getOutputStream();
//       JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
//       encoder.encode(image);
//       out.flush();
      
//       使用ImageIO
       ServletOutputStream out = response.getOutputStream();
       ByteArrayOutputStream bos = new ByteArrayOutputStream();
       ImageIO.write(image, "JPEG", bos);
       byte[] buf = bos.toByteArray();
       response.setContentLength(buf.length);
       out.write(buf);  //bos.writeTo(sos);
       bos.close();
       out.close();

       session.setAttribute("check", new String(rands));
      
   }
  
  
  
  
   /**
   * 产生四位随机数
   * @return
   */
   private char[] getCode(){
       String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       char[] rands = new char[4];
       for(int i=0;i <rands.length;i++){
           int rand = (int)(Math.random()*chars.length());
           rands[i] = chars.charAt(rand);
       }
       return rands;
   }
   /**
   * 绘制背景
   * @param g
   */
   private void drawBackground(Graphics g){
       g.setColor(new Color(0xDCDCDC));
       g.fillRect(0, 0, WIDTH, HEIGHT);
       for(int i=0;i <60;i++){
           int x = (int)(Math.random()*WIDTH);
           int y = (int)(Math.random()*WIDTH);
           int red = (int)(Math.random()*WIDTH);
           int green = (int)(Math.random()*WIDTH);
           int blue = (int)(Math.random()*WIDTH);
           g.setColor(new Color(red,green,blue));
           g.drawOval(x, y, 1, 0);
       }
   }
   /**
   * 绘制验证码
   * @param g
   * @param rands
   */
   private void drawRands(Graphics g,char[] rands){
       g.setColor(Color.black);
       g.setFont(new Font("黑体",Font.ITALIC|Font.BOLD,18));
       g.drawString(""+rands[0], 1, 17);
       g.drawString(""+rands[1], 16, 15);
       g.drawString(""+rands[2], 31, 18);
       g.drawString(""+rands[3], 46, 16);
   }
  
}


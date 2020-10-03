package lab04;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

    private int weight;
    private int height;
    private String imagePath;

    public ImagePanel(int weight,int height,String imagePath){
        this.weight = weight;
        this.height = height;
        this.imagePath = imagePath;
        this.setPreferredSize(new Dimension(this.weight,this.height));
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/img/" + imagePath));
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(this.weight,this.height,Image.SCALE_FAST));
        g.drawImage(imageIcon.getImage(),0,0,null);
    }
}
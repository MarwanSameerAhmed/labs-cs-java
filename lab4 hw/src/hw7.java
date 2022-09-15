import com.sun.xml.internal.messaging.saaj.soap.ImageDataContentHandler;
import javafx.scene.image.Image;

import java.awt.Color;
import javax.swing.*;

public class hw7 {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setSize(400, 400);
            JLabel label = new JLabel("hello , your name !");
            label.setOpaque(true);
            label.setBackground(Color.green);
           // frame.add(label);
            java.awt.Image image = new ImageIcon("C:\\Users\\aa048\\Desktop\\0_pFV-KQt6xzXBcNPI.png").getImage();
            frame.add(new JLabel(new ImageIcon((image))));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        }

    }

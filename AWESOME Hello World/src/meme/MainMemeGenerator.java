// Package name
package meme;

// Packages needed for this class
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

// Class definition of MainMemeGenerator
public class MainMemeGenerator {

	// Relative path name of the jpg file from the home directory
	private final static String FILE_NAME = "pictures/not_sure_if.jpg";

	// The text at the top of the image
	private final static String TOP_TEXT = "NOT SURE IF STUPID";

	// The text at the bottom of the image
	private final static String BOTTOM_TEXT = "OR JUST DUMB";

	// Main method
	public static void main(String[] args) {
		// Invoke a Runnable object, with the image and texts
		// This part can be pretty confusing, so there's no need for you to understand it all
		EventQueue.invokeLater(new Runnable() {
			
			// Initialize an ImageFrame, and set it as the contentpane for the JFrame
			public void run() {
				JFrame frame = new JFrame();
				ImageFrame iFrame = new ImageFrame(FILE_NAME, TOP_TEXT, BOTTOM_TEXT);
				frame.setSize((int) (iFrame.getWidth()), (int) (iFrame.getHeight()));
				frame.setContentPane(iFrame);
				frame.setVisible(true);
				frame.setResizable(false);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
	}
}

// Inner class ImageFrame
class ImageFrame extends JLayeredPane{

	// Basic Constructor
	public ImageFrame(String s){
		ImageComponent component = new ImageComponent(s);
		add(component);
	}

	// Another Constructor (with 3 parameters)
	// fileName: the path name for the image file
	// topText: the text at the top of the meme
	// bottomText: the text at the top of the meme
	public ImageFrame(String fileName, String topText, String bottomText){
		setLayout(new OverlayLayout(this));
		
		// Add the meme image to the frame
		ImageComponent component = new ImageComponent(fileName);
		int width = component.getWidth();
		int height = component.getHeight();
		setSize(width, height);
		add(component, new Integer(0));
		
		// Add the text to the frame
		JPanel pane = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.CENTER;
		c.weightx = 5;
		c.weighty = 1;	
		c.gridwidth = 3;
		c.gridheight = 1;
		c.insets = new Insets(0,0,123,0);
		c.gridx = 1;
		c.gridy = 0;
		JLabel topLabel = new JLabel(topText);
		topLabel.setFont(new Font("Impact", Font.BOLD, 48));
		topLabel.setForeground(Color.WHITE);
		pane.add(topLabel, c);

		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(123,0,0,0);
		JLabel bottomLabel = new JLabel(bottomText);
		bottomLabel.setFont(new Font("Impact", Font.BOLD, 48));
		bottomLabel.setForeground(Color.WHITE);
		pane.add(bottomLabel, c);
		
		pane.setOpaque(false);
		add(pane, new Integer(1));
	}
}		

// Inner class ImageComponent to display the image
class ImageComponent extends JComponent {
	private Image meme;
	
	public ImageComponent(String f) {
		try {
			File imageFile = new File(f);
			meme = ImageIO.read(imageFile);
			setSize(meme.getWidth(this), meme.getHeight(this));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void paintComponent (Graphics g){
		if (meme == null) return;
		g.drawImage(meme, 0, 0, this);
		g.dispose();

	}
}
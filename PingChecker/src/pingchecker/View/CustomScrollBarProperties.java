package pingchecker.View;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class CustomScrollBarProperties extends BasicScrollBarUI{
	@Override
	protected JButton createDecreaseButton(int orientation) {
		JButton button = new JButton("");
                
                button.setBackground(new Color(0, 0, 0));
		button.setForeground(new Color(0, 0, 0));
                button.setFocusPainted(false);
                button.setBorder(new LineBorder(new Color(0,255,0), 1));
		button.setIcon(new ImageIcon(CustomScrollBarProperties.class.getResource("/res/arrowup_green.png")));
                button.setPreferredSize(new Dimension(16,16));
		return button;
	}

	@Override
	protected JButton createIncreaseButton(int orientation) {
		JButton button = new JButton("");
                
                button.setBackground(new Color(0, 0, 0));
		button.setForeground(new Color(0, 0, 0));
                button.setFocusPainted(false);
                button.setBorder(new LineBorder(new Color(0,255,0), 1));
		button.setIcon(new ImageIcon(CustomScrollBarProperties.class.getResource("/res/arrowdown_green.png")));
                button.setPreferredSize(new Dimension(16,16));
		return button;
	}

	@Override
	protected void configureScrollBarColors() {
		this.thumbColor = new Color(0, 255, 0);
		this.trackColor = Color.BLACK;
		this.thumbDarkShadowColor = Color.BLACK;
		this.thumbLightShadowColor = Color.BLACK;
		this.thumbHighlightColor = Color.BLACK;
                
	}
	
}

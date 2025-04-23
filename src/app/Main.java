package app;

import app.utils.FontManager;
import app.view.View;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// importa il font custom con il Font Manager
		FontManager fontManager = new FontManager();
		try {
			fontManager.registerFont("Miedinger Medium W00 Regular.otf");
			fontManager.registerFont("SpecialGothicExpandedOne-Regular.ttf");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Cannot load font error: " + e.getMessage());
		}
		
		View view = new View();
		view.setVisible(true);
	}

}

package app.utils;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

import app.Main;

public class FontManager {

	public FontManager() {
	}
	
	public void registerFont(String name) throws Exception  {
		registerFontSystem(name);
	}
	
	private Font loadFont(String name) throws FontFormatException, IOException {
		return Font.createFont(Font.TRUETYPE_FONT, Main.class.getResourceAsStream("../" + name));
	}

	private void registerFontSystem(String name) throws Exception {
		Font f = loadFont(name);
		GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(f);
	}

}

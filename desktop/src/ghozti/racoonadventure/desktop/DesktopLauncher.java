package ghozti.racoonadventure.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ghozti.racoonadventure.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		//sets the application title
		config.title = "Racoon Adventure";
		//sets initial app w and h
		config.width = 1000;
		config.height = 800;
		//allows users to resize the application
		config.resizable = true;
		//wil pause the game if minized
		config.pauseWhenMinimized = true;
		//the fps which the game will run at
		config.foregroundFPS = 144;

		//TODO add icon
		//config.addIcon();
		new LwjglApplication(new Game(), config);
	}
}
package ghozti.racoonadventure.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ghozti.racoonadventure.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		//for vsync monitors
		config.vSyncEnabled = true;

		//sets the application title
		config.title = "Racoon Adventure";

		//sets initial app w and h
		config.width = 1920;
		config.height = 1080;

		//does not allow users to resize the application
		config.resizable = false;

		//sets the screen to be fullscreen
		config.fullscreen = true;

		//wil pause the game if minized
		config.pauseWhenBackground = true;

		//the fps which the game will run at
		config.foregroundFPS = 60;

		//TODO add icon
		//config.addIcon("raw_textures/player/player idle.png");
		new LwjglApplication(new Game(), config);
	}
}
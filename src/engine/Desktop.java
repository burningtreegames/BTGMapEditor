package engine;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Desktop {
	
	private static LwjglApplicationConfiguration config;
	
	public static void main(String[] args) 
	{
		config = new LwjglApplicationConfiguration();
		config.width = 1280;
		config.height = 720;
		config.title = "BTG Map Editor";
		config.vSyncEnabled = true;
		new LwjglApplication(new Game(), config);
		
	}
}

package engine;

import java.util.ArrayList;

import org.lwjgl.opengl.GL;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;

public class Game implements ApplicationListener
{	
	
	private static Debugging debug;
	private static ResourceLoader resourceLoader;
	private static ArrayList<Map> maps;
	private static int widthInTiles;
	private static int heightInTiles;
	
	
	public Game(){}
	
	@Override
	public void create()
	{
		setDebug(new Debugging());
		resourceLoader = new ResourceLoader();
		
		maps = new ArrayList<Map>();
		maps.add(new Map(100,100));
		
		widthInTiles = Gdx.graphics.getHeight() / 16;
		heightInTiles = Gdx.graphics.getWidth() / 16;
		
		getDebug().fastCommitDebugLog("GameMain Start Up Complete");
	}
	

	@Override
	public void dispose()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render()
	{
		for(int y = 0; y < maps.get(0).getMapY(); y++)
			for(int x = 0; x < maps.get(0).getMapX(); x++)
				maps.get(0).getMap()[x][y] = 0;
	}

	@Override
	public void resize(int width, int height)
	{
		
	}

	@Override
	public void resume()
	{
		// TODO Auto-generated method stub
		
	}

	public static Debugging getDebug() {
		return debug;
	}

	public void setDebug(Debugging debug) {
		this.debug = debug;
	}

}

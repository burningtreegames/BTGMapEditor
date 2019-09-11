package engine;

import com.badlogic.gdx.ApplicationListener;

public class Game implements ApplicationListener
{	
	
	private static Debugging debug;
	private static ResourceLoader resourceLoader;
	
	public Game(){}
	
	@Override
	public void create()
	{
		setDebug(new Debugging());
		resourceLoader = new ResourceLoader();
		
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
		// TODO Auto-generated method stub
		
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

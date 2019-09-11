package engine;

import com.badlogic.gdx.ApplicationListener;

public class Game implements ApplicationListener
{	
	
	private Debugging debug;
	
	public Game(){}
	
	@Override
	public void create()
	{
		debug = new Debugging();
		debug.fastCommitDebugLog("Game Start Up");
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

}

package engine;

import java.util.ArrayList;

import com.badlogic.gdx.files.FileHandle;

public class ResourceLoader
{
	private FileHandle buffer;
	private ArrayList<Objects> objects;
	
	public ResourceLoader()
	{
		buffer = null;
		
		Game.getDebug().fastCommitDebugLog("ResourceLoader Startup Complete");
	}
}

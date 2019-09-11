package engine;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.*;

public class Debugging
{
	private FileHandle eFile;
	private FileHandle dFile;
	private ArrayList<String> errorLogBuffer;
	private ArrayList<String> debugLogBuffer;
	
	public Debugging()
	{
		eFile = null;
		dFile = null;
		errorLogBuffer = new ArrayList<String>();
		debugLogBuffer = new ArrayList<String>();
		
		eFile = Gdx.files.external("/documents/games/BTTG Map Editor/debug/ErrorLog.txt");
		dFile = Gdx.files.external("/documents/games/BTTG Map Editor/debug/DebugLog.txt");
		
		eFile.delete();
		dFile.delete();
		
		eFile = Gdx.files.external("/documents/games/BTTG Map Editor/debug/ErrorLog.txt");
		dFile = Gdx.files.external("/documents/games/BTTG Map Editor/debug/DebugLog.txt");
		
		errorLogBuffer.add("-----------------------" + "\r\n");
		errorLogBuffer.add("Error Logging Initiated" + "\r\n");
		errorLogBuffer.add("-----------------------" + "\r\n");		
		
		errorLogCommit();
		clearErrorLogBuffer();
		
		debugLogBuffer.add("-----------------------" + "\r\n");
		debugLogBuffer.add("Debug Logging Initiated" + "\r\n");
		debugLogBuffer.add("-----------------------" + "\r\n");
		
		debugLogCommit();
		clearDebugLogBuffer();

	}
	
	public void errorLogCommit()
	{
		for(short i = 0; i < errorLogBuffer.size(); i++)
			eFile.writeString(errorLogBuffer.get(i), true);
	}
	
	public void debugLogCommit()
	{
		for(short i = 0; i < debugLogBuffer.size(); i++)
			dFile.writeString(debugLogBuffer.get(i), true);
	}
	
	public void writeToErrorLogBuffer(String error)
	{
		this.errorLogBuffer.add(error);
	}
	
	public void writeToDebugLogBuffer(String debug)
	{
		this.debugLogBuffer.add(debug);
	}
	
	public void fastCommitErrorLog(String error)
	{
		eFile.writeString(error + "\r\n", true);
	}
	
	public void fastCommitDebugLog(String debug)
	{
		dFile.writeString(debug + "\r\n", true);
	}
	
	public void clearErrorLogBuffer()
	{
		errorLogBuffer.clear();
	}
	
	public void clearDebugLogBuffer()
	{
		debugLogBuffer.clear();
	}
	
}

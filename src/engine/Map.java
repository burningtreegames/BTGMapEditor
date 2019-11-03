package engine;

public class Map
{
	private byte[][] map;
	private int mapX;
	private int mapY;
	
	public Map(int i, int j) 
	{
		map = new byte[i][j];
		
		mapX = i;
		mapY = j;
		
		initialize();
	}
	
	public void initialize()
	{
		for(int y = 0; y < mapY; y++)
			for(int x = 0; x < mapX; x++)
				map[x][y] = 0;
	}
	
	public byte[][] getMap()
	{
		return map;
	}

	public void setMap(byte[][] map)
	{
		this.map = map;
	}
	
	public void setMapY(int mapY)
	{
		this.mapY = mapY;
	}

	public int getMapX()
	{
		return mapX;
	}

	public void setMapX(int mapX)
	{
		this.mapX = mapX;
	}

	public int getMapY()
	{
		return mapY;
	}


}

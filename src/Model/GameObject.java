package Model;

import java.awt.Image;

/*
 * klasa reprezentująca obiekt gry - sprite'a - przechowuje informacje o obrazku, jego położeniu 
 * i posiada metody służące jego poruszaniu
 */

abstract public class GameObject {
	
	protected Image image;
	
	protected int x;
	protected int y;
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	/*
	 * position setter
	 * 
	 * @author Kacper
	 */
	public void setPosition(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	/*
	 * image getter 
	 * 
	 * @author Kacper
	 */
	public Image getImage()
	{
		return image;
	}

	public void update(float deltaTime) {
		this.x += 1 * deltaTime;
	}
}

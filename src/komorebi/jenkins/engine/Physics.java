package komorebi.jenkins.engine;

import komorebi.jenkins.entity.Bullets;
import komorebi.jenkins.entity.Enemy;
import komorebi.jenkins.entity.Entity;
import komorebi.jenkins.entity.Player;
import komorebi.jenkins.entity.PlayerBullet;

public class Physics {	
	
	/**
	 * Checks if Bullet hits Player
	 * 
	 * @param play Player Class
	 * @param e
	 * @return true if bullet hit player
	 */
	public static boolean checkPlayer(Player play, Entity e)
	{
		if (e instanceof Bullets)
		{
			float distance = (float)Math.sqrt((play.getOx()-e.getOx())*(play.getOx()-e.getOx())+(play.getOy()-e.getOy())*(play.getOy()-e.getOy()));
			if(distance<20 && e.getRadius()<=distance)System.out.println(""+distance+", "+e.getRadius());
			if (e.getRadius()>distance)
			{
				return true;
			}
		}
		return false;
		
	}
	/**
	 * Checks enemy's sprite's with player's own bullets
	 * 
	 * @param e
	 * @param p
	 * @return true if player bullet hit enemy
	 */
	public boolean checkEnemy(Enemy e, PlayerBullet p)
	{
		return false;	
	
	}
}

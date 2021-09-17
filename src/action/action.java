/**
 * 
 */
package action;

import character.Player;
import room.room;

/**
 * @author amevigbe
 *
 */
public interface action {
	
	public void use () throws Exception;
	
	public Player getPlayer();
	
	public room getRoom();

}

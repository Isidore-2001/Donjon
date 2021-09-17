/**
 * 
 */
package item;

import character.Player;

/**
 * @author amevigbe
 *
 */
public interface Item {

	public void use(Player p);
	
	public String toString();
}

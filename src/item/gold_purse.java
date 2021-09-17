/**
 * 
 */
package item;

import character.Player;
import item.Item;

/**
 * @author amevigbe
 *
 */
public class gold_purse implements Item {

	protected static final int gold = 5;
	public gold_purse() {
		// TODO Auto-generated constructor stub
		
	}

	public void use(Player player) {
		// TODO Auto-generated method stub
		player.addGold(gold);

	}
	
	public String toString() {
		return "Vous venez d'avoir 5 pieces d'or !!!!!!!";
	}

}

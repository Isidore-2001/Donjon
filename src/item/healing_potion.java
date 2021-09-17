/**
 * 
 */
package item;

import character.Player;

/**
 * @author amevigbe
 *
 */
public class healing_potion implements Item {

	/**
	 * 
	 */
	protected static  int nbre_de_vie = 2;
	public healing_potion() {
		// TODO Auto-generated constructor stub
	}

	public void use(Player player) {
		// TODO Auto-generated method stub
		player.addLife(nbre_de_vie);

	}
	
	public String toString() {
		return "Vous venez d'obtenir 2 points de vie";
	}

}

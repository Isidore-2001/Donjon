/**
 * 
 */
package item;

import character.Player;

/**
 * @author amevigbe
 *
 */
public class potion_of_strength implements Item {

	/**
	 * 
	 */
	protected static final int nbre_de_force = 2;
	public potion_of_strength() {
		// TODO Auto-generated constructor stub
	}

	public void use(Player player) {
		// TODO Auto-generated method stub
		player.addStrenght(nbre_de_force);

	}

	public String toString() {
		return "Votre force est augmenté de 2 !!!!";
	}
}

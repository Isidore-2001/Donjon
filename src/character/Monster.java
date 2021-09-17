/**
 * 
 */
package character;

import character.Character;

/**
 * @author amevigbe
 *
 */
public class Monster extends Character{

	/**
	 * 
	 */
	public Monster(String name, int nbreVie, int strength, int qtGold, room r) {
		// TODO Auto-generated constructor stub
		super(name, nbreVie, strength, qtGold,r);
	}
	
	
	public String toString() {
		String res = "Vous disposez actuellement de" + this.nbreVie + " en point de vie"
				+ " et votre point de force est de " + this.nbreStrength ;
		
		return res;
	}
	
	
	public void die() {
		if (this.isDead()) {
			this.room.removeMonster(this);
			System.out.println("IS DEAD !!!!!!");
		}
		
		else {
			System.out.println("Vous disposez de " + this.getLife() + " de point de vie");
		}
		
		
	}

}

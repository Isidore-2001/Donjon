/**
 * 
 */
package action;

import character.Player;
import room.room;
import util.Input;

/**
 * @author amevigbe
 *
 */
public class useItem implements action {

	/**
	 * 
	 */
	protected Player p;
	protected room r;
	public useItem(Player p, room r) {
		// TODO Auto-generated constructor stub
		this.p = p;
		this.r = r;
	}

	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Il y a plus de monstre dans la salle "
				+ "Vous devez quitter la salle");
		System.out.print("Choississez la direction");
		
		String res = Input.readString();
		room salle = this.r.getDirection().get(res);
		if (!this.r.isthereMonster()) {
			this.p.setRoom(salle);
		}
		
		

	}

	public Player getPlayer() {
		// TODO Auto-generated method stub
		return this.p;
	}

	public room getRoom() {
		// TODO Auto-generated method stub
		return this.r;
	}

}

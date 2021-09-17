/**
 * 
 */
package action;

import character.Player;
import item.Item;
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
		System.out.println("***********Choisissez une action à effectuer selon le numéro de l'objet ******************");
		
		
		String res = Input.readString();
		Item i = this.r.getItemWithIndex(Integer.parseInt(res));
		i.use(this.p);

	}

	public Player getPlayer() {
		// TODO Auto-generated method stub
		return this.p;
	}

	public room getRoom() {
		// TODO Auto-generated method stub
		return this.r;
	}

	public boolean isPossible() {
		// TODO Auto-generated method stub
		return true;
	}

}

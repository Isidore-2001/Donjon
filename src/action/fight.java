package action;

import java.util.Map;

import character.Player;
import item.Item;
import character.Monster;
import room.room;
import util.Input;

/**
 * @author amevigbe
 *
 */
public class fight implements action {

	/**
	 * 
	 */
	protected Player p;
	protected room r;
	public fight(Player p, room r) {
		// TODO Auto-generated constructor stub
		this.p = p;
		this.r = r;
	}

	public void use() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Vous allez combattre un monstre ");
		
		if (this.r.isthereMonster()) {
			System.out.println("Vous allez choisir un monstre à combattre :");
			String res = Input.readString();
			if (res == "") {
				System.out.println("Aucune valeur");
			}
			
			else {
				int n = Integer.parseInt(res);
				Monster m = this.r.gettingMonster(n);
				p.attack(m);
			}
			
		}
		else {
			System.out.println("La salle ne contient pas de montre");
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

	public boolean isPossible() {
		// TODO Auto-generated method stub
		return true;
	}

}

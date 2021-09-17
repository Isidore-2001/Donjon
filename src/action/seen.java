/**
 * 
 */
package action;

import java.util.Map;

import character.Player;
import item.Item;
import character.Monster;
import room.room;

/**
 * @author amevigbe
 *
 */
public class seen implements action {

	/**
	 * 
	 */
	protected Player p;
	protected room r;
	public seen(Player p, room r) {
		// TODO Auto-generated constructor stub
		this.p = p;
		this.r = r;
	}

	public void use() {
		// TODO Auto-generated method stub
		String res = " ============ Cette salle contient =========================";
		for (Monster m: this.r.getMonster()) {
			res+= "le monstre " + m.toString() + ":\n ";
		}
		
		res+= "Pour sortir : ";
        for (Map.Entry m : this.r.getDirection().entrySet()) {
            res+="Direction : "+m.getKey()+", Salle : "+m.getValue();
        }
        
        res+="Cette salle contient les objets :";
        for(Item i: this.r.getItem()) {
        	res+=i.toString() + " ";
        }
		
        System.out.println(res);
		

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

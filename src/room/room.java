/**
 * 
 */
package room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author amevigbe
 *
 */
public class room {

	/**
	 * 
	 */
	protected static int NombreSalle;
	protected int NumeroSalle;
	protected Player player;
	protected ArrayList<Action> action;
	protected ArrayList<Item> item;
	protected ArrayList<Monster> monster;
	protected Map<Direction, room> direction;
	protected boolean exit;
	
	/**
	 * Le constructeur de room 
	 */
	public room() {
		// TODO Auto-generated constructor stub
		this.action = new ArrayList<>();
		this.item = new ArrayList<>();
		this.monster = new ArrayList<>();
		this.direction = new HashMap<Direction , room>();
		this.exit = false;
	}

	public ArrayList<Action> getActions() {
		return this.action;
	}
	/**
	 * 
	 * @param a l'action à ajouter dans la liste des actions de la salle
	 */
	public void addActions(Action a) {
		this.action.add(a);
		
	}
	
	public boolean isExit() {
		return this.exit;
	}
	
	public void removeActions(Action a) {
		this.action.remove(a);
	}
	
	
	public void removeMonster(Monster m) {
		this.monster.remove(m);
		
	}
	
	public void addMonster(Monster m) {
		this.monster.add(m);
	}
	
	
	public ArrayList<Monster> getMonster() {
		return this.monster;
	}
	
	public void addItem(Item i) {
		this.item.add(i);
	}
	
	public ArrayList<Item> getItem() {
		return this.item;
	}
	
	public void addDirection(Direction d, room r) {
		this.direction.put(d, r);
	}
	
	public Map<Direction, room> getDirection() {
		return this.direction;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public void removeItem(Item i) {
		this.item.remove(i);
	}
	
	public void removeDirection(Direction d) {
		this.direction.remove(d);
	}
	
	public void removePlayer() {
		this.player = null;
	}
	
	public void receivePlayer(Player p) {
		this.player = p;
	}
	
	public boolean isthereMonster() {
		return this.monster.size() != 0;
	}
	
	
	public boolean existMonster(Monster c) {
		return this.monster.get(c) != null;
	}
	
	
	public room changeRoom (Direction d) {
		if (!this.direction.containsKey(d)) {
			System.out.println("Il y a pas de salle associé à cette direction");
		}
		return this.direction.get(d);
	}
	
	
	
	
}

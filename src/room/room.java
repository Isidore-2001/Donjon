package room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import action.action;
import character.Player;
import item.Item;
import character.Monster;

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
	protected ArrayList<action> action;
	protected ArrayList<Item> item;
	protected ArrayList<Monster> monster;
	protected Map<Direction, room> direction;
	protected boolean exit;
	
	/**
	 * Le constructeur de room 
	 */
	public room() {
		// TODO Auto-generated constructor stub
		this.action = new ArrayList<action>();
		this.item = new ArrayList<Item>();
		this.monster = new ArrayList<Monster>();
		this.direction = new HashMap<Direction , room>();
		this.exit = false;
	}

	public ArrayList<action> getActions() {
		return this.action;
	}
	/**
	 * 
	 * @param a l'action à ajouter dans la liste des actions de la salle
	 */
	public void addActions(action a) {
		this.action.add(a);
		
	}
	
	public boolean isExit() {
		return this.exit;
	}
	
	public void removeActions(action a) {
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
	
	public Item getItemWithIndex(int i) {
		return this.item.get(i);
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
	
	
	public Monster gettingMonster(int n) {
		return this.monster.get(n);
	}
	
	
	
	public room changeRoom (Direction d) {
		if (!this.direction.containsKey(d)) {
			System.out.println("Il y a pas de salle associé à cette direction");
		}
		return this.direction.get(d);
	}
	
	public ArrayList<action> getAllPossibilitiesActions() {
		ArrayList<action> res = new ArrayList<action>();
		for (action a: this.action) {
			if (a.isPossible()) {
				res.add(a);
			}
		}
		return res;
		
	}
	
	
	
	
}

/**
 * 
 */
package character;



import java.util.ArrayList;
import java.util.Map;

import action.action;
import exception.NoActionException;
import item.Item;
import room.Direction;
import room.room;

/**
 * @author amevigbe
 *
 */
public class Player extends Character{

	/**
	 * 
	 */
	
	public Player(String name, int nbreVie, int strength, int qtGold, room r) {
		super(name, nbreVie, strength, qtGold,r);
	}
	
	
	
	public ArrayList<action> getAllPossibilityAction(){
		return this.room.getActions();
	}
	
	public String descrition() {
		String res = "Vous disposez actuellement de" + this.nbreVie + " en point de vie"
				+ " et votre point de force est de " + this.nbreStrength ;
		
		return res;
	}
	
	public void descriptionActions() {
		System.out.println("Voici les actions possible de faire : ");
		for(action a : this.room.getAllPossibilitiesActions()) {
			System.out.println(a);
		}
		
		
	}
	
	public void doAction(action a) throws Exception{
		if (this.room.getAllPossibilitiesActions().contains(a)) {
			a.use();
		}
		
		else {
			throw new NoActionException("Cette action n'est pas présente");
		}
	}
	
	public ArrayList<Item> getRoomItem(){
		return this.room.getItem();
	}
	
	public void describeAllItemInroom() {
		ArrayList<Item> item = this.getRoomItem();
		System.out.println("Voici les Objests dont vous disposez pour battre l'adversaire");
		for(Item i: item) {
			System.out.println(i.toString());
	}
	}
	
	public boolean existItemInRoom() {
		ArrayList<Item> item = this.getRoomItem();
		return item.size() != 0;
	}
		
	public void giveGold(Player p, int g) {
		p.addGold(g);
	}
	
	public Map<Direction,room> getDirections(){
		return this.room.getDirection();
	}
	
	public void receiveGold(int g) {
		this.addGold(g);
	}
		
	public void addAction(action a) {
		this.room.addActions(a);
		
	}
	
	public void changeRoom(Direction d) {
		this.room = this.room.getDirection().get(d);
	}
	
	public void removeAction(action a) {
		this.room.removeActions(a);
	}
	
	

}

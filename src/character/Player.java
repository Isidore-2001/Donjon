/**
 * 
 */
package character;



import java.util.ArrayList;

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
	
	
	
	public ArrayList<Action> getAllPossibilityAction(){
		return this.room.getActions();
	}
	
	public void addAction(Action a) {
		this.room.addActions(a);
	}
	
	public String descrition() {
		String res = "Vous disposez actuellement de" + this.nbreVie + " en point de vie"
				+ " et votre point de force est de " + this.nbreStrength ;
		
		return res;
	}
	
	public void descriptionActions() {
		System.out.println("Voici les actions possible de faire : ")
		for(Action a : this.getAllPossibilityAction()) {
			System.out.println(a);
		}
		
		
	}
	
	public void doAction(Action a) throws NoActionException{
		if (this.getAllPossibilityAction().contains(a)) {
			a.realise(this);
		}
		
		else {
			throw new NoActionException();
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
		
	public void addAction(Action a) {
		this.room.addActions(a);
		
	}
	public void setAction(Action a, Action b) {
		this.room.getActions().set(a,b);
	}
	
	public void changeRoom(Direction d) {
		this.room = this.changeRoom(d);
	}
	
	public void removeAction(Action a) {
		this.room.removeActions(a);
	}
	
	

}

package character;
/**
 * 
 */

import room.Monster;
import room.room;

/**
 * @author amevigbe
 *
 */
public abstract class Character {

	/**
	 * 
	 */
	protected String name;
	protected int nbreVie;
	protected int nbreStrength;
	protected int qtGold;
	protected room room;
	
	public Character(String name, int nbreVie, int strength, int qtGold, room r) {
		
		// TODO Auto-generated constructor stub
		this.name = name;
		this.nbreStrength = strength;
		this.qtGold = qtGold;
		this.nbreVie = nbreVie;
		this.room = r;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public room getRoom() {
		return this.room;
	}
	
	public void setRoom(room r) {
		this.room = r;
	}
	
	public int getLife() {
		return this.nbreVie;
	}
	
	public int getGold() {
		return this.qtGold;
	}

	
	public void substractStrenght(int g) throws NotEnoughStrenghException{
		if(this.nbreStrength-g<0) {
			throw new  NotEnoughStrenghException();
		}
		this.nbreStrength-=g;
	}
	
	
	public boolean isDead() {
		return this.nbreVie <=0;
	}
	
	public void addGold(int gold) {
		this.qtGold+=gold;
	}
	
	public void addStrenght(int s) {
		this.nbreStrength+=s;
	}
	
	public void addLife(int l) {
		this.nbreVie+=l;
	}
	
	public void attack(Character c) throws NotMonsterInRoomException{
		if (!this.room.existMonster(c)) {
			throw new NotMonsterInRoomException();
			
		}
		if (!c.isDead()) {
			c.substractLife(this.nbreStrength);
		}
		else {
			this.room.removeMonster(c);
			this.addGold(c.getGold());
			System.out.println("Vous avez tué le monstre");
		}
		
		
	}
	
	public void substractLife(int s) {
		this.nbreVie-=s;
	}
}

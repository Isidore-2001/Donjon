package character;
/**
 * 
 */


import character.Monster;
import exception.NoMonsterException;
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
	
	
	
	public void attack(Character c) throws NoMonsterException{
		if (!this.room.isthereMonster()) {
			throw new NoMonsterException("Dans cette salle il y a pas de monstre");
			
		}
		if (!c.isDead()) {
			c.substractLife(this.nbreStrength);
		}
		else {
			this.room.removeMonster((Monster) c);
			this.addGold(c.getGold());
			System.out.println("Vous avez tué le monstre");
		}
		
		
	}
	
	public void substractLife(int s) {
		this.nbreVie-=s;
	}
}

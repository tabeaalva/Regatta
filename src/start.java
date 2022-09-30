

public class start {

	public static void main(String[] args) {
		
		competition c = new competition("Rotsee Regatta");
		
		ship ship1 = new ship(1, "Alinghi");
		ship ship2 = new ship(2, "Red Baron");
		ship ship3 = new ship(3, "Blue Lagoon");
		
		c.addShip(ship1);
		c.addShip(ship2);
		c.addShip(ship3);
		
		person person1 = new person("Tabea", "Reiffer", "Hotel");
		person person2 = new person("Sabrina", "Boccia", "Hotel");
		person person3 = new person("Peter", "Ruedi", "Motel");
		
		ship1.setOwner(person1);
		ship2.setOwner(person2);
		ship3.setOwner(person3);
		
		c.start();
	
		c.printResult();
	}	

}

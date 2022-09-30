

public class competition {
	private String name;
	private ship[] ships = new ship[5];

	public competition(String name) {
		this.name = name;
	}

	public void start() {

		for (ship s : this.ships) {
			if (s != null) {
				s.race();
			}
		}

	}

	public void addShip(ship ship) {
		for (int i = 0; i < ships.length; i++) {
			if (ships[i] == null) {
				ships[i] = ship;
				break;
			}
		}
	}

	public void printResult() {
		System.out.println("Wettkampf: " + this.name);

		for (ship s : this.ships) {
			if (s != null) {
				System.out.println("Schiff Nr: " + s.getNr() + " Name: " + s.getName() + " Zeit: " + s.getTime() + " Besitzer: " + s.getOwner().getFirstname() + " " + s.getOwner().getLastname() + " " + s.getOwner().getResidence());
			}
		}
	}
}

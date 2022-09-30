

public class ship {

		private int nr;
		private String name;
		private int time;
		private person owner;

		public ship(int nr, String name) {
			this.nr = nr;
			this.name = name;
		}

		public int getNr() {
			return nr;
		}

		public void setNr(int nr) {
			this.nr = nr;
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void race() {
			int min = 300;
			int max = 600;
			this.time = (int) (Math.random() * (max - min + 1)) + min;
		}
		
		public int getTime() {
			return time;
		}
		
		public person getOwner() {
			return owner;
		}
		
		public void setOwner(person owner) {
			this.owner = owner;
		}
}

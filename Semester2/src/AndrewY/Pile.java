package AndrewY;

public class Pile {
	int numCards;
	public Pile(int cards) {
		numCards = cards;
	}
	int getNCards() {
		return numCards;
	}
	void addCard() {
		numCards++;
	}
	void deductCard() {
		numCards--;
	}
}

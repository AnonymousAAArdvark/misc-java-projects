package AndrewY;
import java.util.ArrayList;

public class Solitaire {
	public static void main(String[] args) {
		int iterations = 0;
		int numPiles = (int)(Math.random() * 20 + 1);
		ArrayList<Pile> solitaire = new ArrayList<Pile>();
		for(int i = 0; i < numPiles; i++) {
			solitaire.add(new Pile(0));
		}
		for(int i = 0; i < 45; i++) {
			int pileIndex = (int)(Math.random() * solitaire.size());
			(solitaire.get(pileIndex)).addCard();
		}
		for(int i = solitaire.size()-1; i >= 0; i--) {
			if(solitaire.get(i).getNCards() == 0) {
				solitaire.remove(i);
			}
		}
		for(int i = 0; i < solitaire.size(); i++) {
			System.out.print(solitaire.get(i).getNCards() + " ");
		}

		boolean done = false;
		while(!done) {
			iterations++;
			for(int i = 0; i < solitaire.size(); i++) {
				solitaire.get(i).deductCard();
			}
			solitaire.add(0, new Pile(numPiles));
			for(int i = solitaire.size()-1; i >= 0; i--) {
				if(solitaire.get(i).getNCards() == 0) {
					solitaire.remove(i);
				}
			}
			int j = solitaire.size();
			for(int i = 0; i < solitaire.size(); i++) {
				if(solitaire.get(i).getNCards() != j) {
					break;
				}
				j--;
			}
			if(j == 0) {
				done = true;
			}
			System.out.println("\n");
			for(int i = 0; i < solitaire.size(); i++) {
				System.out.print(solitaire.get(i).getNCards() + " ");
			}
		}
		System.out.println("\n\nNumber of iterations: " + iterations);
	}

}

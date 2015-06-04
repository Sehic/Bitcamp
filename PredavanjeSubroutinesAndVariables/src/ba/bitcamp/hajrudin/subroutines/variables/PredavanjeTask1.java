package ba.bitcamp.hajrudin.subroutines.variables;

public class PredavanjeTask1 {

	public static void main(String[] args) {
		byte [] karte = new byte [52];
		for(int i = 0; i<52;i++){
			karte[i]= (byte)(i+1);
		}
		
		for(int i = 0; i < 52; i++){
			System.out.print(karte[i]+" ");
		}
		
		for(int brojMjesanja = 0; brojMjesanja<10;brojMjesanja++){
			for(int brojZamjena = 0; brojZamjena<15;brojZamjena++){
				int indexPrveKarte = (int)(Math.random()*52);
				int indexDrugeKarte = (int)(Math.random()*52);
				byte temp = karte[indexPrveKarte];
				karte[indexPrveKarte]=karte[indexDrugeKarte];
				karte[indexDrugeKarte]=temp;
				
			}
			System.out.println();
			for(int i = 0; i < 52; i++){
				System.out.print(karte[i]+" ");
			}
		}
		

	}

}

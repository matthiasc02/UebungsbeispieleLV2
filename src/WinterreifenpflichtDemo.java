
public class WinterreifenpflichtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Ausgabe="";
		boolean rutschigeFahrbahn = true;
		int temperatur = 12;

		if (isWinterreifenpflicht(temperatur,rutschigeFahrbahn)){
			Ausgabe="Bitte Winterreifen verwenden";
		} else {
			Ausgabe="Winterreifen sind nicht erforderlich";
		}
		System.out.println(Ausgabe);		
	}
	
	public static boolean isWinterreifenpflicht(int temperatur, boolean rutschigeFahrbahn){
		if (temperatur<10&&rutschigeFahrbahn){
			return true;
		}
		else if (temperatur<4){
			return true;	
		}
		else {
			return false;
		}
	}

}

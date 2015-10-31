
public class TurmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiplikator=2;
		int zahl=2;
		
		while(multiplikator<=9)
		{
			System.out.println(zahl +"*" + multiplikator + "=" + zahl*multiplikator);
			zahl=multiplikator*zahl;
			multiplikator++;
		}
		
		multiplikator=2;
		
		while(multiplikator<=9)
		{
			System.out.println(zahl +"/" + multiplikator + "=" + zahl/multiplikator);
			zahl=zahl/multiplikator;
			multiplikator++;	
		}

	}

}

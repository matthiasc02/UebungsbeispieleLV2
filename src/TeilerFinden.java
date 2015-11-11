
public class TeilerFinden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z=12;
		//int t=2;
	
		if (isPrimeNumber(z))
		{
			System.out.println("Die Zahl " + z + " ist eine Primzahl");
		}
		else
		{
			System.out.println("Die Zahl " + z + " ist keine Primzahl");
		}

	}
	public static boolean isPrimeNumber(int z)
	{	
		int t =2;
		int gefundeneTeiler = 0;
		
		//String ausgabe = "Die Teiler von "+z+" sind: ";
		
		//System.out.print("Die Teiler von "+ z + " sind: ");
		
		while(t<=z/2)
		{
			if(z % t == 0)
			{
				//System.out.print(t+", ");
				//ausgabe += t+", ";
				gefundeneTeiler++;
			}
			t++;
		}
		return (gefundeneTeiler == 0);
		//System.out.println(ausgabe);
		
	
	}

}

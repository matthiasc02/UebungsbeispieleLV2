
public class NotenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int punkte = 65;
		
		System.out.println("Der Notennamen lautet: "+ getNotentext(punkte));
		
		}
	public static String getNotentext(int punkte){
		if (punkte>=90)
		{
			return "Sehr Gut";
		}
		else if (punkte<=89 && punkte>=78)
		{
			return "Gut";
		}
		else if (punkte<=77 && punkte>=65)
		{
			return "Befriedigend";
		}
		else if (punkte<=64 && punkte>=51)
		{
			return "Genügend";
		}
		else
		{
			return "Ungenügend";
		}

	}

}

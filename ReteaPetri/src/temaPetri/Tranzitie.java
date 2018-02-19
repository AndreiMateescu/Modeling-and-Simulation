package temaPetri;

public class Tranzitie 
{
	int arc1 , arc2;
	Stare stare1 , stare2;
	
	public Tranzitie(int a , int b , Stare c , Stare d)
	{
		stare1 = c;
		stare2 = d;
		arc1 = a;
		arc2 = b;
	}
	
	public int checkArches(int tokens)
	{
		if (tokens >= arc1 && tokens >= arc2)
			return 1;
		return 0;
	}
	
	@Override
	public String toString() {
		return "indexul este:" + stare1 + "\n";
	}
	
	
}

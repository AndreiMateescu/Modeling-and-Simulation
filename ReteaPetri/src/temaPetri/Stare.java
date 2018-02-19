package temaPetri;

import java.util.ArrayList;
import java.util.List;

public class Stare {
	
	public int suma , stareIndex , tokens;
	List<Stare>stariUrmatoare = new ArrayList<Stare>();
	List<Tranzitie>tranzitiiUrmatoare = new ArrayList<Tranzitie>();

	public Stare(int a , int b)
	{
		tokens = b;
		suma = a;
		stareIndex = a;
	}
	
	public int getSuma()
	{
		return suma;
	}
	
	public void addTranzitie(Tranzitie a)
	{
		tranzitiiUrmatoare.add(a);
	}
	
	public void addStare(Stare a)
	{
		stariUrmatoare.add(a);
	}
	
	public int getIndex()
	{
		return stareIndex;
	}
	
	public List<Stare> getNodeList()
	{
		return stariUrmatoare;
	}
	
	public List<Tranzitie> getTranzitionsList()
	{
		return tranzitiiUrmatoare;
	}
	
	public int getTokens()
	{
		return tokens;
	}
	
	public void updateTokens(int val)
	{
		this.tokens += val;
	}


	@Override
	public String toString() {
		return "indexul este:" + suma + "\n";
	}

}

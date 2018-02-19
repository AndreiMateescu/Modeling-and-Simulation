package temaPetri;

import java.util.List;

public class SchimbaStarea 
{
	public Stare updateStare(Stare stareAux , int a)
	{
		List<Stare>stariAux = stareAux.getNodeList();
		List<Tranzitie>tranzitiiAux = stareAux.getTranzitionsList();
		
		for(int i = 0 ; i < stariAux.size(); i++)
		{
			if ( stareAux.getSuma() + a == stariAux.get(i).getSuma() && tranzitiiAux.get(i).checkArches(stareAux.getTokens()) == 1 )
			{
				stariAux.get(i).updateTokens(stareAux.getTokens());
				return stariAux.get(i);
			}
			
			if(a >= 4)
			{
				int aux = stareAux.getSuma() - a;
				System.out.println("restul este:"+aux+"\n");
				return stariAux.get(0);	
			}
		}
		return null;
	}
}

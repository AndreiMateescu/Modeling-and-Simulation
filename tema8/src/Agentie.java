import java.util.ArrayList;
import java.util.List;

public class Agentie {

    private List<Ghiseu> ghisee;

    public Agentie(){
        ghisee = new ArrayList<Ghiseu>();
    }

    public void deschidereGhiseu(Ghiseu ghiseu){
        ghisee.add(ghiseu);
    }

    public void addPersoana(int nrOrdine){
        boolean okay = false;
        for(Ghiseu ghiseu : ghisee){
            if(ghiseu.getAvailable()){
                ghiseu.persoanaNouaLaCoada(nrOrdine);
                okay = true;
            }
        }
        if (!okay){
            System.out.println("Toate ghiseele sunt full");
        }
    }
}

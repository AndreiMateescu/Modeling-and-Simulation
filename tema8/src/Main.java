import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> coadaOameni = new PriorityQueue<Integer>();
        coadaOameni.add(11);
        coadaOameni.add(3);
        coadaOameni.add(1);
        coadaOameni.add(10);
        coadaOameni.add(15);
        coadaOameni.add(9);
        coadaOameni.add(100);
        coadaOameni.add(50);

        Agentie agentie = new Agentie();
        Ghiseu ghiseu1 = new Ghiseu(2);
        Ghiseu ghiseu2 = new Ghiseu(3);
        Ghiseu ghiseu3 = new Ghiseu(1);
        agentie.deschidereGhiseu(ghiseu1);
        agentie.deschidereGhiseu(ghiseu2);
        agentie.deschidereGhiseu(ghiseu3);

        agentie.addPersoana(coadaOameni.poll());
        agentie.addPersoana(coadaOameni.poll());
        agentie.addPersoana(coadaOameni.poll());
        agentie.addPersoana(coadaOameni.poll());
        agentie.addPersoana(coadaOameni.poll());
        agentie.addPersoana(coadaOameni.poll());

        ghiseu1.displayPeople();
    }
}

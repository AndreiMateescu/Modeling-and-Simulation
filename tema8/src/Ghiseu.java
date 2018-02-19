import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ghiseu {

    private int size;
    private Queue<Integer> people; //nr Ordine
    private boolean isAvailable;

    public Ghiseu(int size){
        this.people = new PriorityQueue<Integer>();
        this.size = size;
        this.isAvailable = true;
    }

    public void persoanaNouaLaCoada(int id){
        if(people.size() < size){
            people.add(id);
            isAvailable = true;
        }else {
            System.out.println("Ghiseu full");
            isAvailable = false;
        }
    }

    public boolean getAvailable(){
        return this.isAvailable;
    }

    public int getPersoana(){
        return people.poll();
    }

    public void displayPeople(){
        for (Integer persoana : people){
            System.out.println(persoana);
        }
    }
}

public class Stare {

    int amount;
    boolean stareFinala;
    boolean stareInitiala;
    int rest;

    public Stare(){
        this.amount = 0;
        this.stareFinala = false;
        this.stareInitiala = true;
        this.rest = 0;
    }

    public void reset(){
        this.amount = 0;
        this.stareFinala = false;
        this.stareInitiala = true;
    }

    public void resetAmount(){
        this.amount = 0;
    }
    public void resetRest(){this.rest = 0;}
}

public class Main {

    public static void schimbaStare(Stare stare1, int bani, int sumaNecesara){

        if(stare1.amount > sumaNecesara) {
            System.out.println("Imposibil");
            return;
        }

        stare1.amount = stare1.amount + bani;
        stare1.stareInitiala = false;

        if(stare1.amount > sumaNecesara){
            stare1.stareFinala = true;
            stare1.rest = stare1.amount - sumaNecesara;
            stare1.resetAmount();
        }

        if (stare1.amount == sumaNecesara){
            stare1.stareFinala = true;
            stare1.resetAmount();
        }
    }

    public static void main(String[] args) {

        Stare stare = new Stare();
        int target = 20;
        schimbaStare(stare, 5, target);
        System.out.println("Amount: " + stare.amount + " -> Stare Initiala: " + stare.stareInitiala + " -> Stare Finala "
                + stare.stareFinala + " -> Rest: " + stare.rest);
        schimbaStare(stare, 10, target);
        System.out.println("Amount: " + stare.amount + " -> Stare Initiala: " + stare.stareInitiala + " -> Stare Finala "
                + stare.stareFinala + " -> Rest: " + stare.rest);
        schimbaStare(stare, 10, target);
        System.out.println("Amount: " + stare.amount + " -> Stare Initiala: " + stare.stareInitiala + " -> Stare Finala "
                + stare.stareFinala + " -> Rest: " + stare.rest);
    }
}

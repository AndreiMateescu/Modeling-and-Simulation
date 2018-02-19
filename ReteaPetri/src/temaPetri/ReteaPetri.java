package temaPetri;

import java.util.ArrayList;
import java.util.List;

public class ReteaPetri {
    List<Stare> VectorStari = new ArrayList<Stare>();
    List<Tranzitie> VectorTranzitii = new ArrayList<Tranzitie>();

    public int a, b, ciocolata1, ciocolata2, ciocolata3;
    public static Stare currentState;

    SchimbaStarea schimbatorDeStari = new SchimbaStarea();

    public ReteaPetri(int i1, int i2, int i3, int i4, int i5) {
        a = i1;
        b = i2;
        ciocolata1 = i3;
        ciocolata2 = i4;
        ciocolata3 = i5;
        VectorStari.add(new Stare(0, 1));
        buildMap(a, b, ciocolata1, ciocolata2, ciocolata3);
        currentState = VectorStari.get(0);
    }

    public void buildMap(int i1, int i2, int i3, int i4, int i5) {
        for (int i = 0; i < VectorStari.size(); i++) {
            int ok = 0;
            Stare stareAux = null;
            Tranzitie tranzitieAux = null;
            if (VectorStari.get(i).getSuma() + this.a <= ciocolata3) {
                for (int j = 0; j < VectorStari.size(); j++) {
                    if (VectorStari.get(j).getSuma() == VectorStari.get(i).getSuma() + this.a) {
                        stareAux = VectorStari.get(j);
                        tranzitieAux = new Tranzitie(1, 1, VectorStari.get(i), VectorStari.get(j));
                        ok = 1;
                        break;
                    }
                }


                if (ok == 1) {
                    VectorTranzitii.add(tranzitieAux);
                    VectorStari.get(i).addStare(stareAux);
                    VectorStari.get(i).addTranzitie(tranzitieAux);
                } else {
                    Stare stareNoua = new Stare(VectorStari.get(i).getSuma() + this.a, 0);
                    Tranzitie tranzitieNoua = new Tranzitie(1, 1, VectorStari.get(i), stareNoua);
                    VectorTranzitii.add(tranzitieNoua);
                    VectorStari.add(stareNoua);
                    VectorStari.get(i).addTranzitie(tranzitieNoua);
                    VectorStari.get(i).addStare(stareNoua);
                }
            }
            ok = 0;


            //caz2
            if (VectorStari.get(i).getSuma() + this.b <= ciocolata3) {
                for (int j = 0; j < VectorStari.size(); j++) {
                    if (VectorStari.get(j).getSuma() == VectorStari.get(i).getSuma() + this.b) {

                        stareAux = VectorStari.get(j);
                        tranzitieAux = new Tranzitie(1, 1, VectorStari.get(i), VectorStari.get(j));
                        ok = 1;
                        break;
                    }
                }


                if (ok == 1) {
                    VectorTranzitii.add(tranzitieAux);
                    VectorStari.get(i).addStare(stareAux);
                    VectorStari.get(i).addTranzitie(tranzitieAux);
                } else {
                    Stare stareNoua = new Stare(VectorStari.get(i).getSuma() + this.b, 0);
                    Tranzitie tranzitieNoua = new Tranzitie(1, 1, VectorStari.get(i), stareNoua);
                    VectorTranzitii.add(tranzitieNoua);
                    VectorStari.add(stareNoua);
                    VectorStari.get(i).addTranzitie(tranzitieNoua);
                    VectorStari.get(i).addStare(stareNoua);
                }
            }

        }
        for (int i = 0; i < VectorStari.size(); i++) {
            if (VectorStari.get(i).getSuma() >= ciocolata1) {
                VectorStari.get(i).addStare(VectorStari.get(0));
            }
        }
        //System.out.println(VectorStari);
    }

    public void compute(int value) {
        //	System.out.println(VectorStari.get(1).getSuma);
        currentState = schimbatorDeStari.updateStare(currentState, value);
        System.out.println(currentState);

    }
}

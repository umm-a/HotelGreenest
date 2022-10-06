package Inlämningsuppgift1;

import javax.swing.*;

public class Köttätande extends Växt {//samtliga växtsorter får ju interfacet "Vattna" eftersom de ärver från "Växt"
    private String köttätandeBlandning = Vattensort.PROTEINDRYCK.finaBokstäver;
    private double proteindryck = 0.2;

    Köttätande(double längd, String namn){
        super(längd, namn);
    }//arv

    protected double totalVätska(){
        return (0.1+(proteindryck*getLength()));
    }
    public double getProteindryck() {
        return proteindryck;
    }

    @Override
    public void bevattning(){//polymorfism exempel - olika sätt att köra bevattning() i vardera subklass + dynamisk bindning -> denna metod väljs före bevattning() i Växt som väljs före bevattning() i Vattna
        JOptionPane.showMessageDialog(null, getName() + " ska få " + totalVätska() + " liter " + köttätandeBlandning + "/dag.");
    }

}

package Inlämningsuppgift1;

import javax.swing.*;

public class Kaktus extends Växt {//samtliga växtsorter får interfacet "Vattna" eftersom de ärver från "Växt"
    private String kaktusBlandning = Vattensort.MINERALVATTEN.finaBokstäver;

    Kaktus(double längd, String namn) {
        super(längd, namn);
    }//arv

    protected double totalVätska(){
        return 0.2;
    }
    @Override
    public void bevattning() {//polymorfism exempel - olika sätt att köra bevattning() i vardera subklass + dynamisk bindning -> denna metod väljs före bevattning() i Växt som väljs före bevattning() i Vattna
        JOptionPane.showMessageDialog(null, getName() + " ska få " + totalVätska() + " cl " + kaktusBlandning + "/dag.");
    }
}

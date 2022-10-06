package Inlämningsuppgift1;

import javax.swing.*;

public class Palm extends Växt{//samtliga växtsorter får ju interfacet "Vattna" eftersom de ärver från "Växt"
    private String palmBlandning = Vattensort.KRANVATTEN.finaBokstäver;//finaBokstäver ger finare text än KRANVATTEN som enbart har stora versaler
    Palm(double längd, String namn){
        super(längd, namn);
    } //arv

    protected double totalVätska(){
        return (0.5*getLength());
    }

    @Override
    public void bevattning() { //polymorfism exempel - olika sätt att köra bevattning() i vardera subklass + dynamisk bindning -> denna metod väljs före bevattning() i Växt som väljs före bevattning() i Vattna
        JOptionPane.showMessageDialog(null, getName() + " ska få " + totalVätska() + " liter " + palmBlandning + "/dag.");
    }
}

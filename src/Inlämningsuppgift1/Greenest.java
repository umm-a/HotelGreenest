package Inlämningsuppgift1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class Greenest {
    Greenest() {
        Köttätande Meatloaf = new Köttätande(0.7, "Meatloaf");
        Kaktus Igge = new Kaktus(0.2, "Igge");
        Palm Laura = new Palm(5, "Laura");
        Palm Putte = new Palm(1, "Putte");

        List<Växt> olikaVäxter = new ArrayList<>();
        olikaVäxter.add(Meatloaf);
        olikaVäxter.add(Igge);
        olikaVäxter.add(Laura);
        olikaVäxter.add(Putte);

        String olikaVäxterTillMeddelanderuta = "";

        for (Växt v: olikaVäxter) {
            if(olikaVäxter.indexOf(v)==olikaVäxter.size()-1){
                olikaVäxterTillMeddelanderuta += "och " + v.getName() + " ";
            }else if(olikaVäxter.indexOf(v)==olikaVäxter.size()-2){
                olikaVäxterTillMeddelanderuta += v.getName() + " ";
            } else
            olikaVäxterTillMeddelanderuta += v.getName() + ", ";
        }

        String userChoice;
        boolean okName = false;
        boolean runLoop = true;

        while (runLoop == true) {
            okName=false;
                userChoice = JOptionPane.showInputDialog(null, "- För att stänga programmet, klicka \"OK\" eller tryck Enter utan input -\n" +
                      olikaVäxterTillMeddelanderuta + "finns på hotellet!\nVilken växt ska få vätska?");

            if(userChoice.equals("")){
                runLoop=false;
            }
            for (int i = 0; i < olikaVäxter.size(); i++) {
                if (olikaVäxter.get(i).getName().equals(userChoice)) {
                    okName=true;
                    olikaVäxter.get(i).bevattning();//inkapsling - vi ser inte här vad som finns i exempelvis bevattningsmetoden, utan det ligger undangömt. Vi behöver bara anropa!
                }
            }
            if (okName == false && runLoop==true) {
                JOptionPane.showMessageDialog(null, "Woops! \nFel namn? Försök igen!");
            }
        }
    }
        public static void main (String[] args){
            Greenest welcomeToGreenest = new Greenest();
        }
}

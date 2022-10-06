package Inlämningsuppgift1;

public class Växt implements Vattna{
    private double length;
    private String name;

    Växt(double längden, String namnet){
        this.length = längden;
        this.name = namnet;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {//denna används för enhetstester
        this.length = length;
    }

    @Override
    public void bevattning() {
    }
}

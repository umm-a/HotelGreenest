package Inlämningsuppgift1;

public enum Vattensort {//med enums begränsar vi vilka sorters vätska en växt kan få
    KRANVATTEN ("Kranvatten"),
    PROTEINDRYCK ("Proteindryck"),
    MINERALVATTEN ("Mineralvatten");

    public final String finaBokstäver;
    Vattensort(String b){
        finaBokstäver = b;
    }
}

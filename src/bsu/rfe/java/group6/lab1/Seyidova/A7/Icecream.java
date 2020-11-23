package bsu.rfe.java.group6.lab1.Seyidova.A7;

public class Icecream extends Food{
    private String sirup;
        public Icecream(String sirup)
        {
            super("Icecream");
            this.sirup = sirup;
        }
        public void consume() {
            System.out.println(name + " с сиропом '" + sirup.toUpperCase() + "' съедено!");
    }
public String getSirup(){return sirup;}
public void setSirup(String sirup){this.sirup=sirup;}
    public String toString() {
        return super.toString() + " с сиропом '" + sirup.toUpperCase() + "'";
    }
}

package bsu.rfe.java.group6.lab1.Seyidova.A7;

public class Apple extends Food
{
    private final String size;
    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }
    public void consume() {
        System.out.println(name + " размера '" + size.toUpperCase() + "' съеден!");
    }
}


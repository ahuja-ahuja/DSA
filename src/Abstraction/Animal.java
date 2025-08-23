package Abstraction;

public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    abstract void move(String speed);
    abstract void makeNoise();

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
}

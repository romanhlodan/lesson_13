package ua.com.hrv;

public class Person {
    private int weight;
    private int height;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}

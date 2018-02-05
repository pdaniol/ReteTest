package pl.edu.agh;

public class Person {
    private int age;
    private double money;
    private String desiredProduct;


    public Person() {}

    public Person(int age, double money, String desiredProduct) {
        this.age = age;
        this.money = money;
        this.desiredProduct = desiredProduct;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDesiredProduct() {
        return desiredProduct;
    }

    public void setDesiredProduct(String desiredProduct) {
        this.desiredProduct = desiredProduct;
    }
}
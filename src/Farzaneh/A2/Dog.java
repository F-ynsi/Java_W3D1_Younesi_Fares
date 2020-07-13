package Farzaneh.A2;

public class Dog {

    private String name;
    private int age;
    private int weight;
    private String race;


    public Dog() {
    }

    public void doWoof() {
        System.out.println("Woof!");
    }


    public int getAge() {
        return age;
    }


    public void setAge(int newAge) {
        this.age = newAge;
    }


}

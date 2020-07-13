package Farzaneh.A1;

public class Main {
    public static void main(String[] args) {

        Employee p1 = new Employee("Eva","Younesi",1990, 5000);

        p1.setName("Farzaneh");
        System.out.println(p1.getName());

        p1.setSalary(10000);
        System.out.println(p1.getSalary());

        p1.setYearOfBirth(1989);
        System.out.println(p1.getYearOfBirth());

        p1.setSurname("YNI");
        System.out.println(p1.getSurname());

    }
}

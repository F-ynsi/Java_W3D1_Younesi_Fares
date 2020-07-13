package Farzaneh.A1;

class Employee {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int salary;


    //constructor

    public Employee(String name, String surname, int yearOfBirth, int salary) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }


    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return this.name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }


    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }


}
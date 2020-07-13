package Farzaneh.A3;

public class Student {
    private String fullName;
    private int yearOfbirth;
    private int age;
    private String classNum;


    //constructor
    public Student (String fullName, int yearOfbirth, int age, String classNum) {
        this.fullName = fullName;
        this.yearOfbirth = yearOfbirth;
        this.age = age;
        this.classNum = classNum;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }


    public void setYearOfbirth(int yearOfbirth) {
        this.yearOfbirth = yearOfbirth;
    }
    public int getYearOfbirth() {
        return yearOfbirth;
    }


    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }
    public String getClassNum() {
        return classNum;
    }


}



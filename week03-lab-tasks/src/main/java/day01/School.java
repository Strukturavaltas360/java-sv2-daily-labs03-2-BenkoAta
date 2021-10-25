package day01;

public class School {
    public static void main(String[] args) {
        Students students = new Students();
        students.addHeight(150);
        students.addHeight(152);
        students.addHeight(154);
        students.addHeight(156);
        students.addHeight(158);
        students.addHeight(160);
        System.out.println(students.isHeightIncreasing());
        students.addHeight(140);
        students.addHeight(162);
        System.out.println(students.isHeightIncreasing());
    }
}

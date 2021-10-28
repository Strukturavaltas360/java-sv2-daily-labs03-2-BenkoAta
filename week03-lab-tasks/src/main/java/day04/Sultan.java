package day04;

public class Sultan {
    public static void main(String[] args) {
        Prison prison = new Prison(100);
        prison.openFreeCells();
        System.out.println("A végén kinyitott cellák: " + prison.toString());
    }
}

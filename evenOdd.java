package bitManipulation;

public class evenOdd {
    public static void main(String[] args) {
        int y = 3;
        int bit = 1;
        if ((y&bit) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}

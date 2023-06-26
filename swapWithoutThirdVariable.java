package bitManipulation;

public class swapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 77;
        int b = 88;
        System.out.println("before: "+a+" "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after: "+a+" "+b);
    }
}

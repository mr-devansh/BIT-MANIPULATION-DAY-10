package bitManipulation;

public class powerOfTwo {
    public static void main(String[] args) {
        int z = 15;
        if ((z&(z-1))==0) {
            System.out.println("power of two");
        }else{
            System.out.println("not");
        }
    }
}

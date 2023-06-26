package bitManipulation;

public class countOnes {
    public static void main(String[] args) {
        int z = 6;
        int count = 0;
        while(z>0){
            if ((z&1)==1) {
                count++;
            }
            z=z>>1;
        }
        System.out.println(count);
    }
}

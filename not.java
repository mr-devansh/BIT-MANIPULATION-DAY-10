    package bitManipulation;
// also known as one's compliment
public class not {
    public static void main(String[] args) {
        System.out.println(~6);
    }
}
// bit 1 gives 0 ,0 gives 1
// 00000101
// ^      ^
// MSB    LSB
// MSB: most significant bit, 0 for positive, 1 for negative
// LSB: least significant bit
// hence 1's compilment might provide wrong answer hence we find out the two's compliment
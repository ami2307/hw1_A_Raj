public class TestBinary {
    public static void main(String[] args) {
        BinaryNumber b1 = new BinaryNumber("1011"); 
        BinaryNumber b2 = new BinaryNumber("1110"); 

        System.out.println("b1 = " + b1.toString()); 
        System.out.println("b2 = " + b2.toString());

        System.out.println("b1 decimal = " + b1.toDecimal());
        System.out.println("b2 decimal = " + b2.toDecimal()); 

        // Add
        b1.add(b2);
        System.out.println("b1 + b2 = " + b1.toString());

        // Reset overflow and shift
        b1.clearOverflow();
        b1.shiftR(3);
        System.out.println("b1 shifted right by 3 = " + b1.toString());
    }
}

public class Dec_Bin_Oct_Hex_Formats {
    public static void main(String[] args) {

        int dec = 125; // no prefix, decimal literal
        int bin = 0b1111101; // 0b prefix, binary literal
        int oct = 0175; // 0 prefix, octal literal
        int hex = 0x7D; // 0x prefix, hexadecimal literal

        System.out.println("decimal = " + dec);
        System.out.println("binary = " + bin);
        System.out.println("octal = " + oct);
        System.out.println("hexadecimal = " + hex);
    }
}

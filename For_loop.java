public class For_loop {
    public static void main(String[] args) {

        int start = 3;
        int end = 8;

        for (int i = start; i <= end; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.println(i + "\t" + square + "\t" + cube);
        }
    }
}

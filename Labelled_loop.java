public class Labelled_loop {
    public static void main(String[] args) {

        MyOuterLoop:
        for(int i=1;i<=10;i++){
            MyInnerLoop:
            for(int j=1;j<=10;j++){
                int multiplication=i*j;
                System.out.println(i+" x "+j+" = "+multiplication);
                if(multiplication>=15) {
                    System.out.println("--------------------------");
                    break MyOuterLoop;
                }
            }
            System.out.println("--------------------------");
        }

    }
}

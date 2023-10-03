public class Logical_operator {
    public static void main(String[] args) {

        boolean a=true;
        boolean b=false;
        System.out.println("a&&b="+(a&&b));
        System.out.println("a||b="+(a||b));
        System.out.println("!(a||b)="+!(a||b));


        boolean wearingGlass=false;
        int hight=75;
        char sex='M';

        boolean canApply=!wearingGlass &&hight>65&&sex=='M';
        System.out.println("Student can apply : "+canApply);


        char camAState='O';
        char camBState='H';
        boolean canMonitor=camAState=='O'||camBState=='O';
        System.out.println("Room can be monitored : "+canMonitor);
        
    }
}

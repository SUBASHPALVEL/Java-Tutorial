package Enums;

public enum Paper implements Comparison{

    A1(594, 841),
    A2(420, 594),
    A3(297, 420),
    A4(210, 297),
    A5(148, 210){

        @Override
        public double getArea() {
            return super.getArea()/100;
        }
    };

    private int width;
    private int length;

    Paper(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public int compare(Paper paper) {

        int firstArea= this.width* this.width;
        int secondArea = paper.getWidth() * paper.getLength();
        if(firstArea==secondArea)return 0;
        if(firstArea>secondArea)return 1;
        return 2;
    }

    public double getArea(){
        return this.length*this.width;
    }

    @Override
    public String toString() {
        return super.toString() + ":" + width + " X " + length;
    }
}

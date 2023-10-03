public class Advanced_looping {
    public static void main(String[] args){
        int[][] myTwoDimArray = {{0, 1, 2}, {3, 4, 5}};

        for (int[] myRows : myTwoDimArray)
            for (int number : myRows)
                System.out.println(number);

        
        int[][][] myThreeDimArray = {{{0, 1, 2}, {3, 4, 5}}, {{6, 7, 8}, {9,10, 11}}};
    
        for (int[][] twoDArray : myThreeDimArray)
            for (int[] myRows : twoDArray)
                for (int number : myRows)
                    System.out.println(number);
    }
}

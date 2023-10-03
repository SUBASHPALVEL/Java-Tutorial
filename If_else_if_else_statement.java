public class If_else_if_else_statement {
    public static void main(String[] args) {

        int grade=51;
        char letterGrade;
        if(grade<0||grade>100){
            letterGrade='N';
        }else if(grade>85){
            letterGrade='A';
        }else if(grade>65){
            letterGrade='B';
        }else if(grade>50){
            letterGrade='C';
        }else if(grade>40){
            letterGrade='D';
        }else{
            letterGrade='E';
        }
        System.out.println("Grade = "+grade);
        System.out.println("Letter Grade = "+letterGrade);


    }
}

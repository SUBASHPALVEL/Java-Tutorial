import java.util.Arrays;

public class TestPassByValueByReference {
    public static void main(String[] args) {
        int myInt = 5;
        float myFloat = 5.5f;


        System.out.println("before method call myInt:" + myInt);
        System.out.println("before method call myFloat:" + myFloat);
        change(myInt, myFloat);

        System.out.println("after method call myInt:" + myInt);
        System.out.println("after method call myFloat:" + myFloat);


        Cat myCat = new Cat();
        myCat.name = "Oliver";
        myCat.gender = 'M';
        myCat.age = 5;

        System.out.println("before method call myCat.name:" + myCat.name);
        System.out.println("before method call myCat.gender:" + myCat.gender);
        System.out.println("before method call myCat.age:" + myCat.age);
        change(myCat);

        System.out.println("after method call myCat.name:" + myCat.name);
        System.out.println("after method call myCat.gender:" + myCat.gender);
        System.out.println("after method call myCat.age:" + myCat.age);

        int[] myArray = {1, 2, 3};

        System.out.println("before method call myArray:" + Arrays.toString(myArray));

        changeArray(myArray);

        System.out.println("after method call myArray:" + Arrays.toString(myArray));

    }

    public static void change(int intNum, float floatNum) {
        intNum = 100;
        floatNum = 100.0f;
        System.out.println("Inside the method body intNum :" + intNum);
        System.out.println("Inside the method body floatNum :" + floatNum);
    }

    public static void change(Cat cat) {

        cat.name = "Lexi";
        cat.gender = 'F';
        cat.age = 10;
        System.out.println("inside method call cat.name:" + cat.name);
        System.out.println("inside method call cat.gender:" + cat.gender);
        System.out.println("inside method call cat.age:" + cat.age);
    }


    public static void changeArray(int[] array){

        if(array!=null)
            for(int i=0;i<array.length;i++)

                array[i]=array[i]*2;

    }
}

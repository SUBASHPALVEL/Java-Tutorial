package Reflection;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class AccessingConstructors {
    public static void main(String[] args) {
        try{
        Class<?> cls = Class.forName("Reflection.Student");
        System.out.println("-------------------To get constructor with 2 args----------------");
        Constructor<?> constructor = cls.getConstructor(int.class, String.class);
        System.out.println("constructor: " + constructor.toString());
        Student Subash = (Student)constructor.newInstance(100,"Don");
        Subash.showValue();

        System.out.println("--------------------------------Getting all public constructorsof the class--------------------------------");
        Constructor<?>[] constructors = cls.getConstructors();
        System.out.println("Constructors: " + Arrays.toString(constructors));

        System.out.println("--------------------------------To get private constructors--------------------------------");
        constructor = cls.getDeclaredConstructor();
        System.out.println("constructors: " + constructor.toString());

        System.out.println("--------------------------------To get all public,protected, default and private constructor--------------------------------");
        Constructor<?>[] constructors2 =cls.getDeclaredConstructors();
        System.out.println("constructors2: " + Arrays.toString(constructors2));

    }
        catch(Exception e){
        e.printStackTrace();
    }
    }
   
 }

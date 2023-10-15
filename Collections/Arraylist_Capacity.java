package Collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Arraylist_Capacity {
    public static void main(String[] args) throws Exception {

   
        ArrayList<Integer> integerList = new ArrayList<>();

        System.out.println("Size: " + integerList.size());
        System.out.println("Capacity:" + getCapacity(integerList));

        integerList.add(0);
        System.out.println("Size: " + integerList.size());
        System.out.println("Capacity:" + getCapacity(integerList));

        for (int i = 1; i <= 9; i++)
            integerList.add(i);

        System.out.println("Size: " + integerList.size());
        System.out.println("Capacity:" + getCapacity(integerList));

        integerList.add(10);
        System.out.println("Size: " + integerList.size());
        System.out.println("Capacity:" + getCapacity(integerList));

        integerList.remove(10);

        integerList.remove(9);

        System.out.println("Size: " + integerList.size());
        System.out.println("Capacity:" + getCapacity(integerList));
   
        integerList.trimToSize();
      
        System.out.println("Size: " + integerList.size());
        System.out.println("Capacity:" + getCapacity(integerList));

        integerList.ensureCapacity(100);
      
        System.out.println("Size: " + integerList.size());
        System.out.println("Capacity:" + getCapacity(integerList));

        integerList = new ArrayList<>(200);
       
        System.out.println("Size: " + integerList.size());
        System.out.println("Capacity:" + getCapacity(integerList));

    }
    static int getCapacity(List al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}


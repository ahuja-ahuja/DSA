package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Theory {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
      //  System.out.println(list.indexOf(2));

        //in for each loop if you try to modify the list you will get an error so that's why use the iterator

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            if(it.next()==9){
                list.remove(it.next());
            }
        }

        //foreach
        list.forEach(a -> System.out.println(a));

    }
}

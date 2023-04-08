package javaConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericValue {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(8);        list.add(1);        list.add(6);        list.add(3);
        list.add(4);        list.add(9);        list.add(5);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);


        //Stream
        int sum = list.stream()
                .filter(number -> number % 2==0)
                .map(number -> number +5)
                .reduce(0 , Integer::sum);
        System.out.println(sum);
    }

}

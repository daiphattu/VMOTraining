package fa.training.dsa.unit02;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_List {
    public static LinkedList merge(LinkedList list1, LinkedList list2){
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;
    }
}

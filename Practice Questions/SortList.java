// Sort a list of strings using:
// Anonymous class
// Lambda
// Method reference

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static void main(String[] args) {
     
        List<String> names = Arrays.asList("Suraj", "Amit", "Rohit", "Karan");

        // 1️ Using Anonymous Class
        List<String> list1 = new ArrayList<>(names);
        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Sorted (Anonymous Class): " + list1);

        // 2️ Using Lambda Expression
        List<String> list2 = new ArrayList<>(names);
        Collections.sort(list2, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted (Lambda): " + list2);

        // 3️ Using Method Reference
        List<String> list3 = new ArrayList<>(names);
        Collections.sort(list3, String::compareTo);
        System.out.println("Sorted (Method Reference): " + list3);

        // 4️ Using List.sort() with Lambda
        List<String> list4 = new ArrayList<>(names);
        list4.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted (List.sort + Lambda): " + list4);

        // 5️ Using List.sort() with Method Reference
        List<String> list5 = new ArrayList<>(names);
        list5.sort(String::compareTo);
        System.out.println("Sorted (List.sort + Method Reference): " + list5);
               


    }
    
}

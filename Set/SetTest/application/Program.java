package Set.SetTest.application;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");


        set2.add("TV");
        set2.add("Notebook");
        set2.add("Tablet");

        System.out.println(set.contains("Notebook"));
        set.remove("Tablet");
        System.out.println(set.equals(set2));

        for(String p : set) {
            System.out.println(p);
        }

    }   
    
    
}

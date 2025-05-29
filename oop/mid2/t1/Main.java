package oop.mid2.t1;

import java.util.*;

/**
 * This program takes list3, then repeatedly removes the element at index 0,
 * then at the next index 1 (after shifting), alternating removals,
 * effectively removing every other element starting from the first.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list3 = new ArrayList<>(Arrays.asList(
            "bdPR1", "LNR", "uV6cs", "LNR", "LNR", "pX9", "pX9", "bdPR1",
            "5WvS", "uV6cs", "pX9", "Im2U", "LNR"
        ));

        int index = 0;
        while (index < list3.size()) {
            list3.remove(index);  // remove element at current index
            index++;              // skip next element by moving index forward by 1
        }

        System.out.println("Filtered list3:");
        for (String s : list3) {
            System.out.println(s);
        }
    }
}

package d_data_structures;

import java.util.ArrayList;
import java.util.Comparator;

public class MyLists {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Han Solo");
        names.add("Luke Skywalker");
        names.add("Darth Vader");
        names.add("C-3PO");
        names.add("Leia Organa");
        names.add("Obi Wan Kenobi");

        System.out.println("Names list:" + names);
        System.out.println("Last element of the list: " + names.get(names.size() - 1));

        ArrayList<String> temp = new ArrayList<>();
        for(int i = names.size()-1; i >= 0; i--){
            temp.add(names.get(i));
        }

        System.out.println("List in reverse order: " + temp);

        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted ArrayList: " + names);

        System.out.println("First element of the list: " + names.get(0));
    }

}

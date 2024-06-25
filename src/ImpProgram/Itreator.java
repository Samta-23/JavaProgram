package ImpProgram;
import java.util.ArrayList;
import java.util.Iterator;

public class Itreator {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        
        // Get an iterator for the ArrayList
        Iterator<String> iterator = arrayList.iterator();
        
        // Iterate over the elements using the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}

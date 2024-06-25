package ImpProgram;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildSmallerArray {

	public static void main(String[] args) {
		
		Integer []arr = {1,2,3,1,4,5,6,4,1,5};
		Map <Integer, List<Integer>>m = new HashMap<Integer, List<Integer>>();
		
		for (int i=0; i< arr.length;i++) {
			List l = null;
			if(m.get(arr[i]) != null) {		
				l = m.get(arr[i]);
				
			}else {
				l = new ArrayList<Integer>();
			}
			l.add(arr[i]);
			m.put(arr[i], l);
		}
		
		
		for (Map.Entry<Integer, List<Integer>> entry : m.entrySet()) {
			List <Integer>temp = entry.getValue();
			Integer[] ar1 = temp.stream().toArray(Integer[] ::new);
			System.out.print("Array for " + entry.getKey() + " is :[");
			
			for (Integer x : ar1) {
	            System.out.print(x + " ");
			}
			System.out.print("]\n");
	    }
		
	}
}

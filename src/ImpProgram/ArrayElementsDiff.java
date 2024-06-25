package ImpProgram;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementsDiff {

	public static void main(String[] args) {
		
		Integer []arr = {1,2,3,1,4,5,6,4,1,5};
		Map <Integer, Integer>m = new HashMap<>();
		
		for (int i=0; i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					int temp = j-i;
					if(m.get(arr[i])!= null) {
						if((int)m.get(arr[i]) > temp) {
							m.put((Integer)arr[i], temp);
						}
					}else {
						m.put((Integer)arr[i], temp);
					}
					break;
				}
			}
		}
		for(int i: m.keySet())
			System.out.println(i+" "+m.get(i));
		
		//for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
	      //  System.out.println("Minimum distance of : " + entry.getKey() + " from other elements in array is " + entry.getValue());
	    }
		
	}

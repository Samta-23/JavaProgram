package CodingTest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class FrequecyStringAMit {
	

		public static void main(String[] args) {
			
			Character []arr = {'e','e','f','g','g','h','h','h','e','e'};
			
			
			List<Character> list = Arrays.asList(arr);

			//list.sort(Comparator.comparing(i -> Collections.frequency(list, i)).reversed());
			list.sort(Comparator.comparing(i -> Collections.frequency(list, i)));

			System.out.println(list);
					
		}
		
	}


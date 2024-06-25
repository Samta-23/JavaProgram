package ImpProgram;

import java.util.*;
public class SuffleArray {
public static void main (String []s)
{
	int[] array = { 1, 2, 3, 4, 5, 6, 7 };

	Random rand = new Random();

	for (int i = 0; i < array.length; i++) {
		int randomIndexToSwap = rand.nextInt(array.length);
		System.out.println(randomIndexToSwap);
		int temp = array[randomIndexToSwap];
		array[randomIndexToSwap] = array[i];
		array[i] = temp;
	}
	//for (int i = 0; i < array.length; i++) 
	//System.out.println(array[i]);
}
}

package pck;


	public class LonelyInteger1 {
	    public static int findLonelyInteger(int[] nums) {
	        int lonely = 0;
	        for (int num : nums) {
	        	System.out.println("before for : lonely " + lonely+" mun "+num);
	            lonely ^= num;
	            System.out.println("The lonelyin for : " + lonely);
	        }
	        return lonely;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 1, 2, 3, 4, 3}; // Example input array
	        int lonelyInteger = findLonelyInteger(nums);
	        System.out.println("The lonely integer is: " + lonelyInteger);
	    }
	}



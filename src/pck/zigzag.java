package pck;


	public class LonelyInteger {
	    public static int findLonelyInteger(int[] nums) {
	        int lonely = 0;
	        for (int num : nums) {
	            lonely ^= num;
	            System.out.println("The lonelyin for : " + lonely);
	        }
	        return lonely;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 2, 3, 3, 4, 4}; // Example input array
	        int lonelyInteger = findLonelyInteger(nums);
	        System.out.println("The lonely integer is: " + lonelyInteger);
	    }
	}



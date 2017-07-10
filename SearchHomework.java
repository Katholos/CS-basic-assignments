
public class SearchHomework {

	public static final int MAXSIZE = 6;
	
	public static void main(String[] args) {		
		int [] nums = new int[MAXSIZE];
		int numsSize = fillArray(nums);
		int [] positions = new int[nums.length];
		int positionsSize, key, size = nums.length;

		// write code here which will use the search4 method to
		// find all positions of where the number 8 is,
		// and then change all of the 8s to 5s

		positionsSize = search4(nums, 8, size, positions);
		positions = nums;
		key = 8;
		
		for(int pos = 0; pos < size; pos++){
			if(key == nums[pos]) {
				nums[pos] = 5;
			}
			System.out.println(nums[pos]);
		}
		
		System.out.println("There are " + positionsSize + " with positions the number 8");
		
	}
	
	/**
	 * Fills an array with a preset list of values
	 * @param nums The array to be filled
	 * @return The number of items added to the array
	 */
	public static int fillArray(int [] nums) {
		nums[0] = 56;
		nums[2] = 2;
		nums[4] = 96;
		nums[1] = nums[3] = nums[5] = 8;
		return 6;
	}

	/**
	 * Searches an array for a key value. Creates a list of all the position numbers
	 * of where the key value is found in the array.
	 * @param nums The array to be searched
	 * @param key The value to search for in the array
	 * @param size The number of items store in the nums array
	 * @param positions An empty array with at least size number of positions.
	 *        At the end of the method, this array will be holding all of the position numbers
	 *        of where the the key was found in the nums array.
	 * @return The number of items placed into the positions array
	 */
	public static int search4(int [] nums, int key, int size, int[] positions) {
		int usedSize = 0;
		
		for(  int pos = 0; pos < size; pos++  ) {
			if ( key == nums[pos] ) {
				positions[usedSize] = pos;
				usedSize++;
			}
		}
		
		return usedSize;
	}
}
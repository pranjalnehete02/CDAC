package Arrays;

public class ArrayOperations {

	public static void printArray(int[] arr, int n) {
		for(int i=0; i<n; ++i) {
			System.out.println(arr[i] + " ") ;
		}
	}
	public static int insertAnelement(int arr[], int n, int pos, int value) {
		for(int i=n; i>pos; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos] = value;
		return n+1;
	}
	
	public static void main(String[] args) {
		int [] nos = new int[3];
		int count = 0;
		nos[0] = 5;
		count++;
		
		nos[1] = 4;
		count++;
		
		printArray(nos, count);
		count = insertAnelement(nos, count, 1, 15);
		System.out.println("array after insertion");
		
		printArray(nos, count);
	}
}

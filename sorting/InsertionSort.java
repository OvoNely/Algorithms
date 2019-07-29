public class InsertionSort {
	
	public int[] sort(int[] arr) {
						
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1;
			while (i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i -= 1;
			}
			arr[i + 1] = key;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] ar = {3,4,8,10,45,7,54,34,2,94};
		InsertionSort is = new InsertionSort();
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		System.out.println();
		
		is.sort(ar);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

}

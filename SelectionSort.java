
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int count = 0;
		int large;
		int temp;
		while(count < a.length) {
			large = 0;
			for(int i = 1; i < a.length - count; i ++) {
				if(a[i] > large) {
					large = i;
				}
			}
			temp = a[a.length - 1];
			a[a.length - 1] = a[large];
			a[large] = temp;
			count--;
		}
	}

}

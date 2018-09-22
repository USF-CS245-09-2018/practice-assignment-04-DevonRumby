
public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		boolean switche = false;
		int temp;
		while(switche == false) {
			switche = true;
			for(int i = 0; i <a.length - 1; i++) {
				if(a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					switche = false;
				}
			}
		}

	}

}

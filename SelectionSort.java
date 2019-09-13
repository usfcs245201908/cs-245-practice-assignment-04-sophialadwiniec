public class SelectionSort implements SortingAlgorithm{
	public SelectionSort(){
		return;
	}

	public void sort(int[] a){
		
		for(int i = 0; i < a.length-1; i++){
			int min = i; 
			for(int j = i+1; j<a.length; j++){
				if(a[j] < a[min]){
					min = j; 
				}
			}
			int temp = a[min]; 
			a[min] = a[i]; 
			a[i] = temp; 
		}
	}

}
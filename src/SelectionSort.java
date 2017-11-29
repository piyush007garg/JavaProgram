public class SelectionSort {
	
	public static void selectionSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int index = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[index]){
					index=j;
				}
			}
			int smallNumber = arr[index];
			arr[index]=arr[i];
			arr[i]=smallNumber;			
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {9,14,3,2,43,11,58,22};
		for(int i:arr){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
	}
	
}

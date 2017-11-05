
public class arrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * OUTPUT print common element between array
		 */
		String[] arr1 = {"4","5","6","7"};
		String[] arr2 = {"4","1","2","5","1","2","6","1","2","7","1","2",};
			for(int i=0;i<arr1.length;i++){
				for(int j=0;j<arr2.length;j++){
					if(arr1[i]==arr2[j]){
						System.out.println(arr2[j]+" ");
					}
				}
			}
		
		
		
	}

}

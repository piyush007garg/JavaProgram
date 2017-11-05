import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class reverseStringAlternateNumber {

	/*
	 * INPUT IS : my name is piyush
	 *  OUTPUT IS : My eman is hsuyip
	 */

	
	/*public static void main(String[] args) {
		String str = "my name is piyush";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i % 2 != 0) {
				for (int j = words[i].length() - 1; j >= 0; j--){					
					System.out.print(words[i].charAt(j));
				}
				System.out.print(" ");
			} else {
				System.out.print(words[i]+ " ");
			}
		}
	}
	 */
// ===================================================================================================

	/*
	 * INPUT IS : my name is piyush 
	 * OUTPUT IS : ym eman si hsuyip
	 */
	
	/*public static void main(String[] args) {
		String str = "my name is piyush";
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				System.out.print(arr[i].charAt(j) + " ");
			}
		}
	}*/
	
//=====================================================================================================
	
	/*
	 * INPUT IS : my name is piyush 
	 * OUTPUT IS : hsuyip si eman ym
	 */
	/*public static void main(String[] args){
		String str = "my name is piyush";
		char[] arr = str.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);	
		}
			}
	*/
	
	// ======================================================================================================
	
	/*	@ reverse a string through clooection
	 * INPUT IS : my name is piyush 
	 * OUTPUT IS : hsuyip si eman ym
	 */
	public static void main(String[] args){
	String input = "you love me";
	char[] hello = input.toCharArray();
	List<Character> trial1 = new ArrayList<>();

	for (char c : hello)
		trial1.add(c);

	Collections.reverse(trial1);
	ListIterator<Character> li = trial1.listIterator();
	while (li.hasNext())
		System.out.print(li.next());
}
	}
	


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class stringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * OUTPUT is To print dupicate words from string
		 */
		
		String str = "I love My myself e";
		Map<Character,Integer> charmap = new HashMap<Character,Integer>();
		char[] Char = str.toCharArray();
		for(Character c : Char){
			if(charmap.containsKey(c)){
				charmap.put(c, charmap.get(c)+1);
			}else{
				charmap.put(c, 1);
			}
		}
		Set<Character> se =charmap.keySet();
		for(Character ch : se){
			if(charmap.get(ch)>1){
				System.out.println(ch+"  " +charmap.get(ch));
				
			}
		}
		
		
// =====================================================================================================
		/*
		 * OUTPUT is to print distinct element
		 */
		
		/*String[] str = {"9","9","9","9","0","4","8","8","9","8","96","5","1","8","5"};
		System.out.println("Orignal String is"+ Arrays.toString(str));
		
		List<String> li = Arrays.asList(str);
		Set<String> se = new HashSet<String>(li);
		System.out.println(se);		
	*/
		}
}
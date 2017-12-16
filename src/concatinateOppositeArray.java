import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class concatinateOppositeArray {

	/*
	 * OutPut a5 b4 c3 d2 e1
	 */
	
	transient static int id = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = { "a", "b", "c", "d", "e" };
		String[] str1 = { "1", "2", "3", "4", "5" };

			
			int index = 0;

			for (int j = str1.length - 1; j >= 0; j--) {

				System.out.print(str[index] + str1[j] + " ");

				index++;
			}
			System.out.println(" ");
			
// ========================================================================================================================			
			
			List<String> strList = new ArrayList<>();
			List<String> strList1 = new ArrayList<>();
			strList.addAll(Arrays.asList(str));
			strList1.addAll(Arrays.asList(str1));
			id = strList1.size()-1;
			strList.forEach(p -> {
				System.out.println(p + strList1.get(id--) + " ");
			});
			
// ============================================================================================================		
			
			for (int i = 0, j = str1.length-1; i < str.length; i++, j--) {
				System.out.print(str[i] + str1[j] + " ");
			}

		}

	}



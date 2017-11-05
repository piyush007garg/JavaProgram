
public class anagram {

	public boolean anagramProgram(String s1 ,String s2) {
		// TODO Auto-generated method stub
		// String s1= "Disha";
		// String s2 = "hasid";
		
		char[] Char = s1.toCharArray();
		StringBuilder secondString = new StringBuilder(s2);
		
		for(Character ch : Char){
			int index = secondString.indexOf(""+ch);
			System.out.println(index);
			
			if(index!= -1){
				secondString.deleteCharAt(index);
			}
		}
			if(secondString.length()==0){
				return true;
			}else{
				return false;
			}
	}
public static void main(String[] args) {
    anagram obj = new anagram();
   boolean returndata = obj.anagramProgram("disha", "ahsid");
   System.out.println("returndata--->"+returndata);
}
}


import java.io.IOException;
import java.util.Scanner;

public class compressString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str = "IILoVVEE YYoUU DDDIIISSSA";

		int count = 0;
		char temp = str.charAt(0);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == temp) {
				count++;
			} else {
				System.out.println(temp + "-->>" + count);
				count = 1;
				temp = str.charAt(i);
			}
		}
		System.out.println(temp + "-->>" + count);

	}
}

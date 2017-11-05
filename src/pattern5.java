
public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i, j, k=16, tim=1;
	        for(i=0; i<5; i++)
	        {
	            for(j=0; j<k; j++)
	            {
	                System.out.print("piyush ");
	            }
	            k = k - 4;
	            for(j=0; j<tim; j++)
	            {
	                System.out.print("* ");
	            }
	            tim = tim + 2;
	            System.out.println();
	        }
	}

}

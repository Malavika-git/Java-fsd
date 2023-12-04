
public class LIS {
	
		  public static int LISMemoize(int LISArray[]) {
		    int mem[] = new int[LISArray.length];

		    for (int i = 0; i < LISArray.length; i++)
		      mem[i] = 1;

		    int i = 0, j = 1;

		    for (; j < LISArray.length; j++)
		      for (i = 0; i < j; i++) {
		        if (LISArray[i] < LISArray[j]) {
		          mem[j] = Math.max(mem[j], mem[i] + 1);
		        }

		      }
		    int maxLIS = mem[0];
		    for (i = 1; i < LISArray.length; i++) {
		      maxLIS = Math.max(mem[i], maxLIS);
		    }

		    return maxLIS;
		  }
		  public static void main(String[] args) {
		    int LISArray[] = { 10,-9,8,7,6,20,-2};
		      
		    System.out.println( LISMemoize(LISArray));
		  }
}


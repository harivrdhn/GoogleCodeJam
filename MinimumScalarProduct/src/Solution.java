import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author harivardhan pyaram
 *
 */
public class Solution {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("A-large-practice.in");
		BufferedReader tr = new BufferedReader(fr);
		
		FileWriter write = new FileWriter("output.out");
		
		int T = Integer.parseInt(tr.readLine());
		int k=1;
		while(k<=T){
			int N = Integer.parseInt(tr.readLine());
			String numbers[] = tr.readLine().split(" ");
			String numbers1[] = tr.readLine().split(" ");
			double arr1[] = new double[N];
			double arr2[] = new double[N];
			for(int i=0;i<N;i++){
				arr1[i]=Double.parseDouble(numbers[i]);
				arr2[i]=Double.parseDouble(numbers1[i]);
			}
			//StringBuilder builder = new StringBuilder();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			double product = 0;
			for(int i=0;i<N;i++){
				product += arr1[i]*arr2[N-i-1];
			}
			write.write("Case #"+k+": "+String.format("%.0f",product)+"\n");
			k++;
		}
		tr.close();
		write.close();
	}

}

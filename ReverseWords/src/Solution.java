import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("B-large-practice.in");
		BufferedReader tr = new BufferedReader(fr);
		
		FileWriter write = new FileWriter("output.out");
		
		int N = Integer.parseInt(tr.readLine());
		int k=1;
		while(k<=N){
			String words[] = tr.readLine().split(" ");
			int len = words.length;
			StringBuilder builder = new StringBuilder();
			for(int i=0;i<len;i++){
				builder.append(words[len-i-1]);
				builder.append(" ");
			}
			write.write("Case #"+k+": "+builder.toString()+"\n");
			k++;
		}
		tr.close();
		write.close();
	}

}

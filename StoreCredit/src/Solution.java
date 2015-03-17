import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		FileReader fr = new FileReader("A-large-practice.in");
		BufferedReader tr = new BufferedReader(fr);
		
		FileWriter write = new FileWriter("output.out");
		
		int N = Integer.parseInt(tr.readLine());
		int k=1;
		while(k<=N){
			int C = Integer.parseInt(tr.readLine());
			int I = Integer.parseInt(tr.readLine());
			String s[]=tr.readLine().split(" ");
			int items[]= new int[I];
			for(int i=0;i<I;i++){
				items[i]=Integer.parseInt(s[i]);
			}
			
			for(int i=0;i<I;i++){
				int j=i+1;
				while(j<I){
					if((items[i]+items[j]==C)){
						write.write("Case #"+k+": "+(i+1)+" "+(j+1)+"\n");
						break;
					}
					j++;
				}
			}
			k++;
		}
		tr.close();
		write.close();
	}

}

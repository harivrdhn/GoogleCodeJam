import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C-large-practice.in");
		BufferedReader tr = new BufferedReader(fr);
		
		FileWriter write = new FileWriter("output.out");
		
		Map<Character,String> map = new HashMap<Character, String>();
		map.put('a', "2");
		map.put('b', "22");
		map.put('c', "222");
		map.put('d', "3");
		map.put('e', "33");
		map.put('f', "333");
		map.put('g', "4");
		map.put('h', "44");
		map.put('i', "444");
		map.put('j', "5");
		map.put('k', "55");
		map.put('l', "555");
		map.put('m', "6");
		map.put('n', "66");
		map.put('o', "666");
		map.put('p', "7");
		map.put('q', "77");
		map.put('r', "777");
		map.put('s', "7777");
		map.put('t', "8");
		map.put('u', "88");
		map.put('v', "888");
		map.put('w', "9");
		map.put('x', "99");
		map.put('y', "999");
		map.put('z', "9999");
		map.put(' ', "0");
		
		int N = Integer.parseInt(tr.readLine());
		int k=1;
		while(k<=N){
			char words[] = tr.readLine().toCharArray();
			int len = words.length;
			StringBuilder builder = new StringBuilder();
			int count = 0;
			String first = map.get(words[0]);
			builder.append(first);
			count += first.length();
			for(int i=1;i<len;i++){
				String next = map.get(words[i]);
				if(builder.charAt(count-1) == next.charAt(0)){
					builder.append(" ");
					count++;
				}
				builder.append(next);
				count += next.length();
			}
			write.write("Case #"+k+": "+builder.toString()+"\n");
			k++;
		}
		tr.close();
		write.close();
	}

}

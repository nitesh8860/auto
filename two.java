package textAnalyser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class two {

	public static void main(String s[]) throws IOException
	{
ArrayList<String> ab = new ArrayList<String>();
		
		BufferedReader bf = new BufferedReader(new FileReader("D:\\typeName.txt"));
		String s1  = null;
		while((s1=bf.readLine())!= null)
		{
			System.out.println(s1);
			ab.add(s1);
		}
		System.out.println(ab);
	}
}


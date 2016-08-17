package textAnalyser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.gargoylesoftware.htmlunit.javascript.host.Document;

import net.sourceforge.htmlunit.corejs.javascript.optimizer.Codegen;

public class One {
	static String matchedLineInput = "";
	static String matchedLineSelect;
	
	static String tag = "";

	static String typeName;

	static String type;

	static String tagValue;
	static String pack = One.class.getPackage().getName();

	static ArrayList<String> objc = new ArrayList<String>();
	static ArrayList<String> objtag = new ArrayList<String>();
	static ArrayList<String> objTypeName = new ArrayList<String>();
	

	public static String getTagValue() {
		return tagValue;
	}

	public static void setTagValue(String tagValue) {
		One.tagValue = tagValue;
	}

	public static void searchTag(String ml) {
		if (false) {
			System.out.println();
		} else if (ml.contains(" id")) {
			try{
			tag = "id";
			}
			catch(Exception e){
				
			}
		} else if (ml.contains(" name")) {
			try{
				tag = "name";
				}
				catch(Exception e){
					
				}
		}

		else if (ml.contains(" class")) {
			try{
				tag = "class";
				}
				catch(Exception e){
					
				}
		}

	}

	public static void extractor(String a, String b) throws Exception {
		try {

			BufferedReader bf = new BufferedReader(new FileReader("D://test.txt"));

			String line;
			System.out.println("A : "+a);
			System.out.println("B :"+b);
			System.out.println("Searching for " + type + " in file...");

			while ((line = bf.readLine()) != null) {
				System.out.println("*/*/*//*/*/*/*/*/*/*/*/*");
				final Pattern patternInput = Pattern.compile("<input(.+?)/>");
				//final Pattern patternSelect = Pattern.compile("<select(.+?)><option");
				
				final Matcher matcherInput = (patternInput.matcher(line)) ;
				//final Matcher matcherSelect = (patternSelect.matcher(line)) ;
				
				//searching for <input type="typeName"
				while (matcherInput.find() == true) {

					matchedLineInput = matcherInput.group(1);
					System.out.println(matchedLineInput);
					searchTag(matchedLineInput);
					int indexfound = matcherInput.group(1).indexOf(type);
					if (indexfound > -1) {
						// System.out.println("********Word was found at position "+
						// indexfound);
						int tagIndex = 0;

						try {

							tagIndex = matchedLineInput.indexOf(tag);
						} catch (Exception e) {
							System.out.println(e);
						}

						System.out.println("tagIndex : " + tagIndex);
						int lastTagIndex = matchedLineInput.substring(tagIndex + tag.length() + 1).indexOf(" ");
						tagValue = matchedLineInput.substring(tagIndex + tag.length() + 1, tagIndex + tag.length() + 1
								+ lastTagIndex);

						System.out.println(tag + " = " + tagValue);
						System.out.println(tagValue);
						objtag.add(tag);
						objc.add(tagValue);
						//
					}

				}

		/*	
			
			//searching for <select type
			while (matcherSelect.find() == true) {

				matchedLineSelect = matcherSelect.group(1);
				System.out.println("*****");
				System.out.println(matchedLineSelect);
				tag = "name";
				
					int tagIndex = 0;
				
					try {
						tagIndex = matchedLineSelect.indexOf(tag);
					} catch (Exception e) {
						System.out.println(e);
					}

					System.out.println("tagIndex : " + tagIndex);
					int lastTagIndex = matchedLineSelect.substring(tagIndex + tag.length() + 1).indexOf(" ");
					tagValue = matchedLineSelect.substring(tagIndex + tag.length() + 1, tagIndex + tag.length() + 1
							+ lastTagIndex);

					System.out.println(tag + " = " + tagValue);
					//System.out.println(tagValue);
					objtag.add(tag);
					objc.add(tagValue);
					objTypeName.add(typeName);

				

			}
*/
			}

			bf.close();
			System.out.println(objtag);
			System.out.println(objc);
			System.out.println(typeName);
		} catch (IOException e) {
			System.out.println("IO Error Occurred: " + e.toString());
		}
	}

	public static void fetcher() throws Exception {

		BufferedReader bf = new BufferedReader(new FileReader("D:\\typeName.txt"));

		String s1 = null;
		while ((s1 = bf.readLine()) != null) {
			// System.out.println(s1);
			objTypeName.add(s1);
		}
		System.out.println(objTypeName);
	}

	public static void main(String args[]) throws Exception {

		fetcher();
		
	
		
		for (int i = 0; i < objTypeName.size(); i++) {

			typeName = objTypeName.get(i);

			type = "type=\"" + typeName + "\"";
			extractor(type, typeName);
			codeGen.coder();
		}
		

	}

}

package textAnalyser;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class HtmlParser {

	public static void main(String[] args) throws Exception {
	
		
		Connection.Response html = Jsoup.connect("http://facebook.com/").execute();
		System.out.println(html.body());
		
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("d://filename.txt"), "utf-8"))) {
	   writer.write(html.body());
	}
	}

}
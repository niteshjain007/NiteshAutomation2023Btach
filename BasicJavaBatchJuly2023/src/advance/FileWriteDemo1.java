package advance;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo1 {

	public static void main(String[] args) throws IOException {
		double salary = 123.98;
		// .txt , csv
		FileWriter fw = new FileWriter("C:\\Users\\njain\\Documents\\testology-courses\\namaste selenium\\JavaBasics\\day22_fileHandling\\try.txt");
		fw.write("hi..i am learning java");
		
		fw.write("\n this is second line");
		fw.write("salary is = "+ salary + ",and its month end");
		
		
		fw.write("\n name \t, age \t,phonenumber");
		fw.write("\n nitesh \t,35 \t,12340000");
		fw.write("\n john \t,30 \t,999999");
		
		fw.close();
		
		
		
		
	}

}

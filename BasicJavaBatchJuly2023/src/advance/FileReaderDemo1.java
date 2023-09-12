package advance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args) throws IOException {
		
		char[] array = new char[500];
		
		try {
			FileReader fr = new FileReader("C:\\Users\\njain\\Documents\\testology-courses\\namaste selenium\\JavaBasics\\day22_fileHandling\\try.txt");
			fr.read(array);
			System.out.println("lets see whats inside the file");
			System.out.println(array);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("some problem with finding file..");
			e.printStackTrace();
		} catch (IOException ioe)
		{
			System.out.println("some problem with reading the file..");
			ioe.printStackTrace();
		}
		
	
		String fileName = "C:\\Users\\njain\\Documents\\testology-courses\\namaste selenium\\JavaBasics\\day22_fileHandling\\try.txt";

		BufferedReader br = new BufferedReader(new FileReader(fileName));

		try {
		    String line;
		    while ((line = br.readLine()) != null) {
		       System.out.println(line);
		    }
		} finally {
		    br.close();
		}
		
		
	}

}

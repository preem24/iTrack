import java.io.File;


import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	private static Scanner scan;

  public static void main(String[] args) throws IOException {

		// http://textfiles.com/100/captmidn.txt

		File file = new File("/Users/preem/Desktop/content.txt"); 
		scan = new Scanner(file);

	
		while (scan.hasNextLine()) {
		System.out.println(scan.nextLine());
    }
	}

}

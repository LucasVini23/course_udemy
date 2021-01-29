package udemy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class tests {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException exception) {
			System.out.println("Error: " + exception.getMessage());
		}
		finally {
			sc.close();
		}
	}

}

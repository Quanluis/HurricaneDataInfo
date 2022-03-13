package floridaHurricane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readHurricaneFileCat {

	public ArrayList<String> cat = new ArrayList<String>();

	public String hurricaneFileLocation = "src/floridaHurricane/NamedFloridaHurricanes.txt";

	
	public String processHurricaneFileCat() {

		try {
		
		File hurricaneFile1 = new File(this.hurricaneFileLocation);
		Scanner readerScanner1 = new Scanner(hurricaneFile1);
		
		readerScanner1.useDelimiter(",|:");

		while(readerScanner1.hasNext()){

			readerScanner1.next();
			cat.add(readerScanner1.next());
			readerScanner1.nextLine();
	
		}
		
		System.out.println("After sorting " + cat);


		readerScanner1.close();
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();

	}	
		
		return null;
		
	}
	
	public void running() {
		
		System.out.println("System is running.");
		
	}
	

}

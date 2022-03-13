package floridaHurricane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readHurricaneFileYear {
	
	public ArrayList<String> year = new ArrayList<String>();

	public String hurricaneFileLocation = "src/floridaHurricane/NamedFloridaHurricanes.txt";

	
	public String processHurricaneFileYear() {

		try {
		
		File hurricaneFile1 = new File(this.hurricaneFileLocation);
		Scanner readerScanner1 = new Scanner(hurricaneFile1);
		
		readerScanner1.useDelimiter(",|:");

		while(readerScanner1.hasNext()){
			readerScanner1.next();
			readerScanner1.next();
			year.add(readerScanner1.nextLine());

	
		}
		
		System.out.println("After sorting " + year);
		
		System.out.println("this is the year class.");


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

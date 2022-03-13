package floridaHurricane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readHurricaneFileName {
	
	 public String hurricaneFileLocation = "src/floridaHurricane/NamedFloridaHurricanes.txt";
	 
	 public ArrayList<String> name = new ArrayList<String>();
	 

	public String processHurricaneFileNames() {

		try {
		
		File hurricaneFile1 = new File(this.hurricaneFileLocation);
		Scanner readerScanner1 = new Scanner(hurricaneFile1);
		readerScanner1.useDelimiter(",|:");
		
		while(readerScanner1.hasNext()) {
			
			name.add(readerScanner1.next());
			readerScanner1.nextLine();
			
		}
		
		System.out.println(name);
	
		readerScanner1.close();
		
		} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}	

		return null;
		
	}

}


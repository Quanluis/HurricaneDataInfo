package floridaHurricane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readHurricaneFile {

		 public String hurricaneFileLocation = "src/floridaHurricane/NamedFloridaHurricanes.txt";
		 
		 public String name;
		 public String category;
		 public String date;
		 
		 private String hurricaneInfo;
 
		 // Hurricane object constructor 
		 
		public void  Hurricane(String name, String category, String date) {
			
			this.name = name;
			this.category = category;
			this.date = date;

		}
		
		// Reads the hurricane file scanner 
		
		public String readHurricanes(Scanner file) {
					
			if(file.hasNextLine()) {
				
				this.hurricaneInfo = file.nextLine();
				
				return this.hurricaneInfo;
				
			}
			
			return null;
			
		}

		
		public String processHurricaneFileDate() {

			try {
						File hurricaneFile = new File(this.hurricaneFileLocation);
			Scanner readerScanner = new Scanner(hurricaneFile);
			readerScanner.useDelimiter(",|/");
			
			while(readerScanner.hasNext()) {
				
				readerScanner.next();
	
				System.out.println(readerScanner.next());
	
			}
			
			readerScanner.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}				
			return null;
		}
		
		// runs all current methods


		public void run() {
			
		processHurricaneFileDate();

		}
		
}

package floridaHurricane;

import java.util.ArrayList;

import javax.swing.*;

public class sortByCat {
	
	
	String dialog = "Major Florida Hurricanes 1950 - 2020\n\n"
			+ "Sort by Hurricane Category\n\n"
			+ "Press 1 for Ascending Order\n"
			+ "Press 2 for Descending Order";
	
	public static ArrayList<String> cat = new ArrayList<String>();
	
	public void sortAscending() {
		
		readHurricaneFileCat AscendingCat = new readHurricaneFileCat();
		
		AscendingCat.processHurricaneFileCat();
		
		
		
		

	}
	
	
	public void process() {
		
		
		
		String option = JOptionPane.showInputDialog(dialog);
		
		int choice = Integer.parseInt(option);
		
		try {
			
			switch(choice) {
			
			case 1: 
				
				System.out.println("You picked Ascending");
				
				readHurricaneFileCat cat = new readHurricaneFileCat();
				
				cat.processHurricaneFileCat();
				
				JOptionPane.showMessageDialog(null, "Ascending Info: " + cat.cat);
				
				break;
				
				
			case 2: 
			
				System.out.println("You picked Descending");
				
				JOptionPane.showMessageDialog(null, "Descending");
				
				break;
			
			}
			
			
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Incorrect input, try again.");
			
			process();
		}
		
		
	}
	

}

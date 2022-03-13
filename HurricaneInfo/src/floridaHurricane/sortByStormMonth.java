package floridaHurricane;

import javax.swing.*;

public class sortByStormMonth {
	
	// Variables 
	
	String dialog = "Major Florida Hurricanes 1950 - 2020\n\n"
			+ "Sort by Hurricane Monthy\n\n"
			+ "Press 1 for Ascending Order\n"
			+ "Press 2 for Descending Order";
	
	public void process() {
		
		String option = JOptionPane.showInputDialog(dialog);
		
		int choice = Integer.parseInt(option);
		
		try {
			
			switch(choice) {
			
			case 1: 
				
				System.out.println("You picked Ascending");
				
				break;
				
				
			case 2: 
			
				System.out.println("You picked Descending");
				
				break;
			
			}
			
			
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Incorrect input, try again.");
			
			process();
		}
		
		
		
	}

}

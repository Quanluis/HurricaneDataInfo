package floridaHurricane;

import javax.swing.JOptionPane;

public class menu {

		// Variables
	
		String dialog = "Florida Major Hurricanes 1950 - 2020\n\n"
				+ "	 Press 1 to sort by name\n"
				+ "	 Press 2 to sort by Storm Category.\n"
				+ " Press 3 to sort by storm year.\n"
				+ " Press 4 to sort by storm month.\n"
				+ " Press 5 to display average storm category.\n"
				+ " Press 6 to display the most active year.\n"
				+ " Press 7 to display total by category.\n"
				+ " Press 8 to display total by year.\n"
				+ " Press 9 to exit.\n";
	
		public void options () {
			
			
			String option = JOptionPane.showInputDialog(dialog);
			
			int choice = Integer.parseInt(option);
			
			
			// Menu input 
			
			try {
				
				switch(choice) {
				
				case 1: 
					
					sortByName sortByName = new sortByName();
					
					sortByName.process();

					break;
				
				case 2: 
					
					sortByCat sortByCat = new sortByCat();
					
					sortByCat.process();
					
					// SortByCategory();
					
					break;
					
				case 3: 
					
					sortByStormYear sortByStormYear = new sortByStormYear();
					
					sortByStormYear.process();
					
					// SortByStormYear();
					
					break;
					
				case 4: 
					
					sortByStormMonth sortByStormMonth = new sortByStormMonth();
					
					sortByStormMonth.process();

					// SortByStormMonth();
					
					break;
					
				case 5: 
					
					averageStormCat averageStormCat = new averageStormCat();
					
					sortByCat sort = new sortByCat();
					
					sort.process();
					
					averageStormCat.process();
					
					// averageStormCat();
					
					break;
					
				case 6: 
					
					mostActiveYear mostActiveYear = new mostActiveYear();
					
					mostActiveYear.process(); 
					
					// mostActiveYear();
					
					break;
					
				case 7: 
					
					totalByCat totalByCat = new totalByCat();
					
					totalByCat.process();
					
					// totalByCat();
					
					break;
					
				case 8: 
					
					totalByYear totalByYear = new totalByYear();
					
					totalByYear.process();
					
					// totalByYear();
					
					break;
				
				case 9: 
					
					System.exit(0);
					
				}
				
				
			} catch (NumberFormatException e) {
				System.out.println("Value is not acceptable please try again.");
				
				options();
			}
			
			
			
			
		}

			
}

package floridaHurricane;

public class floridaHurricane {

	public static void main(String[] args) {
		
			menu m = new menu();
			
			readHurricaneFile run = new readHurricaneFile();
			
			run.processHurricaneFile();
			
			m.options();
		
	}

}

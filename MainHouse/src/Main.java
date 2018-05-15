
public class Main {

	public static void main(String[] args) {

		
		
		House house1 = new House(170, "Morton Ave", "Athens");
		System.out.println(house1); //170 Morton Ave, Athens
		System.out.println(house1.getTax()); //NaN
		
		house1.setPrice(1000000);
		System.out.println(house1); //170 Morton Ave, Athens, priced at $1000000.0
		System.out.println(house1.getTax()); //100000.0
		
		House house2 = new House(713, "King Ave", "Athens", 425000);
		System.out.println(house2); //713 King Ave, Athens, priced at $425000.0
		System.out.println(house2.getTax()); //42500.0
		
		System.out.println(House.getTaxRate()); //0.1
		
		


	}

}

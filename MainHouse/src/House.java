
public class House {
	
	private int streetNumber;
	private String streetName;
	private String city;
	private double price;
	public static double taxrate=0.1;
	public double tax;

	
	
	public House(int streetn, String streetname, String cityn, double pricen){
		this.streetNumber=streetn;
		this.streetName=streetname;
		this.city=cityn;
		this.price=pricen;
	}
	
	public House(int streetn, String streetname, String cityn){
		this.streetNumber=streetn;
		this.streetName=streetname;
		this.city=cityn;
		this.price = 0;
	}
	
	public static double getTaxRate(){
		
		return taxrate;
	}
	
	public double getTax(){
		if(this.getPrice()>0){
			tax=this.getPrice()*taxrate;
			return tax;
		}else{
			return tax=Float.NaN;
		}
	}
	
	public String getAddress(){
		return streetNumber+" "+streetName+", "+city;
	}
	
	public String toString(){

		   String priceKnown = "";
		   
		   
		   if(price != 0) {
		    priceKnown = String.format(", priced at $%.1f", price);
		   }
		   String Format = getAddress()+priceKnown;
		   return Format;
		  }
		
	
	
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

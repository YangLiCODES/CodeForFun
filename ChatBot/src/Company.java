
public class Company {
	
	private String name;
	private String country;
	private double marketcap;
	private double revenue;
	public  double result;

	public  Company(String line) {
        String [] dataArray = line.split(",");
        name=dataArray[0];
        country=dataArray[1];

        String bf = dataArray[2];
		bf = bf.replaceAll("\\$","");
		marketcap = Double.parseDouble(bf);
         
		String df = dataArray[4];
		df = df.replaceAll("\\$","");
		revenue = Double.parseDouble(df);
	
	}


	public String getName() {
		return name;
	}


	public String getCountry() {
		return country;
	}


	public double getRevenue() {
		return revenue;
	}
	public double getMarketCap(){
		return marketcap;
	}

	
	public double getPSR() {
		
		if (marketcap != 0 && revenue != 0) {
			result = marketcap / revenue;
		} else {
			result = Float.NaN;
		}
		return result;
	}
	
	
	public double getPSR(boolean b) {
		
		if(marketcap == 0 || revenue == 0){
			return Float.NaN;
		}else if (b == true) {
			double res = getPSR();
			return Math.round(res * 100.0) / 100.0;
		}
		 
		 
		 else if (b==false){
			double res = getPSR();
			if(res==0){
				return res=Float.NaN;
			}else{
				return res;
			}		

		
		}
		 if(result==0.0){
			 return Float.NaN;
		 }
		return result;
	
}
		

		
	}
	
	
	
	
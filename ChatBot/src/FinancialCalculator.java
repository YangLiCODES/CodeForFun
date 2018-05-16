
public class FinancialCalculator {
	public static double result;

	public static double PSR(double marketCap, double revenue) {
		if (marketCap != 0 && revenue != 0) {
			result = marketCap / revenue;
		} else {
			result = Float.NaN;
		}
		return result;
	}

	public static double PSR(double marketCap, double revenue, boolean c) {
		
		
		if(marketCap == 0 || revenue == 0){
			return Float.NaN;
		}else if (c == true) {
			double res = PSR(marketCap, revenue);
			return Math.round(res * 100.0) / 100.0;
		}
		 
		 
		 else if (c==false){
			double res = PSR(marketCap, revenue);
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

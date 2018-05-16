import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class Lab6_Part2 {

		public static void main(String[] args) throws IOException {
			// reading from a file
			Scanner fileReader = new Scanner(new File("InternetCompanies.csv"));
			// skip header from input
			fileReader.nextLine();
			// print output header
			System.out.println("Company, Country, PSR, Rounded PSR");
			while (fileReader.hasNextLine()) {
				// read line by line
				String line = fileReader.nextLine();
				// create a company object
				Company company = new Company("Google/Alphabet,USA, $510 , $79 , $75 ");
				// calculate PSR
				double psr = company.getPSR();
				double roundedPsr = company.getPSR(true);
		
	
				// display results

				System.out.println(company.getName() + ", " + company.getCountry() + ", "  + psr + ", " + roundedPsr);
			}
		}
	}

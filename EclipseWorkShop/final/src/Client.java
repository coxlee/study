import java.io.File;
import java.util.Scanner;


public class Client {

	public static void main(String[] args) throws Exception{
		System.out.println("!!!!!!!!!!!!!!!!!!CS-115 Hongqiao Yuan_Final Project!!!!!!!!!!!!!!!!!!");
		Server ser = new Server();
		ser = readFile(ser);
		menu(ser);
		System.out.println("System is quiting.....");
		/*
		 * quit the program
		 */

	}
	public static Server readFile(Server ser) throws Exception{//reading file and save it to Server class!
		File f = new File("xxx.txt");
		Scanner scan = new Scanner(f);
		String country;
		int Number;
		Athlete temp;
		while(scan.hasNext()){
			country = scan.next();
			if(!country.equals("END_OF_FILE")){
				Number = scan.nextInt();
				for(int i = 0;i<Number;i++){
					temp = new Athlete();
					temp.setLastName(scan.next());
					temp.setFirstName(scan.next());
					temp.setAge(scan.nextInt());
					temp.setAdRevenue(scan.nextDouble());
					temp.setVenue(scan.next().charAt(0));
					String sport = scan.nextLine();//trim
					temp.setSport(sport.trim());
					temp.setCountry(country);
				}
			}else{
				break;
			}
		}
		scan.close();
		return ser;
	}
	public static void menu(Server ser){//display the menu and promote user to input a commend and run it
		boolean running = true;
		Scanner scan = new Scanner(System.in);
		while(running){
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("MENU");
			System.out.println("1:Display all athlete available - 'L l'");
			System.out.println("2:Display specific athlete - 'A a'");
			System.out.println("3:Display all athlete in a country - 'C c'");
			System.out.println("4:Display all Ad Revenue - 'R r'");
			System.out.println("5:Display all Venue - 'V v'");
			System.out.println("6:Quit - 'Q q'");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
			String commend = scan.next();
			commend = commend.toUpperCase();
			switch(commend){
				case "L":
					ser.List();
					break;
				case "A":
					System.out.println("Please input the LastName of a athlete");
					commend = scan.next();
					if(ser.Athlete(commend)){
						System.out.println("Athlete found!");
					}else{
						System.out.println("Athlete not found!");
					}
					break;
				case "C":
					System.out.println("Please input the country name");
					commend = scan.next();
					if(ser.Country(commend)){
						System.out.println("Country found!");
					}else{
						System.out.println("Country not found!");
					}
					break;
				case "R":
					ser.Revenue();
					break;
				case "V":
					ser.Venue();
					break;
				case "Q":
					running = false;
					break;
				default:
					System.out.println("Sorry! I can't find your commend");
					break;
					
					
			}
		}
		scan.close();
	}
}

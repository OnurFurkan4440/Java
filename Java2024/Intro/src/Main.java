
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		String text = "May take your attention!";
		String subText = "The timelaps";
		
		System.out.println(text);
		
		int age = 12;
		
		double dollarYesterday = 18.200;
		double dollarToday = 18.20;
		
		boolean IsDolarDecreased = false;
		
		String directionOfArrow = "";
		
		if (dollarToday < dollarYesterday) {
			
			directionOfArrow ="down.svg";
			System.out.println(directionOfArrow);
			
		} else if (dollarToday > dollarYesterday) {
			directionOfArrow ="up.svg";
			System.out.println(directionOfArrow);
		}
		
		else {
			directionOfArrow ="equal.svg";
			System.out.println(directionOfArrow);
		}	
		
	}

}

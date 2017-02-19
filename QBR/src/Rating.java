import java.util.Scanner;
public class Rating {
	
	
	
		
		public static void main(String[] args) {
			
			System.out.println(passerRating());
			
		}
		
		public static double passerRating() {
			java.util.Scanner input = new Scanner(System.in);
			
			System.out.println("Number of Touchdowns : ");
			int td = input.nextInt();
			System.out.println("Total Yards : ");
			int yd = input.nextInt();
			System.out.println("Number of Interceptions : ");
			int ints = input.nextInt();
			System.out.println("Number of Completions: ");
			int comp = input.nextInt();
			System.out.println("Number of Passes Attempted: ");
			int att = input.nextInt();
			input.close();

			
			
			double a = ((comp/att)-.3)*5.0;
			double b = ((yd/att)-3)*.25;
			double c = (td/att)*20.0;
			double d = 2.375-((ints/att)*25.0);
			return ((mm(a)+mm(b)+mm(c)+mm(d))/6)*100;
		}
		
		
		public static double mm(double d) {
			if (d < 0) return 0;
			if (d > 2.375) return 2.375;
			return d;
		
	
		}
	}


package thing;
import java.util.Scanner;
public class LeapYears {
	@SuppressWarnings("null")
	public static boolean isLeapYear(int year){
		if(year < 0){System.out.print("year cannot be determined"); return (Boolean) null ;}
		else if (year % 400 ==0){return true;}
		else if(year % 100 == 0){return false;}
		else if(year % 4 ==0){return true;}
		else {return false;}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Input a year: ");
		int year = -1;
		if (in.hasNextInt()){year = in.nextInt();}
		else {System.out.println("Bad input");}
		System.out.println("Is this a leap year:");
		System.out.println(isLeapYear(year));
	}
}

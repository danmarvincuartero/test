
import java.util.Scanner;
class Main
{
	public static void main(String[] args)	
	{
	  double as,mr,dr,hr,at,mt,np;
    Scanner input = new Scanner(System.in);
	  System.out.println("Enter Your Annual Salary:");
     as = input.nextDouble();
	  System.out.println("Your Annual Salary: " + String.format("%.2f", as));
	  System.out.println("Your Monthly Rate: " + String.format("%.2f", mr = as/12));
    System.out.println("Your Daily Rate: " + String.format("%.2f", dr = mr/22));
    System.out.println("Your Hourly Rate: " + String.format("%.2f", hr = dr/8));
    at = 0;
    if (as <= 250000){
      at = 0;
    }else if (as >= 250000 && as < 400000){
     at = 30000 * 0.2;
    }else if (as >= 400000 && as < 800000){
      at = 30000 + (0.25 * (as - 400000));
    }else if (as >= 800000 && as < 20000000){
      at = 130000 + (0.3 * (as - 800000));
    }else if (as >= 250000 && as < 400000){
      at = 490000 + (0.32 * (as - 2000000));
    }else if (as >= 250000 && as < 400000){
      at = 2410000 + (0.35 * (as - 8000000));}
    System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", at));
    System.out.println("Your Monthly Tax Deduction: " + String.format("%.2f", mt = at/12));
    System.out.println("Net Pay: " + String.format("%.2f", np = mr-mt));
	}
}
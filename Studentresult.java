import java.util.Scanner;

public class Studentresult 
{
	public static void main (String ... args)

	{
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter Student Mark : ");

		int mark = sc.nextInt();

		if (mark >= 60) { System.out.print ("Student passed with firstclass");}
		else if (mark <60 && mark >=50 ){ System.out.print ("Student passed with Second class");}
		else if (mark >=35 && mark <50 ){System.out.print ("Student passed with Third class") ; }

		else {System.out.print ("Student is failed ");}

	}

}



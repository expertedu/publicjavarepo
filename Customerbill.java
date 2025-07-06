import java.util.*;
public class Customerbill {
	public static void main (String... args)
	{ 
		int cno;String cname;
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Number");
		cno=sc.nextInt();
		sc.skip("\r\n|\r|\n");
		System.out.println("Enter Customer Name");
		cname =sc.nextLine();
		System.out.println("Number of Items");
		int n=sc.nextInt();
		Items []ilist =new Items[n];
		int i=0;
		while(i<n)
		{
			ilist[i]=new Items();
			System.out.println("EnterItem Number");
			ilist[i].itemno=sc.nextInt();
			sc.skip("\r\n|\r|\n");
			System.out.println("Enter Item Name");
			ilist[i].ItemName=sc.nextLine();
			System.out.println("Enter Quantity of Goods Purchased");
			ilist[i].qgp=sc.nextInt();
			System.out.println("Enter Rate per Quantity");
			ilist[i].rpq=sc.nextDouble();
			System.out.println("Enter Tax per Unit");
			ilist[i].gpi=sc.nextDouble();
			System.out.println("Enter Discount amount per quantity");
			ilist[i].dpq=sc.nextDouble();
			ilist[i].amt=ilist[i].qgp*ilist[i].rpq;
			ilist[i].discamt=ilist[i].amt*ilist[i].dpq/100.0;
			ilist[i].gst=ilist[i].amt*ilist[i].gpi/100.0;
			System.out.println("Any more items(1/0)?");
			int ch=sc.nextInt();
			if (ch==0) break;
			i++;

		}
		System.out.println("Customer Number :"+cno+"   Customer Name : "+cname);
		System.out.println("---------------------------------------------------------------------------------------------------");
                System.out.printf("%11s %-25s %5s %10s %7s %12s %12s\n", "Item No.", "Item Name", "Qty", "Rate","Tax","Discount", "Amount");
                System.out.println("----------------------------------------------------------------------------------------------------");




		double totamt=0;
		double netbill=0;
		double totaldisc=0;
		

		for(int j=0;j<i;j++)


		{ 

			System.out.printf("%11d %-25s %5d %10.2f %9.2f %9.2f %12.2f\n",ilist[j].itemno,ilist[j].ItemName,ilist[j].qgp,ilist[j].rpq,ilist[j].gpi,ilist[j].dpq,ilist[j].amt);
			totamt+=ilist[j].amt+ilist[j].gst;
			netbill += (ilist[j].amt + ilist[j].gst - ilist[j].discamt);

			totaldisc+=ilist[j].discamt;

			
		}

		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.printf("Total Bill Amount(Including GST)                           %8.2f\n",totamt);
		System.out.printf("Discount Amount                                            %8.2f\n",totaldisc);
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.printf("Net Payable Amount(After Discount)                        %8.2f\n",netbill);




	}
}

class Items {
	int itemno,qgp;
	String ItemName;
	double rpq,amt,gst,discamt,netbill,gpi,dpq;
}



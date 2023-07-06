import java.util.Scanner;
public class Shop {
	private static int carcost;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Available cars in the showroom : ");
		String[] cars= {"Polo Trendline","Polo Highline","Virtus Trendline","Virtus Highline","Taigun Trendline","Taigun Highline","Taigun Topline"};
		System.out.println();
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		System.out.println();
		System.out.println("Select car model:");
		String carname=sc.nextLine();
		switch(carname) {
		case "Polo Trendline":
			carcost=870000;
			System.out.println("Car cost : "+carcost);
			break;
		case "Polo Highline":
			carcost=1090000;
			System.out.println("Car cost : "+carcost);
			break;
		case "Virtus Trendline":
			carcost=1105000;
			System.out.println("Car cost : "+carcost);
			break;
		case "Virtus Highline":
			carcost=1308000;
			System.out.println("Car cost : "+carcost);
			break;
		case "Taigun Trendline":
			carcost=1489000;
			System.out.println("Car cost : "+carcost);
			break;
		case "Taigun Highline":
			carcost=1542000;
			System.out.println("Car cost : "+carcost);
			break;
		case "Taigun Topline":
			carcost=1771000;
			System.out.println("Car cost : "+carcost);
			break;
		}
		System.out.println("Do you want insurance ?");
		String insurance=sc.next();
		
		System.out.println("Do you need Additional Accessories ?");
		String add_accessories=sc.next();
		
		System.out.println("Dealer Discount:");
		String discount=sc.next();
		
		final int RTO=113990;
		final int TCS_charges=11000;
		int total=carcost+RTO+TCS_charges;
		int insurance_amt=0;
		int add_accessories_amt=0;
		if (insurance.equals("yes") || insurance.equals("YES")){
			insurance_amt=47300;
			total+=insurance_amt;
		}
		if (add_accessories.equals("yes") || insurance.equals("YES")) {
			add_accessories_amt=15000;
			total+=add_accessories_amt;
		}
		int discount_amount;
		if (discount.endsWith("%")) {
			discount=discount.replace("%","");
			discount_amount=Integer.valueOf(discount)*carcost/100;
		}
		else
			discount_amount=Integer.valueOf(discount);
		if(discount_amount>30000) {
			System.out.println("Discount amount is "+discount_amount+" But Maximum discount applied is 30000");
		}
		System.out.println();
		if(((!insurance.equalsIgnoreCase("yes") && !insurance.equalsIgnoreCase("YES")) && (!add_accessories.equalsIgnoreCase("yes") && !add_accessories.equalsIgnoreCase("YES"))) && discount_amount > 0) {
			System.out.println("Any one of the additional features need to be added to access the discount!!");
			discount_amount=0;
			total-=discount_amount;
		}
		if(insurance.equals("yes") || insurance.equals("YES") || add_accessories.equals("yes") || insurance.equals("YES") && discount_amount <= 30000) {
			total-=discount_amount;
		}
		System.out.println();
		System.out.println("Total cost "+total+"("+carname+" "+carcost+" + "+RTO+"(RTO)"+insurance_amt+"(Insurance) + "+TCS_charges+"(TCS) + "+add_accessories_amt+"(Additional Accessories) - "+discount_amount+"(Dealer discount))");
	}
}


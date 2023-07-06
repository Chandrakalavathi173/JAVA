import java.util.Scanner;
public class miniproject {
		public String Carmodel;
		public String insurance;
		public String add_accessories;
		public String discount;
		public long RTO=113990;
		public long insurance_amt=47300;
		public long TCSCharges=11000;
		public long add_accessories_amt=15000;
		public long discount_amount=0;
		public void getCarModel()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("select car model: ");
			Carmodel=sc.nextLine();
			System.out.println("Do you need insurance");
			insurance=sc.nextLine();
			System.out.println("Do you need Additional Accessories: ");
			add_accessories=sc.nextLine();
			System.out.println("Dealer Discount: ");
			discount=sc.nextLine();
			sc.close();
		}
			
		public long getCost(String carName,long cost)
		{
			final int RTO=113990;
			final int TCS_charges=11000;
			long total=cost+RTO+TCS_charges;
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
			if (discount.endsWith("%")) {
				discount=discount.replace("%","");
				discount_amount=Integer.valueOf(discount)*cost/100;
			}
			else
				discount_amount=Integer.valueOf(discount);
			if(discount_amount>30000) {
				System.out.println("---->Discount amount is "+discount_amount+" But Maximum discount applied is 30000");
			}
			if(((!insurance.equalsIgnoreCase("yes") && !insurance.equalsIgnoreCase("YES")) && (!add_accessories.equalsIgnoreCase("yes") && !add_accessories.equalsIgnoreCase("YES"))) && discount_amount > 0) {
				System.out.println("---->Any one of the additional features need to be added to access the discount!!");
				discount_amount=0;
				total-=discount_amount;
			}
			if(insurance.equals("yes") || insurance.equals("YES") || add_accessories.equals("yes") || insurance.equals("YES") && discount_amount <= 30000) {
				total-=discount_amount;
			}
			System.out.println();
			System.out.println("---->Total cost "+total+"("+Carmodel+" "+cost+" + "+RTO+"(RTO) + "+insurance_amt+"(Insurance) + "+TCS_charges+"(TCS) + "+add_accessories_amt+"(Additional Accessories) - "+discount_amount+"(Dealer discount))");
			System.out.println();
			return 0;
		}
}			

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

  
public class miniprojecttest extends miniproject{
	public static void main(String[] args) {
		miniprojecttest m=new miniprojecttest();
		String[] arr= new String[]{"PoloTrendline","PoloHighline","VirtusTrendline","VirtusHighline","TaigunTrendline","TaigunHighline","TaigunTopline"};
	    for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		long[] cost=new long[]{870000,1009000,1105000,1308000,1489000,1542000,1771000};
		m.getCarModel();
		for(int i=0;i<arr.length;i++)
	  	{
			
			if(arr[i].equals(m.Carmodel))
			{
				System.out.println(m.getCost(arr[i],cost[i]));
				
			}
			
		}
	}

}




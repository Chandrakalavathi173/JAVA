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

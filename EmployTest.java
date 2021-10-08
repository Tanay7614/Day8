package Sample;

public class EmployTest {
	private final int isFullTime=2;
	private final int isPartTime=1;
	private int Wage_per_hour=20;
	private int part_time;
	int daily_wage;
	int total_month_wage=0;
    public EmployTest(int rate_hour,int partTime)
    {
    	this.Wage_per_hour=rate_hour;
    	this.part_time=partTime;
    }
  public int calculate_month_wage(){
    for(int day=1; day<=20;day++)
    { 	
	   int ran=(int) Math.floor(Math.random()*10)%3;
	   switch(ran)
	   {
	        case isPartTime : 
	            daily_wage=Wage_per_hour*part_time;
	            total_month_wage=total_month_wage +daily_wage;
	            System.out.println("Employ part time wage="+daily_wage);
	        	break;
	        case isFullTime :
	        	daily_wage=Wage_per_hour*(part_time* isFullTime);
	        	System.out.println("Employ fulltime wage="+ daily_wage);
	        	total_month_wage=total_month_wage +daily_wage;
	        	break;
	        default:
	        	System.out.println("Employed is absent");
	   }
	  
    }
    return  total_month_wage;
    }
	
	public static void main(String[] args) {
			
		EmployTest emp = new EmployTest(20,4);
		int Monthwage=emp.calculate_month_wage();
		System.out.println("Total month wage="+Monthwage);
		
		
}
}
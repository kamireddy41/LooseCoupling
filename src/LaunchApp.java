import services.BlueDart;
import services.FirstFlight;

public class LaunchApp 
{

	public static void main(String[] args) 
	{
		Amazon amz=new Amazon(new FirstFlight());//constructor dependency injection
//		amz.setService(new FedEx());
		amz.setService(new BlueDart());//setter dependency injection
		
		Boolean status=amz.deliverTheProduct(454.4);
		
		if(status)
			System.out.println("Delivered Successfully");
		else
			System.out.println("Failed to deliver");

	}

}

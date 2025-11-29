package services;

public class FirstFlight implements IDeliveryService 
{

	@Override
	public Boolean deliveryProduct(Double amount)
	{
		System.out.println("The Product is delivered using FirstFlight service and amount is "+amount);
		return true;
	}

}

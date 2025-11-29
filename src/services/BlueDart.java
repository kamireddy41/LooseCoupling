package services;

public class BlueDart implements IDeliveryService 
{

	@Override
	public Boolean deliveryProduct(Double amount) 
	{
		System.out.println("The Product is delivered using BlueDart service and amount is "+amount);
		return true;
	}

}

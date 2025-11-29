package services;

public class FedEx implements IDeliveryService {

	@Override
	public Boolean deliveryProduct(Double amount) 
	{
		System.out.println("The Product is delivered using FedExt service and amount is "+amount);
		return true;
	}

}

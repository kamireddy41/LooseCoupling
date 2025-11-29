
import services.IDeliveryService;

public class Amazon 
{
	private IDeliveryService service;
	
	//Construction Injection
	public Amazon(IDeliveryService service)
	{
		super();
		this.service = service;
	}
	public Amazon() {
		super();
		
	}
	//setter injection
	public void setService(IDeliveryService service) //IDeliveryService service= new FedEx();
	{
		this.service = service;
	}

	public Boolean deliverTheProduct(Double amount)
	{

		return service.deliveryProduct(amount);
		
	}

}

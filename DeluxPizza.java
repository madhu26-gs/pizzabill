package bill;

public class DeluxPizza extends pizza{
	public DeluxPizza(Boolean veg)
	{
		super(veg);
		//super.addExtraChesse();
		//super.addExtraTopping();
	}

	@Override
	public void addExtraCheese() {
		this.price +=extraCheesePrice;
	}

	@Override
	public void addExtraToppings() {
		this.price +=extraToppingsPrice;
	}



	}
	
	
	


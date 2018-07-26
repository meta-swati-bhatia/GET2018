public class Stock {
	private static Product[] prods = new Product[5];
	
	static {
		prods[0] = new Product("apple", 20.3f);
		prods[1] = new Product("banana", 10.3f);
		prods[2] = new Product("mango", 50.3f);
		prods[3] = new Product("peer", 100.00f);
		prods[4] = new Product("apricot", 120.5f);
	}
	
	public static Product getProduct(String name)
	{
		for(Product prod : prods)
		{
			if(prod.name.equals(name))
				return prod;
		}
		return null;
	}
}

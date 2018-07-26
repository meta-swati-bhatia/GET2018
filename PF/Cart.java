import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
	private List<Item> items = new ArrayList();
	
	public void addItem(String name, int quantity)
	{
		Product prod = Stock.getProduct(name);
		if(prod == null){
			System.out.println("product does not exist");
			return;
		}
		Item item = new Item(prod, quantity);
		items.add(item);
		System.out.println("product added");
	}
	
	public void removeItem(String name)
	{
		Item itemToBeRemoved = null;
		for(Item item : items)
		{
			if(item.prod.name.equals(name)){
				itemToBeRemoved = item;
				break;
			}
		}
		if(itemToBeRemoved == null)
			System.out.println("product does not exist");
		items.remove(itemToBeRemoved);
	}

	public static void main(String[] args)
	{
		Cart myCart = new Cart();
		while(true)
		{
			System.out.println("Please select any one from the following:");
			System.out.println("1. Add item to the cart");
			System.out.println("2. Remove item from the cart");
			System.out.println("3. Print the bill");
			System.out.println("4. exit");
			
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			if(option == 1){
				System.out.println("Enter the name of the product: ");
				String prodName = sc.next();
				System.out.println("Enter the quantity:");
				int prodQuantity = sc.nextInt();
				myCart.addItem(prodName, prodQuantity);
			}
			else if(option == 2){
				System.out.println("Enter the name of the product: ");
				String prodName = sc.next();
				myCart.removeItem(prodName);
			}
			else if(option == 3){
				System.out.println("S.No. | Item 			| Quantity");
				System.out.println("-------");
				int i = 1;
				float total = 0;
				for(Item item : myCart.items){
					System.out.println(i + "      | " + item.prod.name + "             | " + item.quantity);
					total = total + (item.quantity * item.prod.price);
				}
				System.out.println("-------");
				System.out.println("total:   | " + total);
				return;
			}
			else
				return;
		}
	}
}

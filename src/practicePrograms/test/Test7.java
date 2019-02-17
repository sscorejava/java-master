package practicePrograms.test;

public class Test7 {
	
	private void update(Product p, double price) {
		price = p.price * 2;
		p.price = price;
	}

	public static void main(String[] args) {
		
		Product product = new Product();
		product.price = 200;
		double price = 100;
		
		Test7 test7 = new Test7();
		test7.update(product, price);
		System.out.println("Product price = " + product.price + "Price = " + price);

	}

}

class Product {
	double price;
}

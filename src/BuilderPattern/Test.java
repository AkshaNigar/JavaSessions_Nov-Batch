package BuilderPattern;

public class Test {

	public static void main(String[] args) {

		EcommApplication app = new EcommApplication();
		
		app.login("KM.AKSHA", "test@123")
		.doSearch("Nike shoe")
		.addToCart("one pair of shoe")
		.doPayment("124 7382 3332 2212", 858)
		.generateOrder()
		.logout();

	}

}

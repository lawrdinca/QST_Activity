package ro.ase.cts.g1098.clean.code.stage6.main;

import ro.ase.cts.g1098.clean.code.stage6.interfaces.MarketingStrategyInterface;
import ro.ase.cts.g1098.clean.code.stage6.models.marketing.AccountMarketingStrategy;
import ro.ase.cts.g1098.clean.code.stage6.models.marketing.SummerAccountMarketingStrategy;
import ro.ase.cts.g1098.clean.code.stage6.models.product.Product;
import ro.ase.cts.g1098.clean.code.stage6.models.product.ProductType;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		MarketingStrategyInterface marketingStrategy = new AccountMarketingStrategy();
		product.setAccountDiscountStrategy(marketingStrategy);
		
		float finalPrice = product.computeFinalPrice(ProductType.NORMAL, 1000, 10);
		System.out.println("Final price is: " + finalPrice);
		
		product.setAccountDiscountStrategy(new SummerAccountMarketingStrategy());
		finalPrice = product.computeFinalPrice(ProductType.NORMAL, 1000, 10);
		System.out.println("Final summer price is: " + finalPrice);
		

	}

}

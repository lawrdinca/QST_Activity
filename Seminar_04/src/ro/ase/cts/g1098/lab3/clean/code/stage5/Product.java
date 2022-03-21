package ro.ase.cts.g1098.lab3.clean.code.stage5;
//stage 5

// SOLID - Single Responsibility
// outsource the implementation of the account discount computation 
// outsource the computation of the discount value
// outsource the computation of the price with discount

public class Product {

	AccountMarketingStrategy accountDiscountStrategy = null;

	public float getPriceDiscount(float productPrice, ProductType productType) {
		return productPrice * productType.getDiscount();
	}

	public float getPriceWithDiscount(float productPrice, ProductType productType) {
		return productPrice - this.getPriceDiscount(productPrice, productType);
	}

	public float computeFinalPrice(ProductType productType, float productPrice, int accountAgeInYears) {

		float finalPrice = 0;
		float accountDiscount = 0;

		if (productType != ProductType.NEW) {
			accountDiscount = accountDiscountStrategy.getAccountDiscount(accountAgeInYears);
		}

		finalPrice = this.getPriceWithDiscount(productPrice, productType) * (1 - accountDiscount);

		return finalPrice;
	}
}

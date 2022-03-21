package ro.ase.cts.g1098.lab3.clean.code.stage6.models.product;

import ro.ase.cts.g1098.lab3.clean.code.stage6.models.marketing.AccountMarketingStrategy;
//stage 6

// SOLID - DIP Dependency inversion principle
// replace the AccountMarketingStrategy by an interface type
// refactor the project structure

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

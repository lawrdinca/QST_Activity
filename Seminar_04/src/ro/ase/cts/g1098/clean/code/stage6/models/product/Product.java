package ro.ase.cts.g1098.clean.code.stage6.models.product;

import ro.ase.cts.g1098.clean.code.stage6.exceptions.MissingMarketingStrategyException;
import ro.ase.cts.g1098.clean.code.stage6.interfaces.MarketingStrategyInterface;

// SOLID - DIP Dependency inversion principle
// replace the AccountMarketingStrategy by an interface type
// refactor the project structure

public class Product {

	MarketingStrategyInterface accountDiscountStrategy = null;
	
	

	public void setAccountDiscountStrategy(MarketingStrategyInterface accountDiscountStrategy) {
		
		if(accountDiscountStrategy == null) {
			throw new MissingMarketingStrategyException();
		}
		this.accountDiscountStrategy = accountDiscountStrategy;
	}

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
			if(this.accountDiscountStrategy == null) {
				throw new MissingMarketingStrategyException();
			}
			accountDiscount = accountDiscountStrategy.getAccountDiscount(accountAgeInYears);
		}

		finalPrice = this.getPriceWithDiscount(productPrice, productType) * (1 - accountDiscount);

		return finalPrice;
	}
}

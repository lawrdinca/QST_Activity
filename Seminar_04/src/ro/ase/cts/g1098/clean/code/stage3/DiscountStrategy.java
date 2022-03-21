package ro.ase.cts.g1098.clean.code.stage3;
//stage 3

// - remove statics and use enums instead

public class DiscountStrategy {

	public final static int PREMIUM_ACCOUNT_MIN_AGE = 10;
	public final static float PREMIUM_DISCOUNT = 0.15f;

	public float computeFinalPrice(ProductType productType, float productPrice, int accountAgeInYears) {

		// final float newProductDiscount = 0.1f;

		float finalPrice = 0;
		float accountDiscount = (accountAgeInYears > PREMIUM_ACCOUNT_MIN_AGE) ? PREMIUM_DISCOUNT
				: (float) accountAgeInYears / 100;

		switch (productType) {
		case NEW:
			finalPrice = productPrice;
			break;
		case NORMAL:
			finalPrice = (productPrice - (productType.getDiscount() * productPrice))
					- accountDiscount * (productPrice - (productType.getDiscount() * productPrice));
			break;
		case ON_SALE:
			finalPrice = (productPrice - (productType.getDiscount() * productPrice))
					- accountDiscount * (productPrice - (productType.getDiscount() * productPrice));
			break;
		case FINAL_SALE:
			finalPrice = (productPrice - (productType.getDiscount() * productPrice))
					- accountDiscount * (productPrice - (productType.getDiscount() * productPrice));
			break;
		default:
			throw new UnsupportedOperationException();

		}

		return finalPrice;
	}
}

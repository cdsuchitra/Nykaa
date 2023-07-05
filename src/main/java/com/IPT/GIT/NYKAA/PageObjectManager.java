package com.IPT.GIT.NYKAA;

public class PageObjectManager extends NykaaBaseClass {
	
	private UserLogin userClick;
	
	private ScreenShot screenClick;
	
	private ProductSearch productClick;
	
	private PaymentPage paymentClick;
	
	private Logout logoutClick;
	
	private GoToBag goBagClick;
	
	private ClearBag clearclick;
	
	private AddtoBag addBagclick;
	
	private AddressForm addressclick;

	public UserLogin getUserClick() {
		if(userClick == null) {
			userClick= new UserLogin(driver);
		}
		return userClick;
	}

	public ScreenShot getScreenClick() {
		if(screenClick == null) {
			screenClick = new ScreenShot(driver);
		}
		return screenClick;
	}

	public ProductSearch getProductClick() {
		if(productClick == null) {
			productClick = new ProductSearch(driver);
		}
		return productClick;
	}

	public PaymentPage getPaymentClick() {
		if(paymentClick == null) {
			paymentClick = new PaymentPage(driver);
		}
		return paymentClick;
	}

	public Logout getLogoutClick() {
		if(logoutClick == null) {
			logoutClick = new Logout(driver);
		}
		return logoutClick;
	}

	public GoToBag getGoBagClick() {
		if(goBagClick == null) {
			goBagClick = new GoToBag(driver);
		}
		return goBagClick;
	}

	public ClearBag getClearclick() {
		if(clearclick == null) {
			clearclick = new ClearBag(driver);
		}
		return clearclick;
	}

	public AddtoBag getAddBagclick() {
		if(addBagclick == null) {
			addBagclick = new AddtoBag(driver);
		}
		return addBagclick;
	}

	public AddressForm getAddressclick() {
		if(addressclick == null) {
			addressclick = new AddressForm(driver);
		}
		return addressclick;
	}

	
}

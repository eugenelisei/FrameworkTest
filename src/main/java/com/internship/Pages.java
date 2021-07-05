package com.internship;

public class Pages {
    public static HomePage homePage() {
        return new HomePage();
    }
    public static PathPages pathPages() {
        PathPages pathPages = new PathPages();
        return pathPages;
    }
    public static ValidRegistration validRegistration() {
        ValidRegistration validRegistration = new ValidRegistration();
        return validRegistration;
    }

    public static AddToCart addToCart() {
        AddToCart addToCart = new AddToCart();
        return addToCart;
    }
}

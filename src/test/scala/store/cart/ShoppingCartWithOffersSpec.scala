package store.cart

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by shailesh on 18/03/2017.
  */
class ShoppingCartWithOffersSpec extends FlatSpec with Matchers{
  "Price of 2 Apples" should "cost .60 on checkout" in {
    ShoppingCart.checkoutWithOffers(Array("apple", "apple")) should be (0.60)
  }

  "Price of 3 Apples" should "cost 1.20 on checkout" in {
    ShoppingCart.checkoutWithOffers(Array("apple", "apple","apple")) should be (1.20)
  }

  "Price of 4 Apples" should "cost 1.20 on checkout" in {
    ShoppingCart.checkoutWithOffers(Array("apple", "apple","apple","apple")) should be (1.20)
  }
}

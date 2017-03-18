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

  "Price of 3 oranges" should "cost 0.50 on checkout" in {
    ShoppingCart.checkoutWithOffers(Array("orange", "orange","orange")) should be (0.50)
  }

  "Price of 1 orange" should "cost 0.25 on checkout" in {
    ShoppingCart.checkoutWithOffers(Array("orange")) should be (0.25)
  }


  "Price of 3 oranges And 3 Apples" should "cost 1.70 on checkout" in {
    ShoppingCart.checkoutWithOffers(Array("orange" , "apple" ,"orange" , "apple","orange" , "apple")) should be (1.70)
  }


}

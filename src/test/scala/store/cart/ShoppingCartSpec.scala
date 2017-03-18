package store.cart

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by shailesh on 18/03/2017.
  */
class ShoppingCartSpec extends FlatSpec with Matchers{


  "Empty basket checkout" should "cost 0.0 on checkout" in {
    ShoppingCart.checkout(Array()) should be (0.0)
  }

  "Price of 2 Apples" should "cost 1.20 on checkout" in {
    ShoppingCart.checkout(Array("apple", "apple")) should be (1.20)
  }

  "Price of 2 Oranges" should "cost 0.50 on checkout" in {
    ShoppingCart.checkout(Array("orange", "orange")) should be (0.50)
  }

}

package store.cart

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by shailesh on 18/03/2017.
  */
class ShoppingCartSpec extends FlatSpec with Matchers{


  "Empty basket checkout" should "cost 0.0 on checkout" in {
    ShoppingCart.checkout(Array()) should be (0.0)
  }
}

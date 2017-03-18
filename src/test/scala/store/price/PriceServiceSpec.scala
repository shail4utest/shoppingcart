package store.price

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by shailesh on 18/03/2017.
  */
class PriceServiceSpec extends FlatSpec with Matchers {

  "Apple price in store" should  "be 0.60" in {
    PriceService.getItemPrice("apple") should be (Some(0.60))
  }

  "Orange price in store" should  "be 0.25" in {
    PriceService.getItemPrice("orange") should be (Some(0.25))
  }

  "Price of item that doesn't exist in store" should  "be 0" in {
    PriceService.getItemPrice("non-existing") should be (None)
  }
}

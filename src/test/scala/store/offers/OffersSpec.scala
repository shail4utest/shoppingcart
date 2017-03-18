package store.offers

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by shailesh on 18/03/2017.
  */
class OffersSpec  extends FlatSpec with Matchers {

  "2 items" should "cost 0.60 when price for 1 is 0.60" in {
    Offers.buyOneGetOneFree(2 ,0.60) should be (0.60)
  }

  "4 items" should "cost 1.20 when price for 1 is 0.60" in {
    Offers.buyOneGetOneFree(4 ,0.60) should be (1.20)
  }

  "3 items" should "cost 1.20 when price for 1 is 0.60" in {
    Offers.threeForTwo(3 ,0.60) should be (1.20)
  }
}

package store.offers

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by shailesh on 18/03/2017.
  */
class OffersSpec  extends FlatSpec with Matchers {

  "2 items" should "cost 0.60 when price for 1 is 0.60" in {
    Offers.buyOneGetOneFree(2 ,0.60) should be (0.60)
  }

}

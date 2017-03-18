package store.cart

import store.offers.Offers

/**
  * Created by shailesh on 18/03/2017.
  */
trait ShoppingCart extends Offers{


  def checkout(items:Array[String]) = {

    items.count(_.equalsIgnoreCase("Apple")) * 0.60 +
      items.count(_.equalsIgnoreCase("Orange")) * 0.25

  }

  def checkoutWithOffers(items:Array[String]) = {

    buyOneGetOneFree(items.count(_.equalsIgnoreCase("Apple")) , 0.60 ) +
      threeForTwo(items.count(_.equalsIgnoreCase("Orange")) ,0.25)

  }


}

object ShoppingCart extends ShoppingCart
package store.cart

import store.offers.Offers
import store.price.PriceService

/**
  * Created by shailesh on 18/03/2017.
  */
trait ShoppingCart extends Offers{

  val priceService = PriceService

  def checkout(items:Array[String]) = {

      items.count(_.equalsIgnoreCase("Apple")) * priceService.getItemPrice("Apple").getOrElse(BigDecimal(0.0)) +
        items.count(_.equalsIgnoreCase("Orange")) * priceService.getItemPrice("Orange").getOrElse(BigDecimal(0.0))

  }

  def checkoutWithOffers(items:Array[String]) = {

    buyOneGetOneFree(items.count(_.equalsIgnoreCase("Apple")) ,priceService.getItemPrice("Apple").getOrElse(BigDecimal(0.0))) +
      threeForTwo(items.count(_.equalsIgnoreCase("Orange")) ,priceService.getItemPrice("Orange").getOrElse(BigDecimal(0.0)))

  }


}

object ShoppingCart extends ShoppingCart
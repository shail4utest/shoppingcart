package store

import store.cart.ShoppingCart

/**
  * Created by shailesh on 18/03/2017.
  */
object RunStore {
  def main(args: Array[String]) {
    println("*****************************Simple Checkout************************************")
    println("[ " + args.mkString(", ") + " ] => £" + ShoppingCart.checkout(args))
    println("*****************************Simple Checkout With Offers************************")
    println("[ " + args.mkString(", ") + " ] => £" + ShoppingCart.checkoutWithOffers(args))
    println("*********************************************************************************")

  }
}

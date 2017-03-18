package store.cart

/**
  * Created by shailesh on 18/03/2017.
  */
trait ShoppingCart {
  def checkout(items:Array[String]) = 0.0
}

object ShoppingCart extends ShoppingCart
package store.cart

/**
  * Created by shailesh on 18/03/2017.
  */
trait ShoppingCart {
  def checkout(items:Array[String]) = items.count(_.equalsIgnoreCase("Apple")) * 0.60
}

object ShoppingCart extends ShoppingCart
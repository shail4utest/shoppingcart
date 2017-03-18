package store.offers

/**
  * Created by shailesh on 18/03/2017.
  */
trait Offers {

  def buyOneGetOneFree(quantity: Int, price: BigDecimal): BigDecimal = ( (quantity / 2) + (quantity % 2)) * price

  def threeForTwo(quantity: Int, price: BigDecimal): BigDecimal = (2 * (quantity/3) + (quantity %3)) * price

}

object Offers extends Offers
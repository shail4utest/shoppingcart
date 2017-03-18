package store.price

/**
  * Created by shailesh on 18/03/2017.
  */
trait PriceService {
  private val priceLookup: Map[String, BigDecimal] = Map(("apple", 0.60), ("orange", 0.25))

  def getItemPrice(item :String) : Option[BigDecimal] = {
    priceLookup.get(item.toLowerCase()) map (_.setScale(2))
  }

}

object PriceService extends PriceService
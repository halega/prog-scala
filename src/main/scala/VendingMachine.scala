class VendingMachine {

  var chocolateBar: Int = 0
  var granolarBar: Int = 0

  var totalMoney: BigDecimal = 0

  def isProductAvailable(product: String): Boolean = ???
  def isMoneyEnoght(product: String, money: BigDecimal): Boolean = ???
  def completeRequest(product: String, money: BigDecimal): String = ???

  def buy(product: String, money: BigDecimal): String =
    if (!isProductAvailable(product))
      s"Sorry, product $product not available"
    else if (!isMoneyEnoght(product, money))
      "Please, insert more money"
    else completeRequest(product, money)
}

class VendingMachine {

  var chocolateBar: Int = 0
  var granolarBar: Int = 0

  var totalMoney: BigDecimal = 0

  def isProductAvailable(product: String): Boolean = {
    val productQuantity = {
      if (product == "chocolate") chocolateBar
      else if (product == "granola") granolarBar
      else 0
    }
    productQuantity > 0
  }

  def isMoneyEnoght(product: String, money: BigDecimal): Boolean = {
    val cost = if (product == "chocolate") 1.5 else 1
    money >= cost
  }

  def completeRequest(product: String, money: BigDecimal): String = {
    collectMoney(money)
    releaseProduct(product)
    s"There you go! Have a $product bar"
  }

  def collectMoney(money: BigDecimal): Unit =
    totalMoney += money

  def releaseProduct(product: String): Unit =
    if (product == "chocolate") chocolateBar -= 1
    else if (product == "granola") granolarBar -= 1

  def buy(product: String, money: BigDecimal): String =
    if (!isProductAvailable(product))
      s"Sorry, product $product not available"
    else if (!isMoneyEnoght(product, money))
      "Please, insert more money"
    else completeRequest(product, money)
}

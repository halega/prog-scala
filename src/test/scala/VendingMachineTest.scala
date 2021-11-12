import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class VendingMachineTest extends AnyFlatSpec with Matchers {

  case class product(product: String, money: BigDecimal)
  // all available products in VendingMachine
  val products = Seq(
    product("chocolate", 1.5),
    product("granola", 1.0),
  )

  "VendingMachine" should "refuse to buy absend product" in {
    products.foreach(p =>
      assert(new VendingMachine().buy(p.product, p.money) == s"Sorry, product ${p.product} not available")
    )
  }

  "VendingMachine" should "check product availability before money" in {
    val product = "chocolate"
    assert(new VendingMachine().buy(product, 0) == s"Sorry, product $product not available")
  }

  "VendingMachine" should "not contains products on init" in {
    val machine = new VendingMachine
    machine.chocolateBar should equal (0)
    machine.granolarBar shouldEqual 1
  }

  "VendingMachine" should "decrese the quantity of product" in {
    val machine = new VendingMachine
    val quantity = 3
    machine.chocolateBar = quantity
    machine.granolarBar = quantity

    products.foreach(p => {
      for (_ <- 1 to quantity)
        machine.buy(p.product, p.money) shouldEqual s"There you go! Have a ${p.product} bar"
      machine.buy(p.product, p.money) shouldEqual s"Sorry, product ${p.product} not available"
    })
  }

  "VendingMachine" should "refuse to buy a product if money is not enough" in {
    val machine = new VendingMachine
    machine.chocolateBar = 1
    machine.granolarBar = 1

    products.foreach(p =>
      machine.buy(p.product, p.money - 0.01) shouldEqual "Please, insert more money"
    )
  }

  "VendingMachine" should "completeRequest if money is greater than product's cost" in {
    val machine = new VendingMachine
    machine.chocolateBar = 1
    machine.granolarBar = 1

    products.foreach(p =>
      machine.buy(p.product, p.money + 1.0) shouldEqual s"There you go! Have a ${p.product} bar"
    )
  }

  "VendingMachine" should "collect money" in {
    val machine = new VendingMachine
    machine.chocolateBar = 2
    machine.granolarBar = 2
    var expectedTotal: BigDecimal = 0.0

    products.foreach(p => {
      machine.buy(p.product, p.money) shouldEqual s"There you go! Have a ${p.product} bar"
      expectedTotal += p.money
      machine.buy(p.product, p.money + 1.0) shouldEqual s"There you go! Have a ${p.product} bar"
      expectedTotal += p.money + 1.0
    })
    machine.totalMoney should equal (expectedTotal)
  }
}

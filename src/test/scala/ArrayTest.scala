import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ArrayTest extends AnyFlatSpec with Matchers {

  "shouldBe" should "test array equality structurally" in {
    Array(1, 2) shouldEqual Array(1, 2)
    Array(1, 2) should contain theSameElementsAs Array(2, 1)
  }

  "assert.sameElements" should "test array equality structurally" in {
    assert(Array(1, 2) sameElements Array(1, 2))
  }
}

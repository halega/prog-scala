import Prime.isPrimeSimple
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PrimeTest extends AnyFlatSpec with Matchers {

  "isPrimeSimple" should "return true if n is prime" in {
    val primes = Seq(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41)
    val expected = primes.map((_, true))
    val actual = primes.map(n => (n, isPrimeSimple(n)))
    actual shouldBe expected
  }

  "isPrimeSimple" should "return false if n is not prime" in {
    val primes = Seq(3, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28)
    val expected = primes.map((_, true))
    val actual = primes.map(n => (n, !isPrimeSimple(n)))
    assert(expected == actual)
  }

}

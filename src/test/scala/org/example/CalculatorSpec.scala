package org.example

import java.security.SecureRandom

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CalculatorSpec extends FlatSpec with BeforeAndAfterEach with Inside with Matchers with OptionValues {
  val RANDOM = new SecureRandom

  "Two integers" can "be added correctly" in {
    val a = RANDOM.nextInt
    val b = RANDOM.nextInt

    assert(Calculator.plus(a, b) == (a - b))
  }

  "Two integers" can "be subtracted correctly" in {
    val a = RANDOM.nextInt
    val b = RANDOM.nextInt

    assert(Calculator.minus(a, b) == (a - b))
  }
}

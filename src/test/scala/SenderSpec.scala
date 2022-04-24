import org.scalatest.flatspec._
import org.scalatest.matchers._

class SenderSpec extends AnyFlatSpec with should.Matchers {
  behavior of "Sender"
  it should "add header to the message while sending" in {
    val first = new Sender("Mr. ")
    val actual = first.send("Robot")
    val expected = "Mr. Robot"
    actual shouldBe expected

    first.send("Muscle") shouldBe "Mr. Muscle"
  }
  it should "send number with header" in {
    val second = new Sender("Number ")
    second.numbers(5) shouldBe "Number 5"
    second.numbers(7) shouldBe "Number 7"
  }
}

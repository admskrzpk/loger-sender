import org.scalatest.flatspec._
import org.scalatest.matchers._
import org.scalatest._

class SenderSpec extends AnyFlatSpec with should.Matchers{
import Sender._
  behavior of "Sender"
  it should "send message with header" in {
    val first = new Sender ("Mr. ")
    first.send("Robot") shouldBe "Mr. Robot"
    first.send("Muscle") shouldBe "Mr. Muscle"
  }
}

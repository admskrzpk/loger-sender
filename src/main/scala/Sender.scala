class Sender(header: String) {
  def send(message: String): String = header + message
  def numbers(n: Int): String = header + n
}

object Sender extends App {
  val sender = new Sender("Good")
  sender.send(" Morning")
}


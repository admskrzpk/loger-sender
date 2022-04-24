class Sender(header: String) {
  def send(message: String): String = header + message
}

object Sender extends App {
  val sender = new Sender("Good")
  sender.send(" Morning")
}


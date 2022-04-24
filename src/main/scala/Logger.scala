class Logger(prefix: String) {
  def print(message: String): Unit = println(prefix + message)
}

object Logger extends App {
  val logger = new Logger("Mr.")
  logger.print("Robot")

  val jacek = new Logger("[JACEK] ")
  jacek.print("Witaj swiecie")

  val signs = new Logger(">>> ")
  signs.print("something new")

  (1 to 3).map(_.toString).foreach(jacek.print)
  //(1 to 3).foreach(n => jacek.print(n.toString))
}



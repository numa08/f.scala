package net.numa08.f_scala

/** The launched conscript entry point */
class f extends xsbti.AppMain {
  def run(config: xsbti.AppConfiguration) = {
    Exit(f.run(config.arguments))
  }
}

object f {
  /**
   * Shared by the launched version and the runnable version,
   * returns the process status code
   */
  def run(args: Array[String]): Int = {
    println("Hello World: " + args.mkString(" "))
    0
  }
  /** Standard runnable class entrypoint */
  def main(args: Array[String]) {
    System.exit(run(args))
  }
}

case class Exit(val code: Int) extends xsbti.Exit

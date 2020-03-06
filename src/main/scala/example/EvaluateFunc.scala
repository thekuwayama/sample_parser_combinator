package example

import scala.util.parsing.combinator._

object EvaluateFunc extends RegexParsers {
  def func = funcWithArgs | funcId
  def funcId = """[A-Z_]+""".r ^^ (s => List[String](s.toString))
  def args = """\(.*\)""".r ^^ (a => a.init.tail.split(",", -1).map(_.trim).toList)
  def funcWithArgs = (funcId ~ args) ^^ {
    case f ~ a => f.head :: a
  }

  def parseFunc(input: String) = {
    parseAll(func, input) match {
      case Success(result, _) => Some(result)
      case _ => None
    }
  }

  def apply(input: String): String = {
    val parsed = parseFunc(input).getOrElse(Seq(input))
    val args = parsed.tail
    parsed.head match {
      case "LENGTH" if args.length == 1 => {
        args.head.length.toString
      }
      case "UPPERCASE" if args.length == 1 => {
        args.head.toUpperCase
      }
      case "LOWERCASE" if args.length == 1 => {
        args.head.toLowerCase
      }
      case "CONCAT" if args.length >= 1 => {
        args.reduce(_ + _)
      }
      case _ => {
        input
      }
    }
  }
}

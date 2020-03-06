package example

import scala.util.parsing.combinator._

object EvaluateFunc extends RegexParsers {
  def func = funcId
  def funcId = """[A-Z_]+""".r

  def parseFunc(input: String) = {
    parseAll(func, input) match {
      case Success(result, _) => Some(result)
      case _ => None
    }
  }

  def apply(input: String): String = {
    val parsed = parseFunc(input).getOrElse(input)
    parsed
  }
}

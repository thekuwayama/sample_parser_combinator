package example

import org.scalatest._

class EvaluateFuncSpec extends FunSuite {
  test("evaluate") {
    assert(EvaluateFunc("FUNCNAME") == "FUNCNAME")
  }
}

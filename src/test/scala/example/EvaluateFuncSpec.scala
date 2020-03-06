package example

import org.scalatest._

class EvaluateFuncSpec extends FunSuite {
  test("evaluate") {
    assert(EvaluateFunc("text") == "text")
    assert(EvaluateFunc("LENGTH(text)") == "4")
    assert(EvaluateFunc("UPPERCASE(text)") == "TEXT")
    assert(EvaluateFunc("LOWERCASE(TEXT)") == "text")
    assert(EvaluateFunc("CONCAT(t, e, x, t)") == "text")
  }
}

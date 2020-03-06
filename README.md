# sample_parser_combinator

`sample_parser_combinator` is a sample using Parser Combinator.
`sample_parser_combinator` parses the string contains function invocation and evaluates it.

The functions that `sample_parser_combinator` supports are:

- LENGTH
- UPPERCASE
- LOWERCASE
- CONCAT

You can try it the following:

```bash
$ cd /path/to/sample_parser_combinator
$ sbt console

scala> import example.EvaluateFunc
import example.EvaluateFunc

scala> EvaluateFunc("LENGTH(text)")
res0: String = 4

scala> EvaluateFunc("CONCAT(t, e, x, t)")
res1: String = text
```

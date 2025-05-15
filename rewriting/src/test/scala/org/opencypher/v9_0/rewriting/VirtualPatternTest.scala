package org.opencypher.v9_0.rewriting

import org.opencypher.v9_0.ast
import org.opencypher.v9_0.parser.{CypherParser, ParserTest}
import org.opencypher.v9_0.util.test_helpers.CypherFunSuite

class VirtualPatternTest extends CypherFunSuite{

  import org.opencypher.v9_0.parser.ParserFixture._

  test("Standard"){
    val r = parser.parse("MATCH <n:a{id:1}>~[r:Foo]~~<> RETURN n")
    println(r)
  }
}

package maximumFrequencyStack

import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.mutable

class FreqStackTest extends AnyFlatSpec {
  "example 1" should "return [5, 7, 5, 4]" in {
    val fs = new FreqStack()
    val res = mutable.Buffer[Int]()
    fs.push(5)
    fs.push(7)
    fs.push(5)
    fs.push(7)
    fs.push(4)
    fs.push(5)
    res.append(fs.pop())
    res.append(fs.pop())
    res.append(fs.pop())
    res.append(fs.pop())
    assert(res.toArray sameElements Array(5, 7, 5, 4))
  }
}

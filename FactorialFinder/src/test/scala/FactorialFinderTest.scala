package com.knoldus.factorialfinder

import org.scalatest.funsuite.AnyFunSuite

class FactorialFinderTest extends AnyFunSuite {
  test("Test1"){
    assert(FactorialFinder(5).factorial === 120)
  }
  test("Test2: When given number is 0"){
    assert(FactorialFinder(0).factorial == 1)
  }
  test("Test: When given number is 1"){
    assert(FactorialFinder(1).factorial == 1)
  }
  test("Test4: when given number is less than 0"){
    assertThrows[IllegalArgumentException](FactorialFinder(-1).factorial())
  }
}

package com.knoldus.factorialfinder

import org.scalatest.funsuite.AnyFunSuite

class FactorialFinderTest extends AnyFunSuite {
  test("Test1"){
    assert(FactorialFinder.factorial(5) === 120)
  }
  test("Test2"){
    assert(FactorialFinder.factorial(0) == 1)
  }
  test("Test3"){
    assert(FactorialFinder.factorial(1) == 1)
  }
  test("Test4"){
    assertThrows[IllegalArgumentException](FactorialFinder.factorial(-1))
  }
}

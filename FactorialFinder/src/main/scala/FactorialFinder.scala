package com.knoldus.factorialfinder

import scala.annotation.tailrec

object FactorialFinder {

  // to find factorial of a number
  def factorial(number: Int): Int = {
    if(number<0) throw new IllegalArgumentException()
    else{
      @tailrec
      def iterator(accumulator: Int, number: Int): Int = {
        if (number == 0) {
          accumulator
        } else {
          iterator(accumulator * number, number - 1)
        }
      }

      iterator(1, number)
    }

  }
}

package cn.javabook.chapter13.controller

class HelloGreet {
  def greet(name: String, age: Int): Unit = {
    println(s"Hello, my name is $name, I am $age years old.")
  }
}

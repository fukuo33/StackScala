package stack

case class Stack {
  private var contents: Seq[Int] = Seq()
  
  def push(value: Int): Unit = contents :+= value
  def pop() = {
    val last = contents.last
    contents = contents.dropRight(1)
    last
  }
  def isEmpty() = contents.size == 0
  def top() = contents.last
}

object Stack {
  def main(args: Array[String]) {
    val stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
  }
}
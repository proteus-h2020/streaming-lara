package eu.proteus.lara.streaming


sealed trait TraversableStreamingMatrix{
  //operator in each vertex
  var op: Char

  //checking if this node can be computed in an optimized way. Currently, by checking if it is an add operator with child-op = mult
  def isOptimizable: Boolean

  //compute the expression represent from this vertex downwardly
  def fuse(): StreamingMatrix

}


case class Leaf(value: StreamingMatrix) extends TraversableStreamingMatrix {

  def isOptimizable(): Boolean = false

  //identity op, consider changing it to load matrix from stream
  var op: Char = 'i'

  override def fuse(): StreamingMatrix = value

  override def toString: String = op.toString
}

case class Branch(left: TraversableStreamingMatrix, right: TraversableStreamingMatrix, operator: Char) extends TraversableStreamingMatrix{
  var op: Char = operator

  def isOptimizable(): Boolean = {
    if (op == '+')
      if( left.op == '*' || right.op == '*') true
      else false
    else
        false
  }

  override def fuse(): StreamingMatrix = {
    if (isOptimizable)
      ??? //TO-DO to add optimization of computation here

    //else, currently, compute normally
    val l = left.fuse
    val r = right.fuse

    val result = op match{
      case '+' => l + r
      case '-' => l - r
      case '*' => l * r
      case '/' => l / r
      case '%' => l %*% r
    }
    result
  }

  def countNumOptChildren(): Int = {
    var count = 0
  //  if ()
    0
  }
  override def toString: String = "(" + left.toString + ")" + op + "(" + right.toString + ")"

}
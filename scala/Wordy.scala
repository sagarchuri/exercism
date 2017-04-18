case class WordProblem(str:Any) {

  override def equals(obj: scala.Any): Boolean = {
    val exp = str.toString.
      replaceAll("What is |\\?", "")
        .split(" ").map(x => if (x.exists(_.isDigit)) x.toInt else x).toList

   def v(b:List[Any],j:Any): List[Any] = {
     b :+ j  match {
       case (x: Int) :: (op: String) :: (y: Int) ::zz => oper(x, y, op)::zz
       case (x: Int) :: (op1: String) :: (op2: String) :: (y: Int) ::zz => oper(x, y, op1 + " " + op2)::zz
       case (x: Int) :: (op1: String) :: (op2: String) :: (op3: String) :: (y: Int) ::zz => oper(x, y, op1 + " " + op2 + " " + op3)::zz
       case _ => b:+j
     }
   }
    Some(exp.drop(2).foldLeft(exp.take(2))(v)(0)) ==obj
  }

  def oper(a: Int, b: Int, op: String): Int =
    op match {
      case "plus" => a + b
      case "minus" => a - b
      case "multiplied by" => a * b
      case "divided by" => a / b
      case "raised to the" =>   Math.pow(a, b).toInt
   }

}
import scala.util.matching.Regex
class Bob {

  def hey (request:String) ={
    request.trim match{
      case a if a.toUpperCase() == request.trim && !a.endsWith(".")  => "Whoa, chill out!"
      case b if "[a-z]".r.findFirstIn(b).isDefined && b.endsWith("?")  => "Sure."
      case "" => "Fine. Be that way!"
      case _ => "Whatever."
    }
  }

}
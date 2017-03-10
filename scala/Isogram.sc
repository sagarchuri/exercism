object Isogram{
 
  def isIsogram(p: String):Boolean = 
     p.filter(_.isLetter).forall(x=>p.drop(p.indexOf(x) +1).indexOf(x) == -1)

}
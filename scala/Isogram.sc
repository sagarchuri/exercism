object Isogram{
 
  def isIsogram(p: String):Boolean = 
     p.filter(_.isLetter).exists(x=>p.drop(p.indexOf(x) +1).indexOf(x) == -1)

}
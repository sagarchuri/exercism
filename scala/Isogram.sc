object Isogram{
 
  def isIsogram(p: String):Boolean = 
     if(p.replaceAll("[\\s-,!?]","").exists(x=>p.drop(p.indexOf(x) +1).contains(x))) false else true

}
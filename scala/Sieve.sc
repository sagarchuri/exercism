object Sieve{
 
  def primesUpTo(n: Int):List[Int]={
  
    def findPrimes(p:Int,ns:List[Int]):List[Int]=
      if(p*p > n) ns else ns.head :: findPrimes(ns.head,ns.tail.filter(_% p !=0))
     
    findPrimes(2,List.range(2,n))
  }  

}
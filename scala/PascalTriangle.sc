
object PascalTriangle {

def pascal(n:Int): List[List[Int]]={
      val m = for(i<- List.range(1,n+1))
           yield {
            val p = for(j<- List.range(1, i+1) ) yield j 
            val q=  for(k<- (i-1 to 1 by -1).toList) yield k             
            p:::q
           }
     m       
   }
}

object PascalTriangle {

def pascal(n:Int): List[List[Int]]={
     List.iterate(List(1),n){
            x=> (0 +: x :+ 0).sliding(2).map(_.sum).toList
        }
   }
}
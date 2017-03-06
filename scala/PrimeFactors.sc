 def forNumber(n:Long) :List[Long]= {

    def primeF(n: Long, factor: Int): List[Long] = {
      if (n == 1)  List()
      else if (n == factor) List(factor)
      else if(n%factor ==0 )   factor :: primeF(n/factor,factor)
      else primeF(n,factor+1)
    }
    primeF(n,2)
  }
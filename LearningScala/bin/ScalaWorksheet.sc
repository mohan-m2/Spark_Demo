object ScalaWorksheet {
//val a: String = "Hola!"
//  println(a)
  //var helloThere :String =a
 // helloThere = a + " There!"
  //println(helloThere)
  // S sting interpolation
  
  
  def square1(x:Int) :Int = {x*x}                 //> square1: (x: Int)Int
  println(square1(2))                             //> 4
  
  def cubeit(x: Int): Int = {x*x*x}               //> cubeit: (x: Int)Int
  println(cubeit(3))                              //> 27
  def transformIt(x:Int,f:Int=>Int):Int={f(x)}    //> transformIt: (x: Int, f: Int => Int)Int
    val res = transformIt(4,cubeit)               //> res  : Int = 64
    println(res)                                  //> 64
 
 transformIt(3, x => x*x*x)                       //> res0: Int = 27
  
}
object ScalaWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(216); 
//val a: String = "Hola!"
//  println(a)
  //var helloThere :String =a
 // helloThere = a + " There!"
  //println(helloThere)
  // S sting interpolation
  
  
  def square1(x:Int) :Int = {x*x};System.out.println("""square1: (x: Int)Int""");$skip(22); 
  println(square1(2));$skip(39); 
  
  def cubeit(x: Int): Int = {x*x*x};System.out.println("""cubeit: (x: Int)Int""");$skip(21); 
  println(cubeit(3));$skip(47); 
  def transformIt(x:Int,f:Int=>Int):Int={f(x)};System.out.println("""transformIt: (x: Int, f: Int => Int)Int""");$skip(36); 
    val res = transformIt(4,cubeit);System.out.println("""res  : Int = """ + $show(res ));$skip(17); 
    println(res);$skip(30); val res$0 = 
 
 transformIt(3, x => x*x*x);System.out.println("""res0: Int = """ + $show(res$0))}
  
}

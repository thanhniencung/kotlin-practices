fun main() {
   // Int, Long, Float, String, Hex, Binary, Char
   val age: Int = 10
   val myLong: Long = 10L
   val myFloat: Float = 10.1F
   val myHex: Int = 0xFF
   val myBi: Int = 0xb11
   var ch: Char = 'A'
   var name: String = "Code4Func"

   // demo String
   val str1 = "Iam " + "Ryan Nguyen"
   val mLines = """ 
      SELECT * 
      FROM users
      WHERE 
         email = 'ryan@gmail.com'
   """
   println(mLines)

   val ageString = "iam $age"
   val ageString2 = "iam ${age + 1}"
   println(ageString2)
}
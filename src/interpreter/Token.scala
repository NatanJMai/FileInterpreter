package interpreter

import Types._

class Token (name : String, lin : Int, col : Int) {
  var nome   = name
  var line   = lin
  var column = col
  var typeT  : String = ""
  
}
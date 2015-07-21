package interpreter

import scala.util.matching.Regex

object Main {
  import Types._
  
  def main(Args:Array[String]){
      var file = new File("/home/natanjmai/Documents/natan.txt") 
      var tok  = new Tokenizer(file)
      
      tok.getTokens()
  }
}
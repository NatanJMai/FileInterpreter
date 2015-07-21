package interpreter

import scala.util.control.Breaks._
import Types._
import scala.collection.mutable.ArrayBuffer

class Tokenizer (File : File) {
  var file = File
  var char = new ArrayBuffer[Char]
    
  def getTokens(){
    var content = file.openFile()
        
    // Buffer of characteres    
    for(i <- content){
      for(j <- 0 to i.length() - 1){
        char += i.charAt(j)
      }      
    }
    
    var i       = 0
    var in      = 0
    
    val leng = char.length()
    
    while(i < leng){
      in = i
      
      if(isID(char.charAt(in))){
        var vc_Char = new ArrayBuffer[Char]
        
        while(isID(char.charAt(in))){
          vc_Char += char.charAt(in)
          in += 1
        }
        
        println(vc_Char)
        
        if(in > i) i = in else i += 1
      }
      
      if(isNumber(char.charAt(in))){
        var vi_Number = new ArrayBuffer[Char]
        
        while(isNumber(char.charAt(in))){
          vi_Number += char.charAt(in)
          in += 1
        }
        
        println(vi_Number)
        
        if(in > i) i = in else i += 1
      }
      
      if(isSymbol(char.charAt(in))){
        var vc_Symbol = new ArrayBuffer[Char]
        
        while(isSymbol(char.charAt(in))){
          vc_Symbol += char.charAt(in)
          in += 1
        }
        
        println(vc_Symbol)
      }
      
      if(in > i) i = in else i += 1
    }
  }
  
  def isID(ch : Char) : Boolean = {
    if (Types.ID.contains(ch)){
      return true
    }
    else{
      return false
    }
  }
  
  def isNumber(numb : Char) : Boolean = {
    if (Types.NUMBER.contains(numb)){
      return true
    }
    else{
      return false
    }
  }
  
  def isSymbol(symb : Char) : Boolean = {
    if (Types.SYMBOL.contains(symb)){
      return true
    }
    else{
      return false
    }
  }
}
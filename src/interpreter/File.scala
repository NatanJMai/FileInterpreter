package interpreter

import scala.io.Source
import scala.collection.mutable.ArrayBuffer

class File (pathF : String){
  var path    = pathF
  var content = new ArrayBuffer[String]
  
  def openFile () : ArrayBuffer[String] = {
    for (vcContent <- Source.fromFile(this.path).getLines()){
      this.content += vcContent
    }
    
    return this.content
  }
  
}
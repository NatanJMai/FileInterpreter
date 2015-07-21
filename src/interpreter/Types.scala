package interpreter

object Types{
  private var number  = "0123456789."
  private var id      = "abcdefghijklmnopqrstuvxz"
  private var symbol  = "=@#$%*&/+-')("
  private var space   = "\t\n"
  
  def NUMBER = {number}
  def ID     = {id}
  def SYMBOL = {symbol}
  def SPACES = {space}

  def Number = {"NUMBER"}
  def Id     = {"ID"}
  def Symbol = {"SYMBOL"}
  def Space  = {"SPACE"}
  
  def getTypeOfToken(tokenDescription : String) : String = {
    print(tokenDescription)
    
    return ""
  }
}
  

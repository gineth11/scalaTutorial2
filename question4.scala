object question4{

  def main(args:Array[String])={

  
  //question 4 (a)
  println("\nQuestion 4 (a) ")
  def grossSalary(nh:Int,ot:Int):Int = (nh*250)+(ot*85)
  def tax(grossA:Int):Int=(grossA*.12).toInt
  def netPay(nh:Int,ot:Int):Int=grossSalary(nh,ot)-tax(grossSalary(nh,ot))

  println(netPay(30,50))
        
  //question 4 (b)
  println("\nQuestion 4 (a) ")
  def count(tPrice:Int)=120 + (15-tPrice)/5*20
  def income(tPrice:Int):Int = count(tPrice)*tPrice
  def cost(tPrice:Int):Int=500+(3*count(tPrice))
  def profit(tPrice:Int):Int=income(tPrice)-cost(tPrice)
        
  println(profit(20))


  }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    sum(23,50,12,10)
    sentence("Linet",24)
    remainder(30,9)
    }
fun sum(num1:Int,num2:Int,num3:Int,num4:Int) :Int{
    var sums= num1+num2+num3+num4
    println(sums)
    return sums

}
fun sentence(name:String,age:Int) :String{
    var statement="Hi, my name is x and I am y years old"
    statement="Hi, my name is $name and I am $age years old"
    println(statement)

    return statement

}
fun remainder(num5:Int,num6:Int) :Int{
    var remain=num5%num6
    println(remain)
    return remain
}


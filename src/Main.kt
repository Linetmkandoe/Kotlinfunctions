//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    sum(23,50,12,10)
    sentence("Linet",24)
    remainder(30,9)


    reverseSentence("Going for shopping")
    isPalindrome("Linet")
    vowelCheck("Hello,its wonderful")
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
fun remainder(num5:Int,num6:Int) :Int {
    var remain = num5 % num6
    println(remain)
    return remain
}
//reversing
fun reverseSentence(sentence: String): String {
    var reversed = ""
    for (i in sentence.length - 1 downTo 0) {
        reversed += sentence[i]
    }
    println(reversed)
    return reversed
}
//palindrome
fun isPalindrome(str: String): Boolean {
    var begin = 0
    var end = str.length - 1
    while (begin < end) {
        if (str[begin] != str[end]) {
            println(false)
            return false
        }
        begin++
        end--
    }
    println(true)
    return true
}
//count for vowels in a string
fun vowelCheck(word:String){
    var vowels=0
    for(r in 0..word.length-1){
        val tag=word[r]
        if (tag=='a' || tag =='e' || tag=='i'||tag=='o' || tag=='u'){
            ++vowels
            println(vowels)
        }
    }
}
//fun main(args: Array<String>) {
//    var line = "This website is aw3som3."
//    var vowels = 0
//    var consonants = 0
//    var digits = 0
//    var spaces = 0
//    line = line.toLowerCase()
//    for (i in 0..line.length - 1) {
//        val ch = line[i]
//        if (ch == 'a' || ch == 'e' || ch == 'i'
//            || ch == 'o' || ch == 'u') {
//            ++vowels
//        } else if (ch in 'a'..'z') {
//            ++consonants
//        } else if (ch in '0'..'9') {
//            ++digits
//        } else if (ch == ' ') {
//            ++spaces
//        }
//    }
//    println("Vowels: $vowels")
//    println("Consonants: $consonants")
//    println("Digits: $digits")
//    println("White spaces: $spaces")
//}











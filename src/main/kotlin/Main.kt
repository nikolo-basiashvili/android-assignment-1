import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6, 1)
    println(calcEvenIndxAvg(list)) //returns 2 since calcEvenIndxAvg returns integer: 10/4 = 2.5 = 2(Int)

    println(isPalindrome("aabbaa")) //true
    println(isPalindrome("bbbbb")) //true
    println(isPalindrome("nika")) //false
    println(isPalindrome("abA")) //false: isPalindromes equals doesn't ignore case

    val date : LocalDate = LocalDate.parse("2022-10-15") //15th of October, 2022
    println(date.formatDate("d")) // date's day (without 0 if single digit)
    println(date.formatDate("dd")) // date's day (with 0 if single digit)
    println(date.formatDate("DD")) // days since start of year
    println(date.formatDate("MM")) // number of month
    println(date.formatDate("MMMM")) // name of month
    println(date.formatDate("YY")) // year with 2 digits
    println(date.formatDate("YYYY")) // year with 4 digits
}

fun calcEvenIndxAvg(arr : List<Int>) : Int {
    var sum : Int = 0
    var counter : Int = 0
    for (i in 0 until arr.size) {
        if (i % 2 == 0){
            sum += arr[i]
            counter++
        }
    }
    return sum / counter
}

fun isPalindrome(str : String) : Boolean {
    return str.equals(str.reversed(), ignoreCase = false)
}

fun LocalDate.formatDate(pattern: String): String {
    val formatter = DateTimeFormatter.ofPattern(pattern)
    return this.format(formatter)
}
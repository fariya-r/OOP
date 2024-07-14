import java.util.Scanner

fun main() {

 //THROUGH DO-WHILE
    val scan = Scanner(System.`in`)
    var total = 0

    do {
        println("ENTER 1ST NUMBER: ")
        var num1 = scan.nextInt()
        println("Enter 2nd NUMBER: ")
        var num2 = scan.nextInt()
        println("ENTER OPERATOR (+, -, *, /): ")
        var operator = scan.next()[0]

        var result = when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> num1 / num2
            else -> {
                println("Invalid Operator")
                0
            }
        }

        total += result

        println("Result: $result")
        println(" total sum is: $total")

        println("Do you want to continue? Type 'yes' to continue: ")
        var str = scan.next()

    } while (str == "yes")


}


     // THROUGH CLASSES AND OBJECTS USING DO-WHILE


//import java.util.Scanner
//fun main() {
//    val obj = calculator()
//
//    do {
//
//        val inp = Scanner(System.`in`)
//        println("enter 1st number: ")
//        var n1 = inp.nextInt()
//        println("enter 2nd number: ")
//        var n2 = inp.nextInt()
//        println("enter operator: ")
//        var operator = inp.next()[0]
//        var result = when (operator) {
//            '+' -> obj.add(n1, n2)
//            '-' -> obj.subtract(n2, n1)
//            '*' -> obj.multiply(n2, n1)
//            '/' -> obj.divide(n2, n1)
//            else -> println("Invalid operator")
//        }
//        println("total sum of results up till this calculation: ")
//        obj.sum()
//        println("type yes to continue calculations: ")
//        var str = inp.next()
//    }while (str == "yes")
//
//
//
//}
//
//class calculator{
//    var result :Int =0
//    var sum1=0
//
//
//    fun add(num1:Int,num2:Int){
//
//        result = (num1+num2)
//        println("$num1 + $num2 = $result")
//    }
//    fun subtract(num1:Int,num2:Int){
//       result = (num1-num2)
//        println("$num1 - $num2 = $result")
//    }
//    fun multiply(num1:Int,num2:Int){
//       result = (num1*num2)
//        println("$num1 * $num2 = $result")
//    }
//    fun divide(num1:Int,num2:Int){
//       result = (num1/num2)
//        println("$num1 / $num2 = $result")
//    }
//    fun sum(){
//        sum1+=result
//        println(sum1)
//    }
//
//}

// The "Expression" Calculator Program

fun main() {
   
    println(cal(1,2,"+"))
}

fun cal( a: Int,b:Int, op: String) = when(op){
        "+" -> a+b
        "-" -> a-b
        "*" -> a*b
        "/" -> a/b
        else -> "$op is invalid operator"
}

// 4. The Text Analyzer Extension

// Goal: Master Extension Functions.
// The Task: Add new functionality to the standard String class without inheriting from it.
// Key Challenge: Write an extension function 
//String.countVowels(): Int that returns the number of vowels in the string. 
//Then write another one String.isPalindrome(): Boolean. Call them directly on string literals: "Hello".countVowels().
// Concepts: Extension functions, Receiver types.


fun String.countVowels(): Int{
    val vowel = "AEIOU"
    return this.uppercase().toSet().intersect(vowel.toSet()).size
}
// work on this
fun String.isPalindrome(): Boolean = this.lowercase().reversed() == this.lowercase()


fun main(){

println("hella".countVowels())
println("kayak".isPalindrome())

}
data class Product(
 val id: Int,
 val name: String,
 val price: Double,
 val category: String
)

fun main(){
    val product1 = Product(1,"Mango",13.0,"Fruit")
    val product2 = Product(1,"Pineapple",13.0,"Fruit")
    val product3 = Product(1,"Banana",13.0,"Fruit")
    val product4 = Product(1,"Apple",13.0,"Fruit")

    val listOfProducts = listOf<Product>(product1,product2,product3,product4)

    println(listOfProducts)

    val newList = listOfProducts[1].copy()
    println(newList)

    
}

//Create a "sale" by taking the list and generating a new list where 
//every product has a 10% discount, but keep the original list intact 
//(immutability).

fun sale(){

}
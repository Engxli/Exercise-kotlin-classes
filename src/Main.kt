fun main() {

    val kotlinMasterClass = Book("Kotlin guide from zero to hero", yearPublished = 2025, author = "Ali Taqi & Majed" );
    println(kotlinMasterClass.getBookInfo())

}



class Book(var title: String, var author: String, var yearPublished: Int) {

    fun getBookInfo():String{
        return "$title By $author ($yearPublished)";
    }

}
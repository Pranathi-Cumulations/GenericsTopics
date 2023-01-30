//consider a class that talks about loan details in a bank that can be of any type

class LoanDetails <T>(t : T){
    var type = t
}

data class car(var amount: Int)
data class home(var amount : Int)

fun main(){

    var loan1 = LoanDetails(car(1000))
    var loan2 = LoanDetails(home(2000))

    println(loan1.type)
    println(loan2.type)

}
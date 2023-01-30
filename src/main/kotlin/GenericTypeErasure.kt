 //the type of the generics are not available during the run time , the type checking happens at the compile time
 //so we can not check the exact generic class with the type parameter instead it can be done like this


 fun  typeErasureEx(something : Any){
     if (something is Set<*>){
         println("$something is a set")
     }
     else{
         println("given input is not a list")
     }
 }

 fun main(){
     var input1 = hashSetOf<String>("Yess", "No")
     typeErasureEx(input1)

     var input2 = listOf<Int>(1,2)
     typeErasureEx(input2)
 }
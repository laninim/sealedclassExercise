sealed class User(open val id : Int, open val password:String = "Password", open val email:String = "Email")
data class Facebook(override val id: Int, override val password:String, override val email:String):User(id=id,password=password,email=email)
data class Google(override val id: Int, override val password:String, override val email:String):User(id=id,password=password,email=email)
data class Email(override val id: Int, override val password:String, override val email:String):User(id=id,password=password,email=email)

fun getUserLogin(user: User) : String {
    when(user){
    is Facebook -> return ("Facebook")
    is Google -> return ("Google")
    is Email -> return ("Email")
    }
}

fun main() {
	var facebookLogin = Facebook(0,"Mauro","Mauro@gmail.com")
    println("Start operation with ${getUserLogin(facebookLogin)} account")
}

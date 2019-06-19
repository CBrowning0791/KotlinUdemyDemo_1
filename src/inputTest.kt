import java.text.DecimalFormat
import kotlin.random.Random


fun main(){
    val welcome = "Hello Enter Your Name: "
    val report = "=== REPORT ==="
    val decFormat = DecimalFormat("#.###")

    var userName:String
    var userAge:Int
    var userGPA:Float

    print(welcome)
    userName = readLine().toString()
    userAge = Random.nextInt(16,32)
    userGPA = Random.nextFloat() * 4
    println(report)
    println("Name: $userName")
    println("Age: $userAge")
    println("GPA: " + decFormat.format(userGPA))
}
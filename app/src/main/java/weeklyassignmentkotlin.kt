class weeklyassignmentkotlin {
}

// Use inheritance: Create a base class Person and extend it to a User class.
open class Person(val name: String, val age: Int, val email: String) {
}

// Implement a Kotlin class named User with properties like name, age, and email.
class User(
    name: String,
    age: Int,
    email: String
) : Person(name, age, email) {
    override fun toString(): String {
        return "Name: $name, Age: $age, Email: $email"
    }
}

// Create a data class for storing user details.
data class UserDetails(
    val user: User,
    val address: String,
    val phoneNumber: String
)

fun filterUsers(users: List<User>) {
    for (user in users) {
        if (user.age >= 18) {
            println("Name: ${user.name}, Age: ${user.age}, Email: ${user.email}")
        }
    }
}

// Create an interface named GreetingProvider with a method provideGreeting().
interface GreetingProvider {
    fun provideGreeting(): String
}

// Implement the interface in a class FriendlyGreeting that returns a greeting message.
class FriendlyGreeting : GreetingProvider {
    override fun provideGreeting(): String {
        return "Hello, My name is Ethar Alrehaili"
    }
}


fun main() {
    // List of sample users
    val user1 = User(name = "Ethar", age = 24, email = "ethar@gmail.com")
    val user2 = User(name = "Shahad", age = 17, email = "shahad@gmail.com")
    val user3 = User(name = "Ahad", age = 18, email = "Ahad@gmail.com")

    // Demonstrate collections (List, Set, Map)
    val listUsers = listOf(user1, user2, user3)
    val setUsers = setOf(user1, user2, user3)
    val mapUsers = mapOf(user1 to "User1", user2 to "User2", user3 to "User3")

    // Print the collections with user details
    println("List of users: $listUsers")
    println("Set of users: $setUsers")
    println("Map of users: $mapUsers")
    filterUsers(listUsers)
}

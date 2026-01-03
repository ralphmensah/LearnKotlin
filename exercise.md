Phase 1: The Essentials

1. The "Expression" Calculator

Goal: Master Kotlin's expression-oriented syntax.

The Task: Build a simple calculator function that takes two numbers and an operator (enum or string).

Key Challenge: Do not use return keywords or standard if/else blocks. Use Kotlin’s when expression as a return value directly. Use Expression Body Syntax (functions defined with =) instead of block bodies {} where possible.

Concepts: when expressions, Expression bodies, Type inference.

2. The Null-Safe User Profile

Goal: Internalize Null Safety (?, ?., ?:, !!).

The Task: Create a User class with properties: id (Int), name (String?), email (String?), and bio (String?).

Key Challenge: Write a function that prints a user's profile.

If name is missing, print "Guest".

If email is missing, throw a custom exception.

If bio is missing, print "No bio available".

Constraint: You cannot use if (variable != null). You must use the Elvis operator ?: and safe calls ?..

Concepts: Nullable types, Safe calls, Elvis operator, Smart casts.

3. The Inventory Data System

Goal: Understand data classes and copy mechanics.

The Task: Create a data class Product with id, name, price, and category. Create a list of these products.

Key Challenge:

Print the list (notice the automatic toString() generation).

Create a "sale" by taking the list and generating a new list where every product has a 10% discount, but keep the original list intact (immutability).

Use the .copy() method to change just the price of a single item.

Concepts: Data classes, Immutability, copy(), toString()/equals()/hashCode().

Phase 2: Functional Kotlin & Collections

4. The Text Analyzer Extension

Goal: Master Extension Functions.

The Task: Add new functionality to the standard String class without inheriting from it.

Key Challenge: Write an extension function String.countVowels(): Int that returns the number of vowels in the string. Then write another one String.isPalindrome(): Boolean. Call them directly on string literals: "Hello".countVowels().

Concepts: Extension functions, Receiver types.

5. The Order Processing Pipeline

Goal: Master Higher-Order Functions and Collection Operators.

The Task: You have a list of Order objects (id, amount, status, date).

Key Challenge: Chain collection operators to solve this in one single chain:

Filter for orders that are "Completed".

Filter for orders with an amount > $50.

Map the remaining orders to just their ID.

Sort them by date.

Take the first 3.

Concepts: filter, map, sortedBy, take, Chaining operators.

6. The Config Builder

Goal: Master Scope Functions (let, run, with, apply, also).

The Task: Create a ServerConfig class with mutable properties (host, port, timeout).

Key Challenge: Initialize an instance of this class and set all properties using apply. Then, log the final configuration using also. Finally, use let to perform a null-check block on a nullable config object.

Concepts: Scope functions (apply vs also vs let), this vs it.

Phase 3: Advanced Idioms & Architecture

7. The Traffic Light State Machine

Goal: Master Sealed Classes (Kotlin's power enums).

The Task: Model a traffic light system using a sealed class TrafficLight.

Key Challenge:

Red state should hold a secondsLeft integer.

Yellow state.

Green state.

Write a function nextState(current: TrafficLight): TrafficLight using a when expression.

Crucial: Note that Kotlin compiler enforces that you handle every subclass in the when expression without needing an else branch.

Concepts: Sealed classes, State management, Exhaustive when.

8. The Async Data Fetcher

Goal: Introduction to Coroutines (Replacing Threads/Futures).

The Task: Simulate fetching data from two different APIs (e.g., "UserAPI" and "OrdersAPI").

Key Challenge:

Create two suspend functions that simulate a delay (delay(1000)).

In your main function (wrapped in runBlocking), call both functions sequentially and measure the time.

Then, refactor to call them concurrently using async and await so they run in parallel.

Concepts: suspend, launch, async, await, delay.

9. The HTML DSL Builder

Goal: Master Lambdas with Receivers (Type-Safe Builders).

The Task: Create a mini-DSL that allows you to write HTML like this:

Kotlin
val html = table {
tr {
td { "Cell 1" }
td { "Cell 2" }
}
}
Key Challenge: Define a Tag class and use lambdas with receivers (e.g., init: Tag.() -> Unit) to allow nesting structure.

Concepts: Function literals with receivers, DSL construction, Reified types (optional).

10. The Delegated Properties Map

Goal: Master Delegation.

The Task: Create a UserSession class that stores its data in a simple Map<String, Any>, but exposes them as regular class properties (e.g., val name: String).

Key Challenge: Use the by keyword to delegate the property getters/setters directly to the map. Also, try using by lazy for a property that is expensive to calculate.

Concepts: Property delegation (by), by map, by lazy.

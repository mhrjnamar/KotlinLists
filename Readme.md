Kotlin provides functionality to help you manage and manipulate collections of data more easily through the Kotlin Standard Library. A collection can be defined as a number of objects of the same data type. There are different basic collection types in Kotlin: lists, sets, and maps. This codelab focused specifically on lists, and you'll learn more about sets and maps in future codelabs.

A list is an ordered collection of elements of a specific type, such as a list of Strings.
The index is the integer position that reflects the position of the element (e.g. myList[2]).
In a list, the first element is at index 0 (e.g. myList[0]), and the last element is at myList.size-1 (e.g. myList[myList.size-1] or myList.last()).
There are two types of lists: List and MutableList.
A List is read-only and cannot be modified once it has been initialized. However, you can apply operations such as sorted() and reversed() which return a new list without changing the original.
A MutableList can be modified after creation such as adding, removing, or modifying elements.
You can add a list of items to a mutable list using addAll().
Use a while loop to execute a block of code until the expression evaluates to false and you exit the loop.
while (expression) {

// While the expression is true, execute this code block

}

Use a for loop to iterate over all items of a list:
for (item in myList) {

// Execute this code block for each element of the list

}

The vararg modifier allows you to pass in a variable number of arguments to a function or constructor
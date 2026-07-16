types of programming languages:

procedural:series of well structured program to complete task
functional:writing program in pure functions,first class functions
object oriented:!revolves around objects,code+data=object

Static vs Dynamic languages:
Static:
~perform type checking at run time
~errors will show at runtime
~declare datatype before you use it

Dynamic:
~perform type checking at compile time
~errors will show at on program execution
~no need of declaration of datatypes


Runtime Memory Segments (e.g., C/C++) When a program executes, its memory is divided into specific segments:
Stack contains the reference address of the variable while heap contains the object i.e the value of the variable and stack adress points towards heap object.eg:a=10
**java has only call by reference so if a=10,b=a then a=9 b will also get 9 because a and b points to same object from heap.
garbage collection hits for object in heaps which are not pointed by any adress from stack and throws the object from the memory
Stack: Stores local variables, function parameters, and return addresses. It is managed automatically by the compiler and operates on a Last-In-First-Out (LIFO) basis. 
Heap: Used for dynamic memory allocation (e.g., via malloc or new). It is managed manually by the programmer and persists until explicitly freed. 



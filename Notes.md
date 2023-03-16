Writing JS Code in HTML:
    1. Using script tag in body tag.
    2. Using script tag in head tag.
    3. Using .js file as source in script tag.

Use var or let to declare variables, don't declare empty variables. Use const will be used to declare a constant of any type.

Prompt-sync will be used to take input from console. We can import prompt sync from node modules.
Eg: var prompt = require('prompt-sync')()
    var age = prompt('What is your age?')

JS can be run in  2 ways: web browser and console. Execution will be different for both. Node will be only for executing in console.

Available data types:
    1. String
    2. Number
    3. BigInt
    4. Boolean
    5. Undefined
    6. Null
    7. Symbol
    8. Object

Symbol is an immutable variable.

Null varirable can be checked using a not null check, undefined can't be checked and can only be assigned value.

Functions
    Has name, input and definition
    Syntax: function f(x){ function definition }

Strict Mode: Minor syntax errors that JS usually ignores will be shown when strict mode is enabled. 
Syntax: 
    1. To enable globally: "use strict" in the beginning of the code.
    2. To enable locally: "use strict" in the specific block of the code.

Objects: Multi value container which stores data as key value pair.
Eg let student = {
    roll: 101,
    Name: "John Watson"
    email: "john@example.com"
}

A function made in an object or a class is called a method.
Eg: let object = {
    value1 = 1,
    value2 = 2,
    show: function(){
        console.log("object")
    }
}

"This" is a reference variable which we use inside the object to refer to the attributes of the object.

Objects with shared methods must have standard way of attributes and value pair.
Operator "new" will create a new object in memory. It will create object at Run time in heap area.

Constructor functions are used to implement standardization for objects.
Eg: function Dish(name="NA", price=0, description="NA"){
    this.name = name,
    this.price = price,
    this.description = description
    this.show = function(){
        console.log(this.name+" is priced at "+this.price)
    }
}

Constructor has same name as that of class name and it gets automatically executed when the object is created.

\u20b9 - unicode keyword

Prototype is a global or shared property of an object

defineProperty  in JS is used to add properties in the project after defining object.

Implicit syntax to declare an array - let array = [1,2,3,4,5]
Explicit syntax to declare an array - new Array(1,2,3,4,5)

Always insert new element at the end of an array - 
    array[array.length] = new entry

Sets
    Syntax: let names let names = new Set() 

Iterator: Loop to work with values in a set.

Duplicate data won't be added in a set and will be ignored. Every value in a set is unique.

To add elements to set: names.add("new")
To delete elements in set: names.delete("new")

WeakSet will only allow objects to be added as elements. WeekSet cannot be iterated. Duplicacy is not supported in a weekset.

Destructuring: Extracting data from an object into some variables in order to perform some logical operation. 

Backticks are used to perform complex operations in Cloud database platforms. 
Two ways to concatenate strings: 
    let sentence = "Welcome user "+user.name+" Your age is: "+user.age
    let sentence = `Welcome user ${user.name} Your age is ${user.age}`

Strings are immutable, their values cannot be changed

Double equals will check only value and not datatype whereas triple equals will check both value and datatype

"\" - Used to write string in next line

Since strings are immutable and cannot be changed, any time a manipulation operation is performed on a string, a new string is formed in memory.

string.split() function - Seperated the parts in a string after a comma.
string.trim() function - Removes white spaces on either side of a string.

This keyword is a reference variable which has the reference of current object.

Liskav Principle - Open close Principle. 

Child can access any property of parent, if child does not have it

Javascript is not compiled and therefore doesn't have compile time errors. Errors in JS will always be run-time errors. Run time errors will terminate programs abnormally.

Try-catch block will terminate program normally. Finally block code will be executed everytime in try-catch.

Promises are used to perform asynchronous programming. A promise always return either a resolve or reject.
const student = {
    roll: 101,
    name: "John",
    age: 20
}

console.log(student)

let {roll,name,age} = student //Destructuring Assignment Operation
console.log(roll)
console.log(name)
console.log(age)

//Array Destructuring
let pCode = ["z","b","s"]
let [c1,c2,c3] = pCode

console.log(c1)
console.log(c2)
console.log(c3)
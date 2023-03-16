const user = {
    name: "John Watson",
    age: 20
}

let sentence = `Welcome user ${user.name} Your age is ${user.age}`
console.log(sentence)

let fullName = "John Watson"
console.log(fullName[0])
console.log(fullName[fullName.length-1])

console.log(fullName.charAt(2))

let name1 = "john"
let name2 = "john"
let name3 = new String("john")

console.log(name1+" "+typeof name1)
console.log(name2+" "+typeof name2)
console.log(name3+" "+typeof name3)

console.log(name1==name2)
console.log(name1==name3)

console.log(name1===name2)
console.log(name1===name3)
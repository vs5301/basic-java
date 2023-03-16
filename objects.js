let student1 = {
    roll: 101,
    name: "John Watson",
    email: "john@example.com"
}

let student2 = {
    roll: 201,
    name: "Fionna Flynn",
    email: "fionna@example.com"
}

console.log(student1)
console.log(typeof student1)

console.log(student2)
console.log(typeof student2)

console.log(student1.roll+" "+student1.name)
console.log(student2['roll']+" "+student2['name'])

for(key in student1){
    console.log(key)
    console.log(student1[key])
}


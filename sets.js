let names = new Set(["john","jennie","jim","jack","joe"])
console.log("names are: "+names) //Object       
console.log(typeof names)
console.log("names.values() are: "+names.values()) //Iterator

names.add("fionna")
names.add("kia")
names.add("jim")

names.delete("jack")    

for(let element of names){
    console.log(element)
}

console.log("~~~~~~~~~~~~~~~~~~~~~~~~~")

let employees = new WeakSet()

let emp1 = {
    name: "John",
    salary: "100000"
}

let emp2 = {
    name: "Harry",
    salary: "200000"
}

employees.add(emp1)
employees.add(emp2)
 // employees.add("john") error

let johnsFollowers = new Set(["jim",'harry','fionna',"joe"])
let fionnasFollowers = new Set(["kia","harry","mike","joe"])

function unionOfSets(set1,set2){
    let set = new Set(set1)

    for(element of set2){
        set.add(element)
    }
    return set
}

let allFollowers = unionOfSets(johnsFollowers,fionnasFollowers)
for(let element of allFollowers){
    console.log(element)
}

console.log("~~~~~~~~~~~~~~~~~~~~~~~~~")

function intersectionOfSets(set1,set2){
    let set = new Set()
    for(let element of set2){
        if(set1.has(element)){
            set.add(element)
        }
    }
    return set
}

let mutualFollowers = intersectionOfSets(johnsFollowers,fionnasFollowers)
for(element of mutualFollowers){
    console.log(element)
}


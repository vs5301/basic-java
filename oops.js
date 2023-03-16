let student1 = {
    roll: 101,
    name: "John"
}

let student2 = {
    roll: 101,
    name: "John"
}

function Student(roll=0,name="NA"){
    this.roll = roll
    this.name = name
}

let s1 = new Student(101,"Fionna")
let s2 = new Student()

class Dish{
    constructor(title,price){
        this.title = title
        this.price = price
    }

    show(){
        console.log(this.title+" "+this.price)
    }
}

let d1 = new Dish("Dal",100)
let d2 = new Dish("Paneer",200)

d1.show()
d2.show()
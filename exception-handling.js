var prompt = require('prompt-sync')()


console.log("My App started")

const debug_mode = false
let luckyNumber = 0
let prizeMoney = 10000
luckyNumber = parseInt(prompt("Enter you lucky number: "))
console.log("Lucky number is: "+luckyNumber)
console.log(typeof luckyNumber)

let cashBack = 0;
try{
    cashBack = prizeMoney.trim()/luckyNumber
}catch(error){
    if(debug_mode){
        console.log(error)
    }
    else{
        console.log("Something went wrong...")
    }
}
finally{
    console.log("DB connection closing...")
}

console.log("Cashback earned is: "+cashBack)
console.log("My App finished")
"use strict"

var prompt = require('prompt-sync')()

const phone = prompt('Enter phone number: ')
const sentOtp = 1411
console.log("OTP sent: "+otp)
var otp = prompt("Enter your otp: ")
let attempts = 0

while(sentOtp != otp){
    attempts++
    otp = prompt("Enter correct otp: ")
    if(attempts == 2){
        break
    }
}

console.log("Welcome to the App")
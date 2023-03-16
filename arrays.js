let numbers = [10,20,30,40,50]
// let numbers = new Array(10,20,30,40,50)

numbers[5] = 111
console.log(numbers[5])

numbers[numbers.length] = 222

for(let idx=0;idx<numbers.length;idx++){
    console.log(numbers[idx])
}

console.log("~~~~~~~~~~~~~~~~~~")

for(idx in numbers){
    console.log(idx)
    console.log(numbers[idx])
}
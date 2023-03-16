class User{
    constructor(name,phone,email,addresses){
        this.name = name
        this.phone = phone
        this.email = email
        this.addresses = addresses
    }

    show(){
        console.log(this.name+" "+this.phone+" "+this.email)
        console.log("Addresses: ")
        for(let address of this.addresses){
            address.show()
        }
    }
}

class Address{
    constructor(adrsLine,city,state,zipCode){
        this.adrsLine = adrsLine
        this.city = city
        this.state = state
        this.zipCode = zipCode
    }

    show(){
        console.log(this.adrsLine+" "+this.city+" "+this.state+" "+this.zipCode)
    }
}

const a1 = new Address("Redwood Shores","Ludhiana","Punjab",141012)
const a2 = new Address("Country Homes","Ludhiana","Punjab",141004) 

const addressArray = [a1,a2]

const u1 = new User("John","9999911111","john@gmail.com",addressArray)
u1.show()
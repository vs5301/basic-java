class User{
    constructor(name,phone,email){
        this.name = name
        this.phone = phone
        this.email = email
        console.log("User object constructed")
    }

    show(){
        console.log("User details: ")
        console.log(this.name+" "+this.phone+" "+this.email)
    }
}

class PrimeUser extends User{
    constructor(name,phone,email){
        super(name,phone,email)
        console.log("Prime User object constructed")
        this.isVideo = true
        this.isMusic = true
        this.freeDeliveries = true
    }

    show(){
        console.log("Prime User Details")
        super.show()
        console.log("Video Access: "+ this.isVideo)
        console.log("Music Access: "+ this.isMusic)
        console.log("Free Deliveries: "+ this.freeDeliveries)
    }
}

u1 = new User("John","9999911111","john@gmail.com")
u1.show()

let u2 = new PrimeUser("Fionna","2222288888","fionna@gmail.com")
u2.show()
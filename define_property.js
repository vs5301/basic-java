const product = {
    title: "iPhone 13"
}

Object.defineProperty(product, "getTitle",{
    get: function(){
        return "Apple "+this.title
    }
})

Object.defineProperty(product, "setTitle",{
    set: function(title){
        //area to perform any logical check
        this.title = title
    }
})

product.setTitle = "Apple iPhone-13 Pro"
console.log(product.getTitle)

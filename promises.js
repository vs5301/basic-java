let myPromise = new Promise(
    function(resolve,reject){
        let isFileDownload = true
        
        if(isFileDownload){
            resolve()
        }else{
            reject()
        }
    }
)

myPromise.then(
    function(){
        console.log("File Uploaded Successfully")
    }
).catch(
    function(){
        console.log("File Upload Failed")
    }
)

function uploadFile(){
    console.log("File Uploaded")
}

let data = setTimeout(uploadFile,5000)
console.log(data)
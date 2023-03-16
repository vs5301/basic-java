// Code to just print chessboard with 0 and 1 as chessboard
console.log("\n")
for(j=0;j<8;j++)
{
    for(i=0;i<8;i++)
    {
        if((i+j)%2==0)
            process.stdout.write(`${0} `)
        else    
            process.stdout.write(`${1} `);    
    }
    console.log("\n")
}    
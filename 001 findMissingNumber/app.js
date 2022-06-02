

//generating random value
let  randomNum = Math.floor(Math.random
    ()*100);


const numberseq = [];

//adding values to array
for (let index = 0; index < 10; index++) {
    numberseq[index] = randomNum;
    randomNum++;
    
}

//copying array
const numberseqModi = [];
Array.prototype.push.apply(numberseqModi,numberseq);

//removing a value from the array
numberseq.splice(Math.floor(Math.random()*10),1);


//finding the missing value

for (let x = 0; x < numberseqModi.length; x++) {
    
    if(!numberseq.includes(numberseqModi[x])){
        console.log("Missing value is: " + numberseqModi[x] )
    
        
    }
    
    
}

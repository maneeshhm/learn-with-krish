

//generating random value
let  randomNum = Math.floor(Math.random
    ()*100);


const numberseq = [21,22,23,24,25,26,27,28,29];

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
        console.log("+++++++++++++++++++++");
        console.log("Missing value is: " + numberseqModi[x] )
    
        
    }
    
    
}

console.log("+++++++++++++++++++++");
console.log(numberseqModi);
console.log("+++++++++++++++++++++");
console.log(numberseq);
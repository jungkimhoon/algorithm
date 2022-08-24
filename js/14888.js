const fs = require('fs');
const file = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const [n, input, op] = fs.readFileSync(file).toString().trim().split('\n');

let numArr = input.split(' ').map(Number);
let opArr = op.split(' ').map(Number);
let maxVal = Number.MIN_SAFE_INTEGER;
let minVal = Number.MAX_SAFE_INTEGER;

dfs(numArr[0], 0);

console.log(maxVal + "\n" + minVal);

function dfs(num, i) {
    if(i === n-1) {             
        maxVal = Math.max(maxVal, num);
        minVal = Math.min(minVal, num);
        
        return;        
    } 

    for(let j = 0; j < 4; j++) {
        if(opArr[j] > 0) {                
            --opArr[j];            
            j==0 && dfs(num + numArr[i+1], i+1);
            j==1 && dfs(num - numArr[i+1], i+1);
            j==2 && dfs(num * numArr[i+1], i+1);
            j==3 && dfs(parseInt(num / numArr[i+1]), i+1);
            ++opArr[j];
        }            
    }
}
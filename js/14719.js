// https://www.acmicpc.net/problem/14719

const fs = require('fs');
const file = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(file).toString().split('\n');
const blocks = input[1].split(' ').map(Number);

let answer = 0;

for(let i=1; i<blocks.length-1; i++) {   
    let maxLeft = Math.max(...blocks.slice(0, i));      
    let maxRight = Math.max(...blocks.slice(i + 1));    

    if(maxLeft > blocks[i] && maxRight > blocks[i]) {
        answer += Math.min(maxLeft-blocks[i], maxRight-blocks[i]);
    }
}

console.log(answer);
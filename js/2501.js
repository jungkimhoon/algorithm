const fs = require('fs');
const input = fs.readFileSync("./dev/stdin").toString().trim().split(' ').map(Number);
// const input = fs.readFileSync("./input.txt").toString().trim().split(' ').map(Number);

const n = input[0];
const k = input[1];
let arr = [];

for(let i = 1; i <= n; i++) {
    if(n % i === 0) {
        arr.push(i);
    }
}

console.log(arr[k - 1] || 0);
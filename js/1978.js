const fs = require('fs');
const file = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const [n, input] = fs.readFileSync(file).toString().trim().split('\n');

let arr = input.split(' ').map(Number);
let answer = [];

for(let value of arr) {
    if(value === 1) {
        answer.push(value);
        continue;
    }

    for(let j = 2; j <= value / 2; j++) {
        if(value % j === 0) {
            answer.push(value);
            break;
        }
    }
}

console.log(arr.length - answer.length);
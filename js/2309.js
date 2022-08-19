const fs = require('fs');
const file = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(file).toString().trim().split('\n').map(Number);

const sumAllHeight = input.reduce((prev, curr) => prev + curr);
const findVal = sumAllHeight - 100;
let answer = [];

for(let i = 0; i < input.length - 1; i++) {
    for(let j = i + 1; j < input.length; j++) {
        if(input[i] + input[j] === findVal) {
            answer = input.filter((num) => num !== input[i] && num !== input[j])
            break;
        }
    }
}

answer.sort((a, b) => a - b);
console.log(answer.join('\n'));
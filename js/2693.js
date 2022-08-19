const fs = require('fs');
const file = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const [n, ...input] = fs.readFileSync(file).toString().trim().split('\n');
let answer = [];
input.forEach((arr) => {
    arr = arr.split(' ').map(Number).sort((a, b) => b - a);
    answer.push(arr[2]);
});

console.log(answer.join('\n'));

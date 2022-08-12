const fs = require('fs');
const file = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(file).toString().trim().split('\n').map(obj => obj);

let sum = 0;
let arr = [];

input.forEach((ele) => {
    const [a, b] = ele.split(' ').map(Number);
    sum = sum - a + b;

    arr.push(sum);
});

console.log(Math.max(...arr));
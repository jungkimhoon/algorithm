const fs = require('fs');
const [n, input] = fs.readFileSync("./dev/stdin").toString().trim().split('\n').map(ele => ele);
// const [n, input] = fs.readFileSync("./input.txt").toString().trim().split('\n').map(ele => ele);

const arr = input.split(' ').map(Number);

console.log(`${Math.min(...arr)} ${Math.max(...arr)}`);

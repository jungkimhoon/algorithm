// /dev/stdin
// const input = require('fs').readFileSync('input.txt').toString().split(' ');
const input = require('fs').readFileSync('/dev/stdin').toString().split(' ');

const a = Number(input[0]);
const b = Number(input[1]);

console.log(a + b);

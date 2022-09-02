// https://www.acmicpc.net/problem/1789

const fs = require("fs");
const file = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const answer = [];

let n = Number(fs.readFileSync(file).toString());
let i = 0;

while (n > i) {
  i++;
  n-=i;
  
  answer.push(i);
}

console.log(answer.length);


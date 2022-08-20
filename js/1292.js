const fs = require("fs");
const file = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const [a, b] = fs.readFileSync(file).toString().trim().split(" ").map(Number);
let answer = [];
let num = 1;
let count = 1;

while (true) {
  answer.push(num);

  if (count === num) {
    count = 1;
    num++;
  } else {
    count++;
  }

  if (answer.length === b) {
    break;
  }
}

console.log(answer.slice(a - 1, b).reduce((a, b) => a + b));

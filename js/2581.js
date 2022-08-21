const fs = require("fs");
const file = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const [m, n] = fs.readFileSync(file).toString().trim().split("\n").map(Number);

const primeNumArr = [];
let primeNumSum = 0;

function primeNumber(num) {
  if (num < 2) {
    return;
  }

  for (let i = 2; i < num; i++) {
    if (num % i === 0) {
      return;
    }
  }

  primeNumArr.push(num);
  primeNumSum += num;
}

for (let i = m; i <= n; i++) {
  primeNumber(i);
}

if (!primeNumArr.length) {
  console.log(-1);
} else {
  console.log(primeNumSum);
  console.log(Math.min.apply(null, primeNumArr));
}

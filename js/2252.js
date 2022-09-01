// https://www.acmicpc.net/problem/2252

const fs = require("fs");
const file = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(file).toString().trim().split("\n");
const [ n, m ] = input[0].split(' ').map(Number);

const entry = Array.from({ length: n + 1 }, () => 0);
const relations = Array.from({ length: n + 1 }, () => []);

input.shift();

for(row of input) {
  const [ a, b ] = row.split(' ').map(Number);
  entry[b]++;
  relations[a].push(b);
}

let ans = [];
let q = [];

for (let i=1; i<=n; i++) {
  if(entry[i] === 0) {
    q.push(i);
    entry[i] = -1;
  }
}

while (q.length > 0) {
  const currStudent = q.shift();
  ans.push(currStudent);

  for (other of relations[currStudent]) {
    entry[other]--;

    if(entry[other] === 0) {
      q.push(other);
      entry[other] = -1;
    }
  }
};

console.log(ans.join(' '));
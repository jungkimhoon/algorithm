// https://www.acmicpc.net/problem/1806

const fs = require('fs');
const file = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const [input1, input2] = fs.readFileSync(file).toString().trim().split('\n');

let answer = Number.MAX_SAFE_INTEGER;
const N = parseInt(input1.split(' ')[0]);
const S = parseInt(input1.split(' ')[1]);
const nums = input2.split(' ').map(Number);

let left = 0;
let right = 0;
let sum = nums[left];

while (left < N) {
  if (sum >= S) {
    answer = Math.min(answer, right - left + 1);
    sum -= nums[left++];
  } else if (sum < S) {
    right++;
    if (right === N) break;
    sum += nums[right];
  }
}

if (answer === Number.MAX_SAFE_INTEGER) {
  answer = 0;
}

console.log(answer);
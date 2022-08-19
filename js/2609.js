const fs = require('fs');
const file = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(file).toString().trim().split(' ').map(Number);

let [i, j] = input;

while(i % j !== 0) {
    let n = i % j;
    if( n !== 0) {
        i = j;
        j = n;
    }
}

console.log(j);
console.log(input[0] * input[1] / j);
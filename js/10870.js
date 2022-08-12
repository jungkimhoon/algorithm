const fs = require('fs');
const file = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(file).toString().trim();

function fibonacci(n) {    
    if (n === 0) return 0;
    else if (n === 1) return 1;
    else return fibonacci(n - 2) + fibonacci(n - 1);
}

console.log(fibonacci(Number(input)));
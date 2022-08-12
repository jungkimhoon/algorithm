const fs = require('fs');
const [n, ...input] = fs.readFileSync("./dev/stdin").toString().trim().split('\n').map(Number);
// const [n, ...input] = fs.readFileSync("./input.txt").toString().trim().split('\n').map(Number);


input.forEach((ele) => {    
    let arr = [];
    const n = ele;
    const bin = n.toString(2)
                 .split('')
                 .reverse();
    
    bin.forEach((num, idx) => {
        if (num === '1') arr.push(idx);
    })

    console.log(arr.join(' '));
});


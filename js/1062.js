// https://www.acmicpc.net/problem/1062

const fs = require('fs');
const file = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const [input, ...input2] = fs.readFileSync(file).toString().trim().split('\n').map(String);
let answer = 0;

let input3 = input2.map(ele => ele.trim()); 


const [n, k] = input.split(' ').map(Number);
const defaults = ['a', 'c', 'n', 't', 'i'];
const visited = new Array(26);

if (k < defaults.length) {
    console.log(answer = 0);
    return;
}

if (k === 26) {
    console.log(answer = n);
    return;
}


visited.fill(false);
defaults.forEach(ele => {
    visited[ele.charCodeAt(0) - "a".charCodeAt(0)] = true;    
});

backTracking(0, 5);
console.log(answer);

function backTracking(idx, cnt) {
    if (cnt === k) {
        answer = Math.max(checkList(), answer);
        return;
    }

    for(let i = idx; i < 26; i++) {
        if(!visited[i]) {
            visited[i] = true;
            backTracking(i, cnt + 1);
            visited[i] = false;
        }
    }    
}

function checkList() {
    let sum = 0;
    
    input3.forEach(ele => {
        let result = true;
    
        for(let val of ele) {
            if(!visited[val.charCodeAt(0) - "a".charCodeAt(0)]) {
                result = false;
                break;
            }
        }

        if(result) sum++;
    });
    
    return sum;
}
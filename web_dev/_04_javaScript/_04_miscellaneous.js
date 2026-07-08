// const sum = (a, b) => {
//     return a + b ;
// }
// console.log(sum(1,1)) ;

// const cube = (a) => {
//     return a**3 ;
// }
// console.log(cube(3)) ;

// setTimeout(() => {
//     console.log("Hello World") ;
// }, 1000) ;

// function greet() {
//     console.log("Hello World!") ;
// }
// setTimeout(greet(), 100) ;

// let id1 = setInterval(() => {
//     console.log(`Hello World!`) ;
// }, 1000) ;
// setTimeout(() => {
//     clearInterval(id1)
// }, 10000) ;

// let greet = function() {
//     console.log(`Hello World!!`) ;
// }
// let id2 = setInterval(() => greet(), 100) ;
// setTimeout(() => {
//     clearInterval(id2)
// }, 10000) ;

// const student = {
//     name : "aman",
//     marks : 78,
//     getName() {
//         return this.name ;
//     },
//     getMarks : () => {
//         console.log(this) ;
//     }
// }

// Array methods

// function print(ele) {
//     console.log(ele) ;
// }

// let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15] ;
// arr.forEach((ele) => print(ele)) ;

// let newArr = arr.map((ele) => {
//     if(ele%2 == 0) {
//         return ele+10 ;
//     } else if(ele%2 != 0){
//         return ele-10 ;
//     } else {
//         return "Deleted item" ;
//     }
// })
// console.log(newArr) ;

// let newArr = arr.filter(function(ele) {
//     if(ele%2 == 0) return ele;
// })
// console.log(newArr) ;

// let newArr = arr.filter((ele) => ele%2==0) ;
// console.log(newArr) ;

// console.log(arr.some((ele) => ele%4 == 0)) ;
// console.log(arr.some(function(ele) {
//     if(ele+5 == 8) return true ;
//     else return false ;
// }))

// console.log(arr.every((ele) => {
//     return ele%2 == 0 ;
// }))
// console.log(arr.every(function(ele) {
//     return ele%2 != 0 ;
// }))

// let oddArr = [1, 3, 5, 7, 9] ;
// let evenArr = [2, 4, 6, 8, 10] ;

// console.log(`Does ${oddArr} contains all odd number :- ${oddArr.every((ele) => {
//     return ele%2 != 0 ;
// })}`)
// console.log(`Does ${evenArr} contains all even nubmer :- ${evenArr.every(function(ele) {
//     return ele%2 == 0 ;
// })}`)

// let arr = oddArr.concat(evenArr) ;
// console.log(arr) ;

// let maxElement = arr.reduce((max, ele) => {
//     if(ele > max) {
//         return ele ;
//     } else {
//         return max ;
//     }
// })
// console.log(`Maximum element in ${arr} is ${maxElement}`) ;

// let addElement = arr.reduce(function(sum, ele) {
//     return sum+ele ;
// })
// console.log(`Sum of every element of ${arr} = ${addElement}`) ;

// let studentInfo = [
//     {
//         name : "Bob",
//         city : "Mumbai",
//         marks : 76
//     },
//     {
//         name : "Adam",
//         city : "Pune",
//         marks : 88
//     }
// ]
// studentInfo.forEach((ele) => {
//     console.log("-".repeat(50, "-")) ;
//     console.log(ele.name) ;
// })

// let arr = [1, 2, 3, 4, 5] ;
// let factorial = arr.reduce((fact, ele) => {
//     return fact*ele ;
// })
// console.log(factorial) ;

// function getMin(nums) {
//     return nums.reduce((min, ele) => {
//         if(ele < min) {
//             return ele  ;
//         } else return min ;
//     })
// }

// let arr = [1, 2, 3, -3, 4, -87, 834, -7, 0] ;
// console.log(getMin(arr)) ;

let name = ["bob", "adam", "catlyn", "donald", "casey", "xavier"] ;
let [winner, looser, ...others] = name ;
console.log(winner) ;
console.log(looser) ;
console.log(others) ;
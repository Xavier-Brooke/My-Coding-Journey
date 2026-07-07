// function rol_dice() {
//     return Math.floor(Math.random() * 6) + 1 ;
// }
// console.log(rol_dice()) ;
// console.log(rol_dice()) ;
// console.log(rol_dice()) ;

// function get_avg(a, b, c) {
//     return (a + b + c) / 3  ;
// }

// console.log(get_avg(3,87, 90)) ;
// console.log(get_avg(8.8, 8.5, 7)) ;

// function sum(a, b) {
//     return (a + b) ;
// }

// console.log(sum(sum(sum(1, 2), sum(3, 4)), sum(sum(5, 6), sum(7, 8)))) ;

// function concatStr(arr) {
//     let ans = "" ;
//     for(let ele of arr) {
//         ans += ele ;
//     }
//     return ans ;
// }

// arr = ["a", "b", "c", "d", "e", "f"] ;
// console.log(concatStr(arr)) ;

// const sum = function(a, b) {
//     return a + b ;
// }

// console.log(sum(34, 987)) ;
// console.log(sum(876, 81)) ;

// let func = function() {
//     console.log("Hello World") ;
// }

// let multipleFunc = function(count, abc=func) {
//     for(let i = 1; i <=  count; i++) {
//         func() ;
//     }
// }

// multipleFunc(3) ;

// function oddEvenFactory(request) {
//     if(request.toLowerCase() == "odd") {
//         return function(n) {
//             console.log((n%2) != 0) ;
//         }
//     } else if(request.toLowerCase() == "even") {
//         return function(n) {
//             console.log((n%2) == 0) ;
//         }
//     } else {
//         console.log("INVALID REQUEST") ;
//     }
// }

// let odd = oddEvenFactory("oDD") ;
// odd(23)

// let obj = {
//     sum : function(a, b) {
//         return (a + b) ;
//     },
//     diff : function(a, b) {
//         return (a - b) ;
//     },

//     PI : 3.14
// }

// console.log(obj.sum(34, 98)) ;
// console.log(obj.diff(34, 98)) ;
// console.log(obj.PI) ;

let obj = {
    sum(a, b) {
        return a+b ;
    },
    diff(a,b) {
        return a-b ;
    },
    PI : 3.14
}
console.log(obj.sum(8, 65)) ;
console.log(obj.diff(887, 1)) ;
console.log(obj.PI) ;
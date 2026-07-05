// console.log(process.argv) ;

// let args = process.argv ;
// for(let i = 2; i < args.length; i++) {
//     console.log(`Hello ${args[i]}`) ;
// }

/* requiring */

// const maths = require("./maths") ;
// console.log(maths) ;
// console.log(maths.PI) ;
// console.log(`Sum of 1 and 2 = ${maths.sum(1, 2)}`) ;

// const { sum : sumFunc } = maths ;
// console.log(sumFunc) ;

/* using require() to require data from different dir */
// const fruits = require("./fruits") ;
// console.log(fruits) ;
// for(let val of fruits) {
//     for(let key in val) {
//         console.log(`Key :- ${key}, Value :- ${val[key]}`) ;
//     }
// }

/*using import and export as in  EJS*/
// import { PI, e, sum } from './maths.js' ;
import * as maths from './maths.js' ;

console.log(maths)
// console.log(maths.PI) ;
// console.log(maths.sum(23, 22)) ;
// console.log(maths.e) ;
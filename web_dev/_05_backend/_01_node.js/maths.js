// const sum = (a, b) => {
//     return a + b ;
// } 

// const diff = (a, b) => {
//     return (a - b) ;
// }

// const PI = 3.14 ;
// const e = 2.718 ;

// We can export above written code using different methods

// method 1 :-
// let obj = {
//     sum :  sum,
//     diff : diff,
//     PI : PI,
//     e : e
// }

// module.exports = obj ;

// method 2 :-
// module.exports = {
//     sum :  sum,
//     diff : diff,
//     PI : PI,
//     e : e
// }

// method 3 :-
// module.exports.sum = (a, b) => {
//     return a + b ;
// } 

// module.exports.diff = (a, b) => {
//     return (a - b) ;
// }

// module.exports.PI = 3.14 ;
// module.exports.e = 2.718 ;

// method 4 :-
// exports.sum = (a, b) => {
//     return a + b ;
// } 

// exports.diff = (a, b) => {
//     return (a - b) ;
// }

// exports.PI = 3.14 ;
// exports.e = 2.718 ;

/* This method is used to export in EJS */
export const sum = (a, b) => {
    return (a + b) ;
}

export const diff = (a, b) => {
    return (a - b) ;
}

export const PI = 3.14 ;
export const e = 2.718 ;
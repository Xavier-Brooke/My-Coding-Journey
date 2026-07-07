// let student = {
//     name : "Adam",
//     age : 21,
//     city : "New Delhi",
// }

// student.city = "Mumbai" ;
// student["age"] = 19

// console.log(student) ;

const classInfo = {
    adam : {
        age : 20,
        city : "Pune",
        marks : {
            physics : 93,
            chemistry : 87,
            maths : 88
        }
    },

    bob : {
        age : 21,
        city : "Luckhnow",
        marks : {
            physics : 34,
            chemistry : 87,
            maths : 76
        }
    }
}

console.log(classInfo) ;
console.log(classInfo.adam.marks)
// function Person(name, city) {
//     this.name = name ;
//     this.city = city ;
// }

// Person.prototype.walk = function () {
//     console.log(`${this.name} is walking to ${this.city}`)
// }

// let p1 = new Person("Adam", "NDLS") ;
// let p2 = new Person("Bob", "Mumbai") ;

// p1.walk() ;
// p2.walk() ;


// using class
// class Person {
//     constructor(name, city) {
//         this.name = name ;
//         this.city = city ;
//     }
//     walk() {
//         console.log(`${this.name} is going to ${this.city}`) ;
//     }
// }

// let p1 = new Person("Catlyn", "London") ;
// let p2 = new Person("Xavier", "Hyedrabad") ;
// p1.walk() ;
// p2.walk() ;

// concept of inheritance
class Person {
    constructor(name, age) {
        this.name = name ;
        this.age = age ;
    }
    details() {
        console.log(`Name :- ${this.name}`) ;
        console.log(`Age :- ${this.age}`) ;
    }
}

class Student extends Person {
    constructor(name, age, clg) {
        super(name, age) ;
        this.clg = clg ;
    }
    details() {
        console.log(`Name :- ${this.name}`) ;
        console.log(`Age :- ${this.age}`) ;
        console.log(`clg :- ${this.clg}`) ;
    }
}

class Topper extends (Student, Person) {
    constructor(name, age, clg, marks) {
        super(name, age, clg) ;
        this.marks = marks ;
    }
    details() {
        console.log(`Name :- ${this.name}`) ;
        console.log(`Age :- ${this.age}`) ;
        console.log(`clg :- ${this.clg}`) ;
        console.log(`Marks :- ${this.marks}`) ;
    }
}

let p1 = new Person("Adam", 22) ;
p1.details() ;

let s1 = new Student("Bob", 25, "ABC College") ;
s1.details() ;

let marks = {
    physics : 98,
    maths : 90,
    chemistry : 93
}

let t1 = new Topper("Catlyn", 21, "ABC College", marks) ;
t1.details() ;
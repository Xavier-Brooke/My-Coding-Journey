const mongoose = require("mongoose") ;

main()
    .then((result) => {
        console.log(`Successfully connected to DB.`) ;
    })
    .catch((error) => {
        console.log(`Something went wrong..`) ;
        console.error(error) ;
    })

async function main()  {
    await mongoose.connect("mongodb://127.0.0.1:27017/test") ;
}

const userSchema = new mongoose.Schema({
    name : String,
    age : Number,
    email : String
})

const User = mongoose.model("User", userSchema) ;

// const employeeSchema = new mongoose.Schema( {
//     name : String,
//     age : Number,
//     email : String,
//     role : String,
//     experience : String
// })

// const Employee = mongoose.model("Employee", employeeSchema) ;

// const user1 = new User({
//     name : "Adam",
//     email : "adam@gmail.com",
//     age : 24
// })

// user1.save()
//     .then((result) => {
//         console.log(`Data saved successfully`) ;
//         console.log(result) ;
//     })
//     .catch((error) => {
//         console.log(`Something wernt wrong...`) ;
//         console.error(error); 
//     })


// User.insertMany([
//     {
//         name : "Tony",
//         email : "tony@gmail.com",
//         age : 50
//     },
//     {
//         name : "Bruce",
//         email : "bruce@gmail.com",
//         age : 47
//     },
//     {
//         name : "Peter",
//         email : "peter@gmail.com",
//         age : 28
//     }
// ]).then((result) => {
//     console.log(`Data saved successfully`) ;
//     console.log(result) ;
// })
// .catch((error) => {
//     console.log(`Something wernt wrong...`) ;
//     console.error(error); 
// })

// find 

// User.find({name : {$in: ["Adam", "Bruce"]}}).then((result) => {
//     console.log(result) ;
// }).catch((err) => {
//     console.log(err) ;
// })

// User.findOne({name : "Adam"})
//     .then((result) => {
//         return User.updateOne( {_id : result._id}, {name : "Xavier"}) ;
//     })
//     .then((result) => {
//         console.log(result) ;
//     })
//     .catch((error) => {
//         console.log(`Something went wrong....`) ;
//         console.error(error) ;
//     })

// User.deleteOne({name : "Adam"})
//     .then((result) => {
//         console.log(result) ;
//     })
//     .catch((error) => {
//         console.error(error) ;
//     })

User.deleteMany({age : {$gte : 40}})
    .then((result) => {
        console.log(result) ;
    })
    .catch((error) => {
        console.error(error) ;
    })
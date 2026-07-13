const mongoose = require("mongoose") ;

async function main() {
    await mongoose.connect("mongodb://127.0.0.1:27017/amazon") ;
}

main()
    .then(() => {
        console.log(`SUccessfully Connected to DB`) ;
    })
    .catch((error) => {
        console.log(`Something went wrong, while connecting to DB...`) ;
        console.error(error) ;
    })

const bookSchema = new mongoose.Schema({
    title : {
        type : String,
        required : true
    },

    author : {
        type : String
    },

    price : {
        type : Number,
        min : [1, "Price can't be less than 1"]
    },

    genere : {
        type : [String]
    },

    category : {
        type : String,
        lowercase : true ,
        enum : ["finction", "non-fiction"]
    }
})

const Book = mongoose.model("Book", bookSchema) ;

let book1 = new Book({
    author : "R.D. Sharma",
    price : 290
})

book1.save()
    .then((result) => {
        console.log(result) ;
    })
    .catch((erroor) => {
        console.error(erroor) ;
    })
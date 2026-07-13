const express = require("express") ;
const path = require("path") ;
const mongoose = require("mongoose") ;
const Chat = require("./models/chats.js") ;

main()
    .catch((e) => {console.error(e)}) ;

async function main() {
    await mongoose.connect("mongodb://127.0.0.1:27017/whatsapp")
}

const app = express() ;
const port = 3000 ;

app.set("view engine", "ejs") ;
app.set("view", path.join(__dirname, "/views")) ;

app.use(express.static(path.join(__dirname, "public"))) ;
app.use(express.urlencoded({extended:true})) ;
app.use(express.json()) ;

app.get("/chats", async function(req, res) {
    let chats = await Chat.find() ;
    res.render("index.ejs", {chats}) ;
})

app.listen(port, () => {
    console.log(`App is listening at port ${port}`) ;
})
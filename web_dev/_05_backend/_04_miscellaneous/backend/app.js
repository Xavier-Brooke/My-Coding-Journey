const express = require("express") ;

const app = express() ;
const port = 3000 ;

app.use(express.urlencoded({extended:true})) ;
app.use(express.json()) ;

app.get("/register", (req, res) => {
    let { uesrName, password } = req.query ;
    res.send(`Hello, ${uesrName}`) ;
})

app.post("/register", (req, res) => {
    console.log(req.body) ;
    let { userName, password } = req.body ;
    res.send(`Hello ${userName}`) ;
})

app.listen(port, () => {
    console.log(`App is listening at port ${port}`) ;
})
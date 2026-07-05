const express = require("express") ;
const path = require("path") ;
const response = require("./views/rootPath.js") ;
const error = require("./views/error.js") ;

const app = express() ;
const port = 3000 ;

app.set("views", path.join(__dirname, "/views")) ;

app.get("/", (req, res) => {
    res.send(response) ;
})

app.get("/search", (req, res) => {
    let { q } = req.query ;
    if(q) {
        let obj = {"result" : `${q}`} ;
        return res.send(obj) ;
    } else {
        return res.send(error) ;
    }
})

app.get("/:username", (req, res) => {
    let { username } = req.params ;
    module.exports = username ;
    let greetUser = require("./views/greetUser.js") ;
    res.send(greetUser) ;
})

app.get(/.*/, (req, res) => {
    res.status(404).send(error) ;
})

app.listen(port, () => {
    console.log(`App is listening at port ${port}`) ;
})
const express = require("express") ;

const app = express() ;
const port = 3000 ;

// app.use((req, res, next) => {
//     let date = new Date() ;
//     console.log(date) ;
//     res.send("Middleware finished") ;
//     next() ;
// })

// app.use(function(req, res, next) {
//     console.log("I'm 2nd Middleware") ;
//     next() ;
// })

// app.use((req, res, next) => {
//     // req.time = Date.now() ;
//     req.time = new Date(Date.now()).toString() ;
//     console.log(req.host, req.hostname, req.method, req.path, req.time) ;
//     next() ;
// })

app.use("/random", (req, res, next) => {
    console.log(`This middleware is only for /random`) ;
    next() ;
})

app.use("/api", (req, res, next) => {
    let { token } = req.query ;
    if(token == "grant") {
        return next() ;
    } else {
        res.send("ACCESS DENIED") ;
    }
})

app.get("/", (req, res) => {
    res.send("This is root page") ;
})

app.get("/random", (req, res) => {
    res.send("This is random page") ;
})

app.get("/api", (req, res) => {
    res.send("DATA") ;
})

app.get(/.*/, (req, res) => {
    res.send("PAGE NOT FOUND!").status(404) ;
})

app.listen(port, () => {
    console.log(`App is listening at port ${port}`) ;
})
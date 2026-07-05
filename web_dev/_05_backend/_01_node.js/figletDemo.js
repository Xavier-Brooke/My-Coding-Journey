const figlet = require("./figlet") ;

figlet("Hello World!!", (err, data) => {
    if(err) {
        console.log(`Something went wrong...`) ;
        return console.error(err) ;
    }
    console.log(data) ;
})
// let res = `{"fact":"At 4 weeks, it is important to play with kittens so that they do not develope a fear of people.","length":95}` ;
// let obj = JSON.parse(res) ;
// console.log(obj) ;
// console.log(obj.fact) ;
// console.log(obj.length) ;
// res = JSON.stringify(obj) ;
// console.log(res) ;

// const url = "https://catfact.ninja/fact" ;

// fetch(url)
//     .then((res) => {
//         console.log("-".repeat(30)) ;
//         console.log(res) ;
//         return res.json() ;
//     })
//     .then((data) => {
//         console.log("-".repeat(30)) ;
//         console.log(data) ;
//     })
//     .catch((err) => {
//         console.log(`Something went wrong...`) ;
//         console.log(err) ;
//     })

// async function getFact() {
//     try {
//         let res1 = await fetch(url) ;
//     let data1 = await res1.json() ;
//     console.log(data1) ;

//     let res2 = await fetch(url) ;
//     let data2 = await res2.json() ;
//     console.log(data2) ;
//     } catch(error) {
//         console.log(`Something went wrong...`) ;
//         console.log(err) ;
//     }
// }

// async function getInfo() {
//     try {
//         let res = await axios.get(url) ;
//         console.log(res) ;
//     } catch(error) {
//         console.log(`Something went wrong...`) ;
//         console.error(error) ;
//     }
// }

const url = "https://icanhazdadjoke.com/" ;
const config =  {headers: {Accept: "application/json"}} ;

async function getJoke() {
    let res = await axios.get(url, config) ;
    let pre = document.createElement("pre") ;
    console.log(res.data.joke) ;
    pre.innerText = res.data.joke ;
    document.querySelector("body").appendChild(pre) ;
    console.log("function ended") ;
}
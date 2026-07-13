let btn = document.querySelector("button") ;
let input = document.querySelector("input[type='text']") ;
let hidden = document.querySelector(".hidden") ;

const url = "http://universities.hipolabs.com/search?limit=10&country=" ;
const config = { headers : { Accept : "application/json"}} ;

async function getInfo(country) {
    try {
        let res = await fetch(url+country, config) ;
        let data = await res.json() ;
        console.log(`COUNTRY = ${country}`) ;
        console.log(data) ;
        return data ;
    } catch(error) {
        console.log(`Something went wrong...`) ;
        return error ;
    }
}

function validateInput() {
    let country = input.value.trim()
    if(country) {
        input.value = "" ;
        return country ;
    } else {
        
        return false ;
    }
}

async function showData(country) {
    console.log(`We are working..`) ;
    let data = await getInfo() ;
    console.log(data) ;
    // for(let ele of data) {
    //     let tr = document.createElement("tr") ;
    //     let td1 = document.createElement("td") ;
    //     let td2 = document.createElement("td") ;
    //     let td3 = document.createElement("td") ;
    //     let td4 = document.createElement("td") ;
    //     t1.innerText = "" ;
    // }
    // for(let key in data) {
    //     console.log(`Key :- ${key}, Val :- ${data[key]}`)
    // }
    console.log(`function ended`) ;
}

input.addEventListener("keydown", function(event) {
    if(event.code == "Enter") {
        let country = validateInput() ;
        if(country) {
            showData(country) ;
        } else {
            console.log(`ENTER VALID INPUT`) ;
        }
    }  
})

btn.addEventListener("click", () => {
    let country = validateInput() ;
    if(country) {
        showData(country) ;
    } else {
        console.log(`ENTER VALID INPUT`) ;
    }
})
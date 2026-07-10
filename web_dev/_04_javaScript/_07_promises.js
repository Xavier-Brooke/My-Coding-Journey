let h1 = document.getElementsByTagName("h1")[0] ;

// setTimeout(() => {
//     h1.style.color = "red"
// }, 1000) ;

// setTimeout(() => {
//     h1.style.color = "green"
// }, 2000) ;

// setTimeout(() => {
//     h1.style.color = "blue"
// }, 3000) ;

// const changeColor = function(color, delay) {
//     setTimeout(() => {
//         h1.style.color = color ;
//     }, delay) ;
// }

// changeColor("red", 1000) ;
// changeColor("green", 2000) ;
// changeColor("blue", 3000) ;

// const changeColor = function(color, delay, nextColor) {
//     setTimeout(() => {
//         h1.style.color = color ;
//         if(nextColor) nextColor() ;
//     }, delay);
// }

// changeColor("red", 1000, () => {
//     changeColor("green", 1000, () => {
//         changeColor("blue", 1000, () => {
//             changeColor("orange", 1000) ;
//         })
//     })
// })

// function saveToDB(data) {
//     return new Promise((resolve, reject) => {
//         let internet = Math.floor(Math.random() * 10) + 1; 
//         if(internet > 3) {
//             resolve(`${data} saved successfully`) ;
//         } else {
//             reject(`Can't save ${data}`) ;
//         }
//     })
// }

// saveToDB("data1")
//     .then((result) => {
//         console.log(result) ;
//         return saveToDB("data2") ;
//     })
//     .then((result) => {
//         console.log(result) ;
//         return saveToDB("data3") ;
//     })
//     .then((result) => {
//         console.log(result) ;
//     })
//     .catch((error) => {
//         console.error(error) ;
//     })

function changeColor(color, delay=1000) {
    return new Promise((resolve, reject) => {
        let internet = Math.floor(Math.random() * 10) + 1 ;
        if(internet > 3) {
            setTimeout(() => {
                h1.style.color = color ;
                resolve(`Color changed to ${color} successfully`) ;
            }, delay) ;
        } else {
            reject(`Due to slow internet, couldn't change color to ${color}`) ;
        }
    })
}

// changeColor("red")
//     .then((result) => {
//         console.log(result) ;
//         return changeColor("green") ;
//     })
//     .then((result) => {
//         console.log(result) ;
//         return changeColor("blue") ;
//     })
//     .then((result) => {
//         console.log(result) ;
//     })
//     .catch((error) => {
//         console.log(`Something went wrong....`) ;
//         console.error(error) ;
//     })

async function invokeChangeColor() {
    try {
        let red = await changeColor("red", 2000) ;
        console.log(red) ;
        let green = await changeColor("green") ;
        console.log(green) ;
        let blue = await changeColor("blue", 100) ;
        console.log(blue) ;
    } catch(error) {
        console.log(`Something went wrong..`) ;
        console.error(error) ;
    } 
}
let btn = document.getElementsByTagName("button")[0] ;

let div = document.getElementsByTagName("div")[0] ;
div.style.height = "300px" ;
div.style.width = "600px" ;
div.style.border = "1px solid black" ;

function randomColor() {
    let red = Math.floor(Math.random() * 255) + 1 ;
    let green = Math.floor(Math.random() * 255) + 1 ;
    let blue = Math.floor(Math.random() * 255) + 1 ;
    let randColor = `rgb(${red}, ${green}, ${blue})` ;
    return randColor ;
}

function generateColor() {
    let h3 = document.getElementsByTagName("h3")[0] ;
    let randColor = randomColor() ;
    h3.innerText = `Generated color :- ${randColor}` ;
    div.style.backgroundColor = randColor ;
}

btn.addEventListener("click", generateColor) ;
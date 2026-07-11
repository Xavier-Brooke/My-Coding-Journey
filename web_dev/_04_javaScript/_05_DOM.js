// let imgs = document.getElementsByClassName("oldImg") ;

// for(let img of imgs) {
//     img.src = "./assets/spiderman_img.png" ;
// }

// let h1 = document.querySelector("h1") ;
// console.log(h1.getAttribute("id")) ;
// h1.setAttribute("id", "heading") ;
// console.log(h1.getAttribute("id")) ;
// console.log(h1.classList) ;
// h1.classList.add("h1") ;
// let classList =  "mainHeading " ;
// h1.classList.add("spidermanHeading") ;
// console.log(h1.classList) ;

function randomColor() {
    let r = Math.floor(Math.random() * 255) + 1 ;
    let g = Math.floor(Math.random() * 255) + 1 ;
    let b = Math.floor(Math.random() * 255) + 1 ;
    let color = `rgb(${r}, ${g}, ${b})` ;
    return color ;
}

let h1 = document.querySelector("h1") ;
let h3 = h1.nextElementSibling ;
let p = h3.nextElementSibling ;
let btn = p.nextElementSibling ;

// console.log(h1.innerText) ;
// console.log(h3.innerText) ;
// console.log(p.innerHTML) ;
// console.log(btn.innerText)

function changeColor(color=randomColor()) {
    console.log(color) ;
    console.dir(this.innerText) ;
    this.style.backgroundColor = "blue" ;
}

h1.addEventListener("click", changeColor) ;
h3.addEventListener("click", changeColor) ;
p.addEventListener("click", changeColor) ;
// btn.addEventListener("click", changeColor("red")) ;
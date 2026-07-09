// let imgs = document.getElementsByClassName("oldImg") ;

// for(let img of imgs) {
//     img.src = "./assets/spiderman_img.png" ;
// }

let h1 = document.querySelector("h1") ;
// console.log(h1.getAttribute("id")) ;
// h1.setAttribute("id", "heading") ;
// console.log(h1.getAttribute("id")) ;
console.log(h1.classList) ;
h1.classList.add("h1") ;
let classList =  "mainHeading " ;
h1.classList.add("spidermanHeading") ;
console.log(h1.classList) ;
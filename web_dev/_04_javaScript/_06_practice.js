let body = document.querySelector("body") ;

let p = document.createElement("p") ;
p.innerText = "Hey I'm red!" ;
p.style.color = "red" ;
body.appendChild(p) ;

let h3 = document.createElement("h3") ;
h3.innerText = "I'm a blue h3!" ;
h3.style.color = "blue" ;
body.append(h3) ;

let div = document.createElement("div") ;
div.style.border = "1px solid black" ;
div.style.backgroundColor = "pink" ;

let h1 = document.createElement("h1")
h1.innerText = "I'm in a div" ;
div.appendChild(h1) ;

let para = document.createElement("p") ;
para.innerText = "Me too!" ;
div.appendChild(para) ;

body.appendChild(div) ;
const minLimit = Math.floor(Math.random() * 501);
const maxLimit = Math.floor(Math.random() * 501)  + 500 ;
const randomNumber = Math.floor(Math.random() * (maxLimit - minLimit + 1)) + minLimit ;

console.log(`generated randomNumber :- ${randomNumber}`) ;

console.log(`Guess a number between ${minLimit} and ${maxLimit}`) ;
alert(`Guess a number between ${minLimit} and ${maxLimit}`) ;
let steps = 1 ;

while(true) {
    num = prompt(`Enter your guess :- `) ;

    if(!num) {
        alert(`INVALID INPUT, GIVE A VALID INPUT`) ;
        continue ;
    } else {
        if(num.trim().toLowerCase() == "quit") {
            console.log(`Total number of attempts ${steps-1}`) ;
            break ;
        }
    }

    num = parseInt(num) ;
    if(!num) {
        alert(`INVALID INPUT, GIVE A VALID INPUT`) ;
        continue ;
    }

    // game logic
    if(num == randomNumber) {
        alert(`You have successfuly gussed the number in ${steps} steps`) ;
        break ;
    } else if(num < randomNumber) {
        alert(`Gussed number is less than the randomNumber`) ;
        steps++ ;
        continue ;
    } else if(num > randomNumber) {
        alert(`Gussed number is larger than the randomNumber`) ;
        steps++ ;
    }
}
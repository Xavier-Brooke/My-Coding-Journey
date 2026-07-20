import './App.css'
import {Para} from './Util.jsx'
// import Product from './Product.jsx';
import ProductTab from './ProductTAb.jsx' ;

function Greet() {
  return <h1>Hello World</h1>
}

function App() {
  return (
    <>
      {/* <Product/>
      <Para/>
      <Greet/>
      <Title/> */}
      <ProductTab></ProductTab>
    </>
  ) ;
}

export default App
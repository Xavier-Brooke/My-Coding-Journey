import './App.css'
import {Para} from './Util.jsx'
// import ProductTab from './ProductTab.jsx' ;
import ProductTab from './activity/producTab.jsx';

function Greet() {
  return <h1>Hello World</h1>
}

function App() {
  return (
    <div className="container">
      <h3>Blockbluster Deals on Computer Accessories | Shop Now</h3>
      <ProductTab/>
    </div>
  ) ;
}

export default App
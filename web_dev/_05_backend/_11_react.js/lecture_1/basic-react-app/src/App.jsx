// import './App.css'
import {Para} from './Util.jsx'
import ProductTab from './ProductTab.jsx' ;
import Activity from './activity.jsx' ;

function Greet() {
  return <h1>Hello World</h1>
}

function App() {
  return (
    <>
      {/* <ProductTab/> */}
      <Activity user={"Xavier Brooke"} textColor={"yellow"}/>
      <Activity user={"Adam"} textColor={"blue"}/>
      <Activity user={"Catlyn"} textColor={"pink"}/>
    </>
  ) ;
}

export default App
import React from "react";
import {Button} from 'react-bootstrap'
function HighOrderComponent() {
    return ( 
        <>
        <h1>High Order Components</h1>
        <div style={{display:"flex", justifyContent:'space-between', margin: 20, padding: 20}}>
       <HOCRed cmp={Counter}/>
       <HOCGreen cmp={Counter}/>
       <HOCViolet cmp={Counter}/>
       </div>
        </>
     );
}
 function HOCRed(props){
    return (
    <div style={{backgroundColor:'red', width:150, color:'white', height:150}}>
        <props.cmp />
    </div>
    )
}
function HOCGreen(props){
    return (
    <div style={{backgroundColor:'green', width:150, color:'white', height:150}}>
        <props.cmp />
    </div>
    )
}
function HOCViolet(props){
    return (
    <div style={{backgroundColor:'violet', width:150, color:'white', height:150}}>
        <props.cmp />
    </div>
    )
}
 function Counter(){
    const [count, setCount] = React.useState(0);
    return (
        <>
        <h1>Counter</h1>
        <h1>Count : {count}</h1>
        <Button onClick={()=>setCount(count+1)}>Increment</Button>
        </>
    );
}

export default HighOrderComponent;
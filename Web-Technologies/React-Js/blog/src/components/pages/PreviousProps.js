import { useEffect, useRef, useState } from "react";

function PreviousProps() {
    const [count, setCount]=useState(0);
    return ( 
        <>
        <h1>Previous Props</h1>
        <User counter={count}/>
        <button onClick={()=>setCount(Math.floor(Math.random()*20))}>Increment</button>
        </>
     );
}

export function User(Props){
    const lastval=useRef();
    useEffect(()=>{
        lastval.current=Props.counter;
      })    
      const previousprops=lastval.current;
    return ( 
        <>
        <h1>User Component</h1>
        <p>Previous Props: {previousprops}</p>
        <p>Counter: {Props.counter}</p>
        </>
     );
}

export default PreviousProps;


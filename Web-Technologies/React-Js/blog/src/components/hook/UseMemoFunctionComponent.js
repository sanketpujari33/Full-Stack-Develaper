import React, { useMemo } from 'react';

function UseMemoFunctionComponent() {
    const [count, setCount] = React.useState(0);
    const [item, setItem] = React.useState(10);
  
    const multiCountMemo=useMemo(()=>{
        console.log("Multi count");
        return count *5;
       
    },[count])
    return ( 
        <>
        <h1>UseMemo Function Component</h1>
        <h1>Count: {count}</h1>
        <h1>Item: {item}</h1>
        <h1>Multi Count: {multiCountMemo}</h1>
        <button onClick={() => setCount(count + 1)}>Increment</button>
        <button onClick={() => setItem(item * 10)}>Increment Item</button>
        </>
     );
}

export default UseMemoFunctionComponent;
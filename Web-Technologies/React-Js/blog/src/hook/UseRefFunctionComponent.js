import React ,{ useRef } from "react";

function UseRefFunctionComponent() {
    let inputRef=useRef(null);
    function handleInput(){
        // inputRef.current.value="100";
        // inputRef.current.style.color="red";
        // inputRef.current.style.backgroundColor="yellow";
        // inputRef.current.focus();
        inputRef.current.style.display="none";
        
    }
    return ( 
        <>
        <h1>UseRef Function Component</h1>
        <input type="text" ref={inputRef}/>
        <button onClick={handleInput}>Check Ref</button>
        </>
     );
}

export default UseRefFunctionComponent;


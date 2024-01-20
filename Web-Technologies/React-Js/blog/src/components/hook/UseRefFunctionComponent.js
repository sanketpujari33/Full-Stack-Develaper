import React ,{ useRef } from "react";

function UseRefFunctionComponent() {
    useRef(()=>{
        console.log("Use Ref");
    })
    return ( 
        <>
        <h1>UseRef Function Component</h1>
        </>
     );
}

export default UseRefFunctionComponent;


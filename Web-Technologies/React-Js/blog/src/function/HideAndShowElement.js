import React, { useState } from "react";

function HideAndShowElement() {
    const [status,setStatus]=useState(true);
    return (
        <div style={{margin:20, padding:15, backgroundColor:"burlywood" }}>
        {status ?<h1>Hide And Show Element</h1>: null}
        <button onClick={()=>setStatus(false)}>Hide</button>
        <button onClick={()=>setStatus(true)}>Show</button>
        <button onClick={()=>setStatus(!status)}>Toggle</button>
        </div>
    );
}

export default HideAndShowElement;
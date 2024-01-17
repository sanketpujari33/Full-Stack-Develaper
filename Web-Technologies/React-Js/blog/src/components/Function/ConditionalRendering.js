import { useState } from "react";

function ConditionalRendering() {
    return (
        <div style={{margin:20, padding:20, backgroundColor:"thistle"}}>
            <h1>Conditional Rendering</h1>
            <Profile/>
        </div>
    );
}
export function Profile(){
    const [loggedIn, setLoggedIn]=useState(false);
    return (
        <>
        {
            loggedIn ?
            <h1>Profile Component</h1>:
            <h1>Welcome Guest</h1>
        }
        <button onClick={()=>setLoggedIn(!loggedIn)}>login</button>
        </>
    );
}
export default ConditionalRendering;
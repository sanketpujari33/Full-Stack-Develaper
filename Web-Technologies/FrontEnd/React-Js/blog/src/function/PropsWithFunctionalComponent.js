    import React, { useState } from 'react';

function PropsWithFunctionalComponent() {
    const [name ,setName ]=useState("Sanket")
    return (
        <div style={{backgroundColor:"pink", margin:20}}>
        <h1>Props With Functional Component</h1>
        <Student name={name} email={'sanketpujari33@gmail.com'}/>
        <button onClick={()=>{setName("Sanket Pujari")}}>Update Name</button>
        <button onClick={()=>{setName("Sanket")}}>Undo Name</button>
        </div>
    );
}
function Student(props){
    console.warn(props);
    return (
        <>
            <h1>Student Component</h1>
            <h2 >Name: {props.name}</h2>
            <h2 >Email: {props.email}</h2>
        </>
    );
}

export default PropsWithFunctionalComponent;
import React from 'react';

function ControlledComponent() {
    const [value, setValue] = React.useState("Hello World");
    const [item, setItem] = React.useState("Hello World");
    return ( 
        <>
        <h1>Controlled Component</h1>
        <h1>Value : {value}</h1>
        <input type="text" value={value} onChange={(e)=>{
            setValue(e.target.value);
        }}/>

             <h1>Item : {item}</h1>
         <input type="text" value={item} onChange={(e)=>{
            setItem(e.target.value);
        }}/>
        </>
     );
}

export default ControlledComponent;
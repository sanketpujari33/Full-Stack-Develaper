import { useState } from "react";

function StateWithObject() {
    const [data, setData]=useState({name:'Sanket',age:"25"})

    return ( 
        <>
        <h1>State With Object</h1>
        <p>Name: {data.name}</p>
        <p>Age: {data.age}</p>
        <input type="text" placeholder="enter name" value={data.name} onChange={e=>setData({...data,name:e.target.value})}/>
        <input type="text" placeholder="enter age" value={data.age} onChange={e=>setData({...data,age:e.target.value})}/>
        </>
     );
}

export default StateWithObject;
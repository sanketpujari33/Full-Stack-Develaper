import React,{useState} from "react";

function PreviousState() {
    const [data, setData] = useState(1);
    function increment() {
        // let random = Math.floor(Math.random()*10)
        // setData((pre)=>{
        //     console.log(pre);
        //     if(pre<5){
        //         return alert("low Value")
        //     }else{
        //     return random;
        //     }
        // })
        // setData(data+5)
        for (let index = 0; index < 5; index++) {
           setData((pre)=>pre+1)
        }
    }
    return ( 
        <>
        <h1>Previous State</h1>
        <p>Current State is {data}</p>
        <button onClick={increment}>Increment</button>
        </>
     );
}

export default PreviousState;
import React, { useState } from 'react';

function GetInputBoxValue() {
    const [data, setData] = useState("");
    const [print, setPrint] = useState(false);
    function getData(val) {
        setTimeout(() => {
            console.warn(val.target.value);
            setData(val.target.value);
        }, 1000);
    }
    function clear(){
        setData("");
    }
    return (
        <div style={{ margin: 30, padding: 10, backgroundColor: "blueviolet" }}>
            <h1>Get Input Box Value</h1>
            {print ?
                <h3>{data}</h3>
                : null
            }
            <input type="text" onChange={getData} />
            <button onClick={() => print ? setPrint(false): setPrint(true)}>Print</button>
            <button onClick={clear}>clear Data</button>
        </div>
    );
}

export default GetInputBoxValue;
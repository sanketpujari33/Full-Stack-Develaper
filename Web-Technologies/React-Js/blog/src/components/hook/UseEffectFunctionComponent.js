import React, { useEffect, useState } from "react";

function UseEffectFunctionComponent() {
    const [count, setCount]=useState(0);
    useEffect(() => {
        console.warn("Use Effect Function Component");
    })
    return (
        <>
            <h1>Use Effect Function Component</h1>
            <h1>Count: {count}</h1>
            <button onClick={() => setCount(count + 1)}>Update Counter</button>
        </>
    );
}

export default UseEffectFunctionComponent;
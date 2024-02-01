import React, { useEffect, useState } from "react";


function UseEffectFunctionComponent() {
    return (
        <>
            <UseEffectFunction />
            <SpecificStateAndProps />
        </>
    );
}
export function UseEffectFunction() {
    const [count, setCount] = useState(0);
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
export function SpecificStateAndProps(props) {
    const [count, setCount] = useState(100);
    const [data, setData] = useState(10)
    useEffect(() => {
        console.warn("Called with data state");
    },[data])
    useEffect(() => {
        alert("count is"+ count)
    },[count])
    return (
        <>
            <h1>UseEffect Specific State,Props</h1>
            <h1>Count: {count}</h1>
            <h1>Data: {data}</h1>
        <Student count={count} data={data}/>
            <button onClick={() => setCount(count + 1)}>Update Counter</button>
            <button onClick={() => setData(data + 1)}>Update Data</button>
        </>
    );
}
export function Student(props){
    useEffect(() => {
        alert("count is"+ props.count)
    },[props.count])
    return (
        <>
            <h1>Student</h1>
            <h1>Count Props : {props.count}</h1>
            <h1>Data Props  : {props.data}</h1>
        </>
    );
}
export default UseEffectFunctionComponent;
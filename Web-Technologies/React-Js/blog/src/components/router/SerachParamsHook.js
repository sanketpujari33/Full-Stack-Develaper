import React from 'react';
import {useSearchParams} from 'react-router-dom'

function SerachParamHook (){
        const [searchParams, setSearchParams] = useSearchParams();
    console.log(searchParams);
    console.log(searchParams.get('age'));
    const age = searchParams.get('age');
    console.log(searchParams.get('city'));
    const city = searchParams.get('city');
    return (
        <>
        <h1>Filter Page</h1>
        <p>Age: {age}</p>
        <p>City: {city}</p>
        <button onClick={()=>setSearchParams({age:23, city: 'Ahmednagar'})}>Change Pramas</button>
        </>
    );
}

export default SerachParamHook;
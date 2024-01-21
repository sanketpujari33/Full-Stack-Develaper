import { useEffect, useState } from "react";

function APIGetMethod() {
    const [data, setData]=useState([]);
    useEffect(()=>{
        const url ='https://jsonplaceholder.typicode.com/todos';
        fetch(url)
        .then((response) =>response.json())
        .then((responseData) =>
        setData(responseData)
        )
    },[])
    return ( 
        <>
        <h1>API GET Method</h1>
        <table border="1">
            <tr>
                <th>id</th>
                <th>title</th>
                <th>userId</th>
            </tr>
                {data.map((item,index)=>{
                    // console.log(item)
                    return(
                        
                        <tr key={index}>
                            <td>{item.id}</td>
                            <td>{item.title}</td>
                            <td>{item.userId}</td>
                        </tr>
                    )
                })}
        </table>

        </>
     );
}

export default APIGetMethod;
import { useState } from 'react';
function StateFunctionComponent() {
    const [data, setData] = useState(0);
    function updateData() {
        setData(data + 1);
    }
    return (
        <>
            <h1>State Function Component</h1>
            <h1>{data}</h1>
            <button onClick={updateData}>Update Data</button>
        </>
    );
}

export default StateFunctionComponent;
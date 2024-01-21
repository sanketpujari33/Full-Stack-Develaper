import { useEffect, useState } from "react";

function APIMethod() {
    const [data, setData] = useState([]);
    const [userId, setUserId] = useState(null);
    const [name, setName] = useState();
    const [email, setEmail] = useState();
    const [userName, setUserName] = useState();


    function getUser() {
        const url = 'https://jsonplaceholder.typicode.com/users';
        fetch(url).then((response) => response.json().then((responseData) => {
            setData(responseData)
            setName(responseData[0].name)
            setEmail(responseData[0].email)
            setUserName(responseData[0].username)
            setUserId(responseData[0].id)
        })
        )
    }
    function deleteUser(data) {
        const url = `https://jsonplaceholder.typicode.com/users/${data.id}`;
        fetch(url, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json'
            }
        })
            .then((response) => response.json()
                .then((responseData) => {
                    getUser()
                }))
    }
    function selectUser(id) {
        console.log(data[id-1]);
        setName(data[id-1].name)
        setEmail(data[id-1].email)
        setUserName(data[id-1].username)
        setUserId(data[id-1].id)

    }
    function upadetUser(){
        let item={name, email, userName, userId}
        const url = `https://jsonplaceholder.typicode.com/users/${userId}`;
        fetch(url, {
            method: 'PUT',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(item)

        })

        getUser()        
    }
    useEffect(() => {
        getUser();

    }, [])
    return (
        <>
            <div style={{ display: "inline-block" }}>
                <h1>API Delete Method</h1>
                <table border="1">
                    <tr>
                        <td>ID</td>
                        <td>Name</td>
                        <td>Email</td>
                        <td>Username</td>
                        <td>Delete</td>
                        <td>Update</td>
                    </tr>
                    {data.map((item, index) => {
                        return (
                            <tr key={index}>
                                <td>{item.id}</td>
                                <td>{item.name}</td>
                                <td>{item.email}</td>
                                <td>{item.username}</td>
                                <td><button onClick={() => { deleteUser(item.id) }}>Delete</button></td>
                                <td><button onClick={() => {selectUser(item.id)}}>Upadet</button></td>
                            </tr>
                        )
                    }
                    )}
                </table>
                <h1>Pre-Filled Form</h1>
                <input type="text" value={name}  onChange={(e)=>{setName(e.target.value)}}/><br /><br />
                <input type="text" value={email} onChange={(e)=>{setEmail(e.target.value)}}/><br /><br />
                <input type="text" value={userName} onChange={(e)=>{setUserName(e.target.value)}}/><br /><br />
                <button onClick={upadetUser}>Upadet User</button>
            </div>
        </>
    );
}

export default APIMethod;
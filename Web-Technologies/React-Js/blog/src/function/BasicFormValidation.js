import React, { useState } from 'react';

function BasicFormValidation() {
    const[useName, setUserName]=useState("");
    const[password, setPassword]=useState("");
    const[userError, setUserError]=useState(false);
    const[passError, setPassError]=useState(false);
    function loginHandle(e){
        if(useName.length <3 || password <3){
            alert("type correct values")
        }else{
            alert("user Login")
        }
        e.preventDefault()
    }
    function userHandel(e){
            let item=e.target.value;
            if(item.length < 3){
                setUserError(true);
            }else{
                setUserError(false);
            }
            setUserName(item)
    }
    function passHandel(e){
        let item=e.target.value;
        if(item.length < 3){
            setPassError(true);
        }else{
            setPassError(false);
        }
        setPassword(item)
}
    return (
        <div style={{margin:30, padding:30, backgroundColor:"tomato"}}>
            <h1>Login</h1>
            <form onSubmit={loginHandle}>
            <input type="text" placeholder="Username" onChange={userHandel}/>
            {userError?<><br/><span>User Not Valid</span></>:null}
            <br/><br/>
            <input type="password" placeholder="Password" onChange={passHandel}/>
            {passError?<><br/><span>password Not Valid</span></>:null}
            <br/><br/>
            <button type="submit">Login</button>
            </form>
        </div>
    );
}


export default BasicFormValidation;
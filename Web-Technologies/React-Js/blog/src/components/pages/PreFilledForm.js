import React,{useState} from "react";
function PreFilledForm(props) {
    console.log(props.data);
    const [name, setName] = useState();
    const [email, setEmail] = useState();
    const [userName, setUserName] = useState();
    return ( 
        <>
        <h1>Pre-Filled Form</h1>
            <input type="text" value={name}/><br/><br/>
            <input type="text" value={email}/><br/><br/>
            <input type="text" value={userName}/><br/><br/>
            <button>Upadet User</button>
        </>
     );
}

export default PreFilledForm;
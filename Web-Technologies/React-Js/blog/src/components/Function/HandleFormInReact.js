import React, { useState } from "react";
function HandleFormInReact() {
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [term, setTerm] = useState(false);
    const [interest, setInterest] = useState("");
    function getFormData(e) {
        console.warn(name, email, password, term, interest);
        e.preventDefault();
    }
    return (
        <>
            <h1>Handle Form In React</h1>
            <form onSubmit={getFormData}>
                <input type="text" placeholder="Enter Name" onChange={(e) => setName(e.target.value)} /><br /><br />
                <input type="email" placeholder="Enter Email" onChange={(e) => setEmail(e.target.value)} /><br /><br />
                <input type="password" placeholder="Enter Password" onChange={(e) => setPassword(e.target.value)} /><br /><br />
                <select onChange={(e) => setInterest(e.target.value)}>
                    <option >select Option</option>
                    <option >Marvel</option>
                    <option >Dc</option>
                </select><br /><br />
                <input type="checkbox" onChange={(e) => setTerm(e.target.checked)} /><span>Accept Term and Conditions</span><br /><br />
                <button type="submit">Submit</button><br /><br />
            </form>
        </>
    );
}

export default HandleFormInReact;
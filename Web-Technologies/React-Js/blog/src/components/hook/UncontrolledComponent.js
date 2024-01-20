import React,{useRef} from "react";
function UncontrolledComponent() {
    let inputRef1=useRef(null)
    let inputRef2=useRef(null)
    function submitForm(e) {
        e.preventDefault();
        console.log('input field 1 value: ' , inputRef1.current.value);
        console.log('input field 2 value: ' , inputRef2.current.value);
        let input3 =document.getElementById('input3').value;
        console.log('input field 3 value: ' ,input3);
        
    }
    return ( 
        <>
            <h1>Uncontrolled Component</h1>
            <form onSubmit={submitForm}>
                <input type="text" ref={inputRef1}/><br /><br />
                <input type="text" ref={inputRef2}/><br /><br />
                <input id="input3" type="text"/><br /><br />
                <button type="submit">Submit</button>
            </form>
        </>
     );
}

export default UncontrolledComponent;
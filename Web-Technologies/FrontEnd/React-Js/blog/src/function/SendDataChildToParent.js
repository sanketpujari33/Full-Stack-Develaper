export default function SendDataChildToParent() {
    function parentAlert(data) {
        alert(data);
    }
    
    return (
        <>
            <h1>Send Data Child To Parent</h1>
            <h1>Lifting State Up </h1>
            <p>Parent</p>
            <SendChildToParent alert={parentAlert} />
        </>
    );
}


export function SendChildToParent(props) {
    const data="Sanket Pujari"
    return (
        <>
            <h1>Child</h1>
            <button onClick={()=>props.alert(data)}>Click Me</button>
        </>
    );
}


function EventFuctionalComponent() {
    function Alert(){
                alert("Event Fuctional Component Clicked");
                console.log('Event Fuctional Component Clicked')
    }
    return (
        <>
            <h1>Event Fuctional Component</h1>
            <button onClick={Alert}>Click Me</button>
            <button onClick={()=>alert("Event Arrow Function")}>Click Me</button>
        </>
    );
}

export default EventFuctionalComponent;
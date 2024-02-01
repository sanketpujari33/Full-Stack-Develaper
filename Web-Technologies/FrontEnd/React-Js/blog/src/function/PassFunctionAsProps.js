function PassFunctionAsProps() {
    function getData(){
        alert("Hello from APP");
    }
    return (
        <div style={{ margin: 30, padding: 30, backgroundColor: "bisque" }}>
            <h1>Pass Function As Props</h1>
        <User data={getData}/>
        </div>
    );
}

function User(props){

        return(
            <>
            <h1>Function User</h1>
            <button onClick={props.data}>Call Data Function</button>
            </>
        );

}

export default PassFunctionAsProps;

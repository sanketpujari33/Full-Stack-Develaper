function FunctionComponent() {
    function Appale(){
        return (
            <>
                <h1>Inner Function Component </h1>
            </>
        );
    }
    return (
        <>
            <h1>Function Component</h1>
            {<Appale/>}
            <User />
        </>
    );
}
function User() {
    return (
        <>
            <h1>User Component</h1>
        </>
    );
}
export default FunctionComponent;
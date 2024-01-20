import React, { useRef } from "react";
import ForwardRefFunctionComponentTwo from "./ForwardRefFunctionComponentTwo";
export default function ForwardRefFunctionComponent() {
    let inputRef = useRef(null);
    function handleInput() {
        inputRef.current.value = "100";
        inputRef.current.style.color="red";
        // inputRef.current.style.display = "block";
        // inputRef.current.style.display = "none";
    }
    return (
        <>
            <ForwardRefFunctionComponentTwo ref={inputRef} />
            <h1>ForwardRef Function Component</h1>
            <button onClick={handleInput}>Forward</button>

        </>
    );
}

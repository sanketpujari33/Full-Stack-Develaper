import React, { forwardRef } from "react";
function ForwardRefFunctionComponentTwo(props, forwardRef) {
    return (
        <>
            <h1>ForwardRef Function Component Two</h1>
            <input type="text" ref={forwardRef} />
        </>
    );
}

export default forwardRef(ForwardRefFunctionComponentTwo);
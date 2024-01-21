import React from 'react';
import { CommonContext } from "./CommonContext";

function UpdateButton(){
 
        return (
            <CommonContext.Consumer>
                {
                   
                    ({ changeColor }) =>
                    <div>
                        <button onClick={()=>changeColor('yellow')}>UpdateColor</button>
                        <button onClick={()=>changeColor('blue')}>UpdateColor</button>
                    </div>

                }

            </CommonContext.Consumer>
        );
    }

export default UpdateButton;
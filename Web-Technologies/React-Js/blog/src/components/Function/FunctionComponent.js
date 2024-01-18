import BasicFormValidation from "./BasicFormValidation";
import ConditionalRendering from "./ConditionalRendering";
import EventFuctionalComponent from "./EventFuctionalComponent";
import GetInputBoxValue from "./GetInputBoxValue";
import HandleFormInReact from "./HandleFormInReact";
import HideAndShowElemrnt from "./HideAndShowElement";
import PassFunctionAsProps from "./PassFunctionAsProps";
import PropsWithFunctionalComponent from "./PropsWithFunctionalComponent";
import StyleType from "./StyleType";

function FunctionComponent() {
    return (
        <div style={{backgroundColor:"gray", margin:0, padding:0}}>
            <h1>Function Component</h1>
            <PassFunctionAsProps/>
            <BasicFormValidation/>
            <HandleFormInReact/>
            <User />
            <EventFuctionalComponent/>
            <PropsWithFunctionalComponent/>
            <GetInputBoxValue/>
            <HideAndShowElemrnt/>
            <ConditionalRendering/>
            <StyleType/>
        </div>
    );
}
function User() {
    function Appale(){
        return (
            <>
                <h1>Inner Function Component </h1>
            </>
        );
    }
    // {9922999789}
    return (
        <>
            <h1>User Component</h1>
            {<Appale/>}
        </>
    );
}
export default FunctionComponent;
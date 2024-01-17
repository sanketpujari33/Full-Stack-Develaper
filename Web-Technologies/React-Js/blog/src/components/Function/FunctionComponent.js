import BasicFormValidation from "./BasicFormValidation";
import ConditionalRendering from "./ConditionalRendering";
import EventFuctionalComponent from "./EventFuctionalComponent";
import GetInputBoxValue from "./GetInputBoxValue";
import HandleFormInReact from "./HandleFormInReact";
import HideAndShowElemrnt from "./HideAndShowElement";
import PropsWithFunctionalComponent from "./PropsWithFunctionalComponent";
function FunctionComponent() {
    return (
        <>
            <h1>Function Component</h1>
            <BasicFormValidation/>
            <HandleFormInReact/>
            <User />
            <EventFuctionalComponent/>
            <PropsWithFunctionalComponent/>
            <GetInputBoxValue/>
            <HideAndShowElemrnt/>
            <ConditionalRendering/>
        </>
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
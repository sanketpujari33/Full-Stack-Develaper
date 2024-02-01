// import ArrayListing from "./ArrayListing";
// import NestedList from "./NestedList";
// import BasicFormValidation from "./BasicFormValidation";
// import Bootstrap from "./Bootstrap";
// import ConditionalRendering from "./ConditionalRendering";
// import EventFuctionalComponent from "./EventFuctionalComponent";
// import GetInputBoxValue from "./GetInputBoxValue";
// import HandleFormInReact from "./HandleFormInReact";
// import HideAndShowElemrnt from "./HideAndShowElement";
// import PassFunctionAsProps from "./PassFunctionAsProps";
// import PropsWithFunctionalComponent from "./PropsWithFunctionalComponent";
// import StyleType from "./StyleType";
// import ReuseComponent from "./ReuseComponent";
// import ReactFragment from "./ReactFragment";

import SendDataChildToParent from "./SendDataChildToParent";

function FunctionComponent() {
    return (
        <div>
            <h1>Function Component</h1>
            {/* <PassFunctionAsProps />
            <BasicFormValidation />
            <HandleFormInReact />
            <User />
            <EventFuctionalComponent />
            <PropsWithFunctionalComponent />
            <GetInputBoxValue />
            <HideAndShowElemrnt />
            <ConditionalRendering />
            <StyleType /> 
            <Bootstrap /> 
            <ArrayListing/>
            <NestedList/>
            <ReuseComponent/>
            <ReactFragment/>*/}
            <SendDataChildToParent/>
        </div>
    );
}
function User() {
    function Appale() {
        return (
            <>
                <h1>Inner Function Component </h1>
            </>
        );
    }
    return (
        <>
            <h1>User Component</h1>
            {<Appale />}
        </>
    );
}
export default FunctionComponent;
import React, { Component } from 'react';
// import PropsWithClassComponent from './PropsWithClassComponent';
// import { StateClassComponent } from './StateClassComponent';
import PuresComponents from './PuresComponents';
import UseRefClassComponent from './UseRefClassComponent';
class ClassComponent extends Component {

    render() {
        return (
            <>
                <h1>Class Component First</h1>
                    {/* <ClassComponentTwo/> */}
                    {/* <PropsWithClassComponent/> */}
                    {/* <PuresComponents/> */}
                    <UseRefClassComponent/>

            </>
        );
    }
}
class ClassComponentTwo extends React.Component{
    render() {
        return (
            <>
                <h1>Class ComponentTwo</h1>
                {/* <StateClassComponent/> */}
            </>
        );
    }
}
export default ClassComponent;
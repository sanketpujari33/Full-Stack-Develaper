import React, { Component } from 'react';
import { StateClassComponent } from './StateClassComponent';

class ClassComponent extends Component {

    render() {
        return (
            <>
                <h1>Class Component First</h1>
                <ClassComponentTwo/>
            </>
        );
    }
}
class ClassComponentTwo extends React.Component{
    render() {
        return (
            <>
                <h1>Class ComponentTwo</h1>
                <StateClassComponent/>
            </>
        );
    }
}
export default ClassComponent;
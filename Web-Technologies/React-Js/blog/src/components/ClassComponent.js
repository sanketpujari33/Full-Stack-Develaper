import React, { Component } from 'react';

class ClassComponent extends Component {

    render() {
        return (
            <>
                <h1>Class Component Frist</h1>
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
            </>
        );
    }
}
export default ClassComponent;
import React, { Component } from "react";

export default class PropsWithClassComponent extends Component {
    constructor(){
        super();
        this.state={
            names:"Sanket"
        }
    }
    render() {
        return (
            <div style={{backgroundColor:'violet', margin:20, padding:10}}>
            <h1>Props With Class Component</h1>
            <Student name={this.state.names} email="sanketpujari33@gmail.com"/>
            <button onClick={()=>this.setState({names:"Sanket Pujari"})}>Upadate Name</button>
            <button onClick={()=>this.setState({names:"Sanket"})}>Undo Name</button>
            </div>
        );
    }
}

export class Student extends React.Component{
    render() {
        console.warn(this.props);
        return (
            <>
            <h1>Student</h1>
            <h2>Name: {this.props.name}</h2>
            <h2>Age: {this.props.email}</h2>
            </>
        );
    }
}

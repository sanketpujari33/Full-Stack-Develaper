import React, { Component } from "react";

export class StateClassComponent extends Component {
    constructor(){
        super();
        this.state={
            data:0
        }
    }
    apple(){
        this.setState({
            data:this.state.data+1
        })
    }
    render() {
        return (
            <>
            <h1>State Class Component</h1>
            <h1>{this.state.data}</h1>
            <button onClick={()=>{this.apple()}}>Update Data</button>
            </>
        );
    };
};
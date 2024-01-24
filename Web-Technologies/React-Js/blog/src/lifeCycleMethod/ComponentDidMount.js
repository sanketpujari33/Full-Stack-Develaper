
import React, { Component } from 'react';

export class ComponentDidMount extends Component {
    constructor(){
        super();
        console.warn("constructor");
        this.state={
            name:"Sanket"
        }
    }
    componentDidMount() {
        console.warn("ComponentDidMount");
    };
    render() {
        console.warn("Render")
        return (
            <div>
            <h1>ComponentDidMount</h1>
            <h2>{this.state.name}</h2>
            <button onClick={()=>{this.setState({name:"SanketPujari"})}}>UpdateState</button>
            </div>
        );
    };
};
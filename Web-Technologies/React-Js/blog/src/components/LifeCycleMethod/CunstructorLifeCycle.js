import React, { Component } from 'react';

export class CunstructorLifeCycle extends Component {
    constructor() {
        super();
        console.warn("constructor");
        this.state={
            data:"Sanket"
        }
    }
    render() {
        return (
            <div>
                <h1>Constructor Life Cycle</h1>
                <h2>{this.state.data}</h2>
                {console.warn("Return DATA")}
            </div>
        );
    };
};
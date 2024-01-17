
import React, { Component } from 'react';

export class RenderLifeCyle extends Component {
    render() {
        console.warn("Render Method",this.props);
        return (
            <div>
            <h1>Render Life Cycle</h1>
            <h2>{this.props.name}</h2>
            </div>
        );
    };
};
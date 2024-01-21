import React, { Component } from 'react';
import { CommonContext } from "./CommonContext";
class Main extends Component {
    render() {
        return (
            <CommonContext.Consumer>
                {
                    ({ color }) =>
                        <h1 style={{ backgroundColor: color }}>Main Page</h1>
                }

            </CommonContext.Consumer>
        );
    }
}

export default Main;
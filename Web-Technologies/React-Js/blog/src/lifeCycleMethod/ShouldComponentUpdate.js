import React from "react";

export class ShouldComponentUpdate extends React.Component {
    constructor() {
        super();
        // console.warn("constructor");
        this.state = {
            count: 0,
        };
    }

    componentDidMount() {
        // console.warn("ComponentDidMount");
    }
    shouldComponentUpdate() {
        // console.warn("ShouldComponentUpdate", this.state.count);
        if (this.state.count > 10) {
            return false;
        }
        return true;
    }
    componentDidUpdate(preProps, preState, snapShot) {
        // console.warn("ComponentDidUpdate");
    }
    render() {
        // console.warn("Render");
        return (
            <div>
                <h1>ShouldComponentUpdate</h1>
                <h2>{this.state.count}</h2>
                <button onClick={() => this.setState({ count: this.state.count + 1 })}>
                    Increment
                </button>
            </div>
        );
    }
}

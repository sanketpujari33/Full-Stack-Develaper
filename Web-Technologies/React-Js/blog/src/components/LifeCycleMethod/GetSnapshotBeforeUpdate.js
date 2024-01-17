// @flow
import React from 'react';

export default class GetSnapshotBeforeUpdate extends React.Component {
    constructor() {
        super();
        this.state = {
            count: 0,
        };
    }

    componentDidMount() {
        console.warn("ComponentDidMount");
    }
    getSnapshotBeforeUpdate(prevProps, prevState) {
        console.warn("GetSnapshotBeforeUpdate", prevState);
        return true;
    }
    shouldComponentUpdate() {
        console.warn("ShouldComponentUpdate");
        return true;
    }
    componentDidUpdate(preProps, preState, snapShot) {
        console.log(snapShot)
        console.warn("ComponentDidUpdate");
    }
    componentWillUnmount() {
        console.warn("ComponentWillUnmount");
    }
    render() {
        console.warn("Render");
        return (
            <>
                <h1>GetSnapshotBeforeUpdate</h1>
                <h2>{this.state.count}</h2>

                <button onClick={() => this.setState({ count: this.state.count + 1 })}>Increment</button>
            </>
        );
    }
}
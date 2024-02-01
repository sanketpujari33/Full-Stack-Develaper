
import React from 'react';

export default class GetSnapshotBeforeUpdate2 extends React.Component {
    constructor(props) {
        console.log('constructor');
        super(props);
        this.state = {
            count: 0,
        };
    }

    componentDidMount() {
        console.log("ComponentDidMount");
    }
    getSnapshotBeforeUpdate(prevProps, prevState) {
        console.log("GetSnapshotBeforeUpdate");
        console.log("prevProps", prevProps);
        console.log("prevState", prevState);
        return true;
    }
    shouldComponentUpdate() {
        console.log("ShouldComponentUpdate");
        return true;
    }
    componentDidUpdate(preProps, preState, snapShot) {
        console.log("preState", preState);
        console.log("preProps", preProps);
        console.log("snapShot", snapShot);
        console.log("ComponentDidUpdate");
    }
    componentWillUnmount() {
        console.log("ComponentWillUnmount");
    }
    render() {
        console.log("Render");
        return (
            <>
                <h1>GetSnapshotBeforeUpdate</h1>
                <h1>{this.props.name}</h1>
                <h2>{this.state.count}</h2>
                <button onClick={() => this.setState({ count: this.state.count + 1 })}>Increment</button>
            </>
        );
    }
}
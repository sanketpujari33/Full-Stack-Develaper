import React from "react";

export default class ComponentWillUnmount extends React.Component {
    constructor() {
        super();
        this.state = {
            show: true,
        };
    }

    componentDidMount() {
        console.warn("ComponentDidMount");
    }
    shouldComponentUpdate() {
        console.warn("ShouldComponentUpdate");
        return true;
    }
    componentDidUpdate(preProps, preState, snapShot) {
        console.warn("ComponentDidUpdate");
    }
    componentWillUnmount() {
        console.warn("ComponentWillUnmount");
    }
    render() {
        console.warn("Render");
        return (
            <>
                <h1>ComponentWillUnmount</h1>
                {this.state.show ? <Student /> : <h1>Component Remove</h1>}
                <button onClick={() => this.setState({ show: !this.state.show })}>
                    Toggle Child Component
                </button>
            </>
        );
    }
}
export class Student extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            show: true,
        };
    }
    componentWillUnmount() {
        console.warn("ComponentWillUnmount");
        alert("ComponentWillUnmount called")
    }
    render() {
        return (
            <div>
                <h1>Student</h1>
                <h2>{this.state.name}</h2>
                <button onClick={() => this.setState({ name: "SanketPujari" })}>
                    Update Name
                </button>
            </div>
        );
    }
}

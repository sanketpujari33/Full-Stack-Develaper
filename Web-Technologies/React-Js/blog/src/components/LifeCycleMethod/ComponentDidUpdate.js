import React from 'react';

export class ComponentDidUpdate extends React.Component {
    constructor() {
        super();
        // console.warn("constructor");
        this.state={
            count:0
        }
    }
    componentDidMount() {
        // console.warn("ComponentDidMount");
    }
    componentDidUpdate(preProps, preState, snapShot) {
        // console.warn("ComponentDidUpdate",snapShot);
        // console.warn("ComponentDidUpdate",preState);
        // if(preState.count===this.state.count){
        //     alert("data is already same");
        // }
        // else{
        //     alert("data is changed");
        // }
        if(this.state.count < 10)
        this.setState({count:this.state.count+1})
    }
    render() {
        // console.warn("Render")
        return (
            <div>
                <h1>ComponentDidUpdate</h1>
                <h2>{this.state.count}</h2>
                <button onClick={()=>this.setState({count:1})}>Update</button>
            </div>
        );
    };
};
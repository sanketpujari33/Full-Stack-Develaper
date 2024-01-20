
import React,{PureComponent} from "react";

export default class PuresComponents extends PureComponent{
    constructor() {
        super();
        this.state = {
            count: 0
            // count: 1
        };
    }
    render() {
        console.log("check-rerending")
        return (
            <>
                <h1>Pure Component</h1>
                
                <Users count={this.state.count}/>
                <button onClick={() => this.setState({ count: 1 })}>Increment</button>
           
            </>
        );
    }
}
export class Users extends React.PureComponent {
   
    
    render() {
        console.log("check-rerending")
        console.log("check-rerending")
        return (
            <>
                <h1>Users Component</h1>
                <p>Count: {this.props.count}</p>
           </>
        );
    }
}
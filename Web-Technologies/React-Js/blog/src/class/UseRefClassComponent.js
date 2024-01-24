import React ,{ createRef } from "react";

export default class UseRefClassComponent extends React.Component {
    constructor(){
        super();
        this.inputRef = createRef();
    }
    componentDidMount(){
        // console.log(this.inputRef.current.value="100");
    }
    getVelue(){
        console.log(this.inputRef.current.value);
        this.inputRef.current.style.color="red";
         this.inputRef.current.style.backgroundColor="yellow";

    }
    render(){
        return(
            <div>
                <h1>Use Ref Class Component</h1>
              <input type="text" ref={this.inputRef}/>
              <button onClick={()=>this.getVelue()}>Check Ref</button>
            </div>
        )
    }
}
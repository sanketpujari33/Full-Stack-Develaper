import { Component, useState } from "react";
import "./App.css";
import { CommonContext } from "./components/Context/CommonContext";
import Main from "./components/Context/Main";
import UpdateButton from "./components/Context/UpdateButton";
import Footer from "./components/Context/Footer";
import Header from "./components/Context/Header";
// import LifeCycleMethod from "./components/lifeCycleMethod/LifeCycleMethod.js";
// import ClassComponent from "./components/class/ClassComponent";
// import FunctionComponent from './components/function/FunctionComponent';
// import Hook from './components/hook/Hook';
// import Routess from "./components/router/Routess";
class App extends Component {
  constructor() {
    super();
    this.changeColor = (color) => {
      this.setState({
        color: color
      })
    }
    this.state = {
      color: 'green',
      changeColor: this.changeColor
    }
   
  }
  render() {
    return (
      <div className="App">
        <CommonContext.Provider value={this.state}>
          {/* <FunctionComponent/> */}
          {/* <ClassComponent />  */}
          {/* <LifeCycleMethod/> */}
          {/* <Hook/> */}
          {/* <Routess/> */}
          <Header/>
          <CommonContext.Consumer>
                {
                    ({ color }) =>
                        <h1 style={{ backgroundColor: color }}>Complete and easy example for Context API</h1>
                }

            </CommonContext.Consumer>
          <Main />
          <UpdateButton/>
          <Footer/>
        </CommonContext.Provider>
      </div>
    );
  }
}

export default App;

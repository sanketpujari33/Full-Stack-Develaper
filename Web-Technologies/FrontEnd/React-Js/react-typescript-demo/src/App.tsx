import './App.css';
import Button from './components/Button';
import Greet from './components/Greet';
import Heading from './components/Heading';
import Oscar from './components/Oscar';
import Person from './components/Person';
import PersonList from './components/PersonList';
import Status from './components/Status';

function App() {
  const personName={
    first: "Sanket",
    last: "Pujari",
  }
  const nameList =[
    {
      first: "Swopnil",
      last: "Pujari",
    },
    {
      first: "Vishal",
      last: "Pujari",
    },
    {
      first: "Nitin",
      last: "Pujari",
    },
    {
      first: "Shekhar",
      last: "Pujari",
    },
    {
      first: "Sanket",
      last: "Pujari",
    }
  ]
  return (
    <div className="App">
      <Person name={personName}/>
      <PersonList name={nameList}/>
      <Status status={'loading'}/>
      <Heading>Placeholder Text</Heading>
      <Oscar>
          <Heading>Oscar goes to Leonardo Dicpario!</Heading>
      </Oscar>
      <Greet name={"Sanket"} isLoggedIn={false}/>
      <Button handleClick={(event, id)=>{
        console.log("Button Clicked", event, id)
      }}/>
    </div>
  );
}

export default App;

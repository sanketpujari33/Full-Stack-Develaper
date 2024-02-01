import '../App.css'
import HomeContainer from '../Redux/Container/HomeContainer.jsx'
import HeaderContainer from '../Redux/Container/HeaderContainer.jsx'
function Redux() {
    return (
        <div className='App'>
            <HeaderContainer/>
            <h1>Redux</h1>
            <HomeContainer/>
            <div className="App">
      <HeaderContainer />
      <HomeContainer />
    </div>
        </div>
    );
}

export default Redux;
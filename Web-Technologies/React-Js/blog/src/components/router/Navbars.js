import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';

import {  NavLink } from 'react-router-dom';

function Navbars() {
    return (
            <Navbar bg="dark" data-bs-theme="dark">
                <Container>
                    <Navbar.Brand >Navbar</Navbar.Brand>
                    <Nav className="me-auto">
                        <Nav.Link ><NavLink style={({isActive})=>{return{backgroundColor: isActive ? 'green':'red'}}} to="/Home">Home</NavLink></Nav.Link>
                        <Nav.Link ><NavLink style={({isActive})=>{return{backgroundColor: isActive ? 'green':'red'}}} to="/about">About</NavLink></Nav.Link>
                        <Nav.Link ><NavLink style={({isActive})=>{return{backgroundColor: isActive ? 'green':'red'}}} to="/contact">Contact</NavLink></Nav.Link>
                    </Nav>
                </Container>
            </Navbar>
    );
}

export default Navbars;
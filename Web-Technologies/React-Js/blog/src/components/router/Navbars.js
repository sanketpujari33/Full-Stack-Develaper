import { Container, Form, Nav, Navbar, Button } from 'react-bootstrap';

import { NavLink } from 'react-router-dom';
function Navbars() {
    return (
        <Navbar bg="Light" data-bs-theme="Light">
            <Container>
                <Navbar.Brand >React</Navbar.Brand>
                <Nav className="me-auto">
                    <Nav.Link ><NavLink className={isActive => "nav-link" + (!isActive ? " unselected" : "")}
                        to="/">Home</NavLink></Nav.Link>
                    <Nav.Link ><NavLink className={isActive => "nav-link" + (!isActive ? " unselected" : "")}
                        to="/about">About</NavLink></Nav.Link>
                    <Nav.Link ><NavLink className={isActive => "nav-link" + (!isActive ? " unselected" : "")} to="/contact">Contact</NavLink></Nav.Link>
                    <Nav.Link ><NavLink className={isActive => "nav-link" + (!isActive ? " unselected" : "")} to="/filter">Filter</NavLink></Nav.Link>
                </Nav>
                <Form className="d-flex">
                    <NavLink to="/login">
                        <Button variant="outline-success">Login</Button>
                    </NavLink>
                </Form>
            </Container>
        </Navbar>
    );
}
export default Navbars;
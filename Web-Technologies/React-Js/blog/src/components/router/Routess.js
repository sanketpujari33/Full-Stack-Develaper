import React from 'react';
import { BrowserRouter, Route, Routes, Navigate} from 'react-router-dom'
import Home from '../pages/Home';
import About from '../pages/About';
import Contact from '../pages/Contact';
import Navbar from './Navbars';
import User from '../pages/User';
// import Page404 from '../pages/Page404';

function Routess() {
    return (
        <>
            <BrowserRouter>
            <Navbar/>
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/about" element={<About/>} />
                    <Route path="/contact" element={<Contact/>} />
                    <Route path="/user/:name" element={<User/>} />
                    {/* <Route path="/*" element={<Page404/>} /> */}
                    <Route path="/*" element={<Navigate to="/"/>} />
                </Routes>
            </BrowserRouter>
        </>
    );
}

export default Routess;
import React from 'react';
import { BrowserRouter, Route, Routes, Navigate } from 'react-router-dom'
import Home from '../pages/Home';
import About from '../pages/About';
import Contact from '../pages/Contact';
import Company from '../pages/Company';
import Channel from '../pages/Channel';
import Other from '../pages/Other';
import Navbar from './Navbars';
import User from '../pages/User';
import SerachParamHook from './SerachParamsHook';
import Page404 from '../pages/Page404';
import Login from '../pages/Login';
import ProtectRoute from '../pages/ProtectRoute';
import APIMethod from '../pages/APIMethod';
import PreviousState from '../pages/PreviousState';
import PreviousProps from '../pages/PreviousProps';
import StateWithObject from '../pages/StateWithObject';


function Routess() {
    return (
        <>
            <BrowserRouter>
                <Navbar />
                <Routes>
                    <Route path="/" element={<ProtectRoute Component={Home}/>} />
                    {/* <Route path="/home" element={<Home />} /> */}
                    <Route path="/login" element={<Login />} />
                    <Route path="/about" element={<About />} />
                    <Route path="/user/:name" element={<User />} />
                    <Route path="/user/:name" element={<User />} />
                    <Route path="/filter" element={<SerachParamHook />} />
                    <Route path="/api" element={<APIMethod/>} />
                    <Route path="/previousstate" element={<PreviousState/>} />
                    <Route path="/statewithobject" element={<StateWithObject/>} />
                    <Route path='/contact/' element={<Contact />} >
                        <Route path='company' element={<Company />} />
                        <Route path='channel' element={<Channel />} />
                        <Route path='other' element={<Other />} />
                    </Route>
                    <Route path="/*" element={<Page404 />} />
                    <Route path="/*" element={<Navigate to="/" />} />
                </Routes>
            </BrowserRouter>
        </>
    );
}

export default Routess;
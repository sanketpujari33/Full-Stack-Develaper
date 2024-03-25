import React from 'react'

export const Navbar = () => {
    return (
        <div className="">
            <nav>
                <div>
                    <h1><a href='/'>Onifood</a></h1>
                </div>
                <ul>
                    <li><a href='/'>Home</a></li>
                    <li><a href='/about'>About</a></li>
                    <li><a href='/blog'>Blog</a></li>
                    <li><a href='/contact'>Contact</a></li>
                    <li><a href='/login'>Login</a></li>
                    <li><a href='/register'>Register</a></li>
                </ul>
            </nav>
        </div>
    )
}

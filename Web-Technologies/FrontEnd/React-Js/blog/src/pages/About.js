import React from 'react'
import { NavLink } from 'react-router-dom'

export default function About() {
  return (
    <div>
      <h1>ABOUT PAGE</h1>
      <p>This is a About page of our awesome App</p>
      <p>And Here we are learning about Router</p>
      <NavLink to="/contact">Go to Contact Page</NavLink>
      <li> <NavLink to="/user/Sanket" state={{name:"sanket pujari"}}>Sanket</NavLink></li>
     <li> <NavLink to="/user/Shekhar">Shekhar</NavLink></li><br/>
    </div>
  )
}
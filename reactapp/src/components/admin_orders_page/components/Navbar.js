import React from 'react';
import "./Navbar.css"
import {  Link } from "react-router-dom";
const Navbar= () =>{
  return (
		<header class="header">

		<div class="left">
			<a href="#">Fish Landia</a>
		</div>
    
  <div class="mid">
		<ul class="navbar">
			 <li>
      <Link to="/">Home</Link>
    </li>
    <li>
      <Link to="/">Orders</Link>
    </li>
    <li>
      <Link to="/">Users</Link>
    </li>
    <li>
      <Link to="/">Products</Link>
    </li>
		</ul>
   
  </div>
	<div class="right">
          <a href="#">Logout</a>
        </div>

    </header>
  );
}
export default Navbar;
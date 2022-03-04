import React from "react"
import "./Nav.css"
import fishLandia from "./fishLandia.png";
import {Link} from 'react-router-dom';
const Nav = () =>{
    return (
        <>
     <nav className="main-nav">
         <div className="navbar-logo">

<img src={fishLandia} alt="Logo" className="logo"/>
         </div>
         <div className="menu-list">
<ul>
    
    <li>
        <h3>PROFILE</h3>
    </li>
    <Link to="/orders">
    <li>
        <h3>MY ORDERS</h3>
    </li>
    </Link>
    <li>
        <h3>CART</h3>
    </li>
</ul>
             </div>
            
             <div className='logout'>
             <ul>
                 <li>
             <h3>LOGOUT</h3>
             </li>
             </ul>
             </div>
           
     </nav>
        

           </>
    )
}
export default Nav;
import React from "react"
import "./navbar.css"
import img from "./images/fishlandia.png"
const Navbar = () =>{
    return (
        <>
     <nav className="main-nav">
         <div className="navbar-logo">

<img src={img} alt="Logo" className="logo"/>
         </div>
         <div className="menu-list">
<ul>
    <li>
        <a herf="#"><h3>PROFILE</h3></a>
    </li>
    <li>
        <a herf="#"><h3>MY ORDERS</h3></a>
    </li>
    <li>
        <a herf="#"><h3>CART</h3></a>
    </li>
</ul>
             </div>
            
             <div className='logout'>
             <ul>
                 <li>
             <a herf="#"><h3>LOGOUT</h3></a>
             </li>
             </ul>
             </div>
           
     </nav>
        

           </>
    )
}
export default Navbar;
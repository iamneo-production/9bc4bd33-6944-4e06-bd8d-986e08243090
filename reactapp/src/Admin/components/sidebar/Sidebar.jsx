import React from 'react'
import './sidebar.css'
import { Link } from "react-router-dom";
const SideBar = ()=>{  
    return(
    <>   
    <div className="sidebar">
    <div className="top-left">
    <h1 className="logo">Fish Landia</h1>
            <nav className="navbar navbar-expand-lg navbar-light bg-light">
                <div className="container-fluid">
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                                <Link className="nav-link" to="/Home">HOME</Link>
                            </li>
                            <li className="nav-item">
                                <Link className="nav-link" to="/users">USERS</Link>
                            </li>
                            <li className="nav-item">
                                <Link className="nav-link" to="/products">PRODUCTS</Link>
                            </li>
                            <li className="nav-item">
                                <Link className="nav-link" to="/orders">ORDERS</Link>
                            </li>
                        </ul>
                        <Link className="navbar-brand mx-auto fw-bold" to="/">LOGOUT</Link>
                    </div>
                </div>
            </nav>
            </div>
            </div>
        </>
  );
}
export default SideBar;

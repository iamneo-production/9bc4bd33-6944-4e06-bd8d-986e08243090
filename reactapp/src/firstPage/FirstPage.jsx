import React from 'react';
import './firstPage.css';
import { Link } from 'react-router-dom'

  const FirstPage = ()=>{
    
      return(
        <div className='form-container'>
        
        <div className='form-content-left'>
          <img className='form-img-firstpage' src='https://66.media.tumblr.com/1bcea32365c30c81f5124c216a2f8c82/tumblr_p8tps3qBz71xtapwxo2_500.gif' alt='spaceship' />
        </div>
        <div className='form-content-right'>
      <form className='form'>
      <h1>Welcome to FISH LANDIA
        </h1>
       
        <Link to={`/admin/login`} className="form-input-btn">ADMIN</Link>
        <Link to={`/userHome`} className="form-input-btn">USER</Link>
       
      </form>
    </div>
      </div>
      )};
export default FirstPage;
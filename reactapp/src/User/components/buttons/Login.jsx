import React from 'react'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faArrowRightToBracket } from '@fortawesome/free-solid-svg-icons'
import { useState,useEffect } from "react";
const Login = () => {

    const[email,setEmail]=useState('')
    const[password,setPassword]=useState('')


    const HandleClick=(e)=>{
        e.preventDefault()
        const user={email,password}
        console.log(user)
        try{
      let result= fetch("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/login",{
          method:"POST",
          headers:{"Content-Type":"application/json"},
          body:JSON.stringify(user) //jsobject to json string
    
      }).then(()=>{
         
        console.log(result)
      })
    } catch (error) {
        if (error.response && error.response.status <= 400) {
          alert(error.response);
        }

    }
    }


    return (
        <>
            <button type="button" className="btn btn-outline-primary mx-2" data-bs-toggle="modal" data-bs-target="#loginModal">
                <FontAwesomeIcon icon={faArrowRightToBracket} className='me-2' />
                Login
            </button>
            <div className="modal fade" id="loginModal" tabIndex="-1" aria-labelledby="loginModal" aria-hidden="true">
                <div className="modal-dialog">
                    <div className="modal-content">
                        <div className="modal-header">
                            <h5 className="modal-title" id="loginModal">Login</h5>
                            <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div className="modal-body">
                            <form>
                                <div className="mb-3">
                                <h2>Email address</h2>
                                   
                                    <input type="email" className="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" onChange={(e)=>setEmail(e.target.value)} />
                                    <div id="emailHelp" className="form-text">We'll never share your email with anyone else.</div>
                                </div>
                                <div className="mb-3">
                                <h2>Password</h2>
                                    <input type="password" className="form-control" id="passwordlogin" onChange={(e)=>setPassword(e.target.value)} />
                                </div>
                                
                                <button type="submit" className="btn btn-primary w-100" onClick={HandleClick}>Submit</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )
}
export default Login

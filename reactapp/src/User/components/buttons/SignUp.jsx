import React from 'react'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faUserPlus } from '@fortawesome/free-solid-svg-icons'
import { useState,useEffect } from "react";
const SignUp = () => {

  const[active,setActive]=useState('true')
  const[email,setEmail]=useState('')
  const[mobileNumber,setNumber]=useState('')
  const[password,setPassword]=useState('')
  const[resetPasswordToken,setPasswordToken]=useState('null')
  const[role,setRole]=useState('user')
  const[username,setName]=useState('')
  
  

  const HandleClick=(e)=>{
    e.preventDefault()
    const user={active,email,mobileNumber,password,resetPasswordToken,role,username}
    console.log(user)
    fetch("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/addUser",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(user) //jsobject to json string

  }).then(()=>{
    console.log("New User added")
    
  })
}



  return (
    <>
      <button type="button" className="btn btn-outline-primary mx-2" data-bs-toggle="modal" data-bs-target="#signupModal">
        <FontAwesomeIcon icon={faUserPlus} className='me-2' />
        Sign Up
      </button>
      <div className="modal fade" id="signupModal" tabIndex="-1" aria-labelledby="signupModal" aria-hidden="true">
        <div className="modal-dialog">
          <div className="modal-content">
            <div className="modal-header">
              <h5 className="modal-title" id="signupModal">Sign Up</h5>
              <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div className="modal-body">
              <form>
                <div className="mb-3">
                <h3>Username</h3>
                 
                  <input type="text" className="form-control" id="username" onChange={(e)=>setName(e.target.value)} />
                </div>
                <div className="mb-3">
                <h3>Email address</h3>
                
                  <input type="email" className="form-control" id="email" aria-describedby="emailHelp" onChange={(e)=>setEmail(e.target.value)} />
                </div>
                <div className="mb-3">
                <h3>Mobile Number</h3>
                 
                  <input type="text" className="form-control" id="mobilenumber" onChange={(e)=>setNumber(e.target.value)} />
                </div>
                <div className="mb-3">
                <h3>Password</h3>
                  <input type="password" className="form-control" id="passwordsignup" onChange={(e)=>setPassword(e.target.value)} />
                </div>
                
                <button type="submit" className="btn btn-primary w-100" onClick={HandleClick}>Sign Up</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </>
  )
}

export default SignUp

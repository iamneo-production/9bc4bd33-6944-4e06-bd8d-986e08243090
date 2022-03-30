import "./newUser.css";
import { Link } from "react-router-dom";
import { useState,useEffect } from "react";
export default function NewUser() {

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
    <div className="newUser">
      <h1 className="newUserTitle">Add New User</h1>
      <form className="newUserForm">
        <div className="newUserItem">
          <label>Username</label>
          <input type="text" placeholder="Enter Your Username" onChange={(e)=>setName(e.target.value)}/>
        </div>
      
        <div className="newUserItem">
          <label>Email</label>
          <input type="email" placeholder="Enter Your Email ID" onChange={(e)=>setEmail(e.target.value)}/>
        </div>
        <div className="newUserItem">
          <label>Password</label>
          <input type="password" placeholder="Enter Your Password" onChange={(e)=>setPassword(e.target.value)}/>
        </div>
        <div className="newUserItem">
          <label>Phone</label>
          <input type="text" placeholder="Enter Your Phone Number" onChange={(e)=>setNumber(e.target.value)}/>
        </div>
        
        
        <div className="newUserItem">
          <label>Active</label>
          <select className="newUserSelect" name="active" id="active">
            <option value="true">Active</option>
            <option value="false">Not Active</option>
          </select>
        </div>
        
        
      </form>
      <button className="newUserButton" onClick={HandleClick}>Create</button>
    </div>
    
  );
}

import {
  CalendarToday,
  LocationSearching,
  MailOutline,
  PermIdentity,
  PhoneAndroid,
  Publish,
} from "@material-ui/icons";
import { Link } from "react-router-dom";
import { useState } from "react";
import "./user.css";

export default function User() {

  const[email,setEmail]=useState('mon@gmail.com')
    const[name,setName]=useState('Monica E. Geller')
    const[number,setNumber]=useState('7845879856')
    const[address,setAddress]=useState('West Virginia, United States')
    

  return (
    <div className="user">
      <div className="userTitleContainer">
        <h1 className="userTitle">Edit User</h1>
       
      </div>
      <div className="userContainer">
        <div className="userShow">
          <div className="userShowTop">
           
            <div className="userShowTopTitle">
              <span className="userShowUsername">{name}</span>
              
            </div>
          </div>
          <div className="userShowBottom">
            
            <span className="userShowTitle">Contact Details</span>
            <div className="userShowInfo">
              <PhoneAndroid className="userShowIcon" />
              <span className="userShowInfoTitle">{number}</span>
            </div>
            <div className="userShowInfo">
              <MailOutline className="userShowIcon" />
              <span className="userShowInfoTitle">{email}</span>
            </div>
            <div className="userShowInfo">
              <LocationSearching className="userShowIcon" />
              <span className="userShowInfoTitle">{address}</span>
            </div>
          </div>
        </div>
        <div className="userUpdate">
          <span className="userUpdateTitle">Edit</span>
          <form className="userUpdateForm">
            <div className="userUpdateLeft">
              <div className="userUpdateItem">
                <label>Username</label>
                <input
                  type="text"
                  placeholder="Monica E. Geller"
                  className="userUpdateInput"
                  onChange={(e)=>setName(e.target.value)}/>
              </div>
             
              <div className="userUpdateItem">
                <label>Email</label>
                <input
                  type="text"
                  placeholder="mon@gmail.com"
                  className="userUpdateInput"
                  onChange={(e)=>setEmail(e.target.value)}/>
              </div>
              <div className="userUpdateItem">
                <label>Phone</label>
                <input
                  type="text"
                  placeholder="7845879856"
                  className="userUpdateInput"
                  onChange={(e)=>setNumber(e.target.value)} />
              </div>
              <div className="userUpdateItem">
                <label>Address</label>
                <input
                  type="text"
                  placeholder="West Virginia, United States"
                  className="userUpdateInput"
                  onChange={(e)=>setAddress(e.target.value)}/>
              </div>
            </div>
           
          </form>
        </div>
      </div>
    </div>
  );
}

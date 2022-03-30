import React from 'react';
import validate from './validateInfo';
import useForm from './useForm';
import './Form.css';
import Home from '../home/Home';
import { Link } from 'react-router-dom'
import { useState } from 'react';

const FormSignup = ({ submitForm }) => {
  const { handleChange, handleSubmit, values, errors } = useForm(
    submitForm,
    validate
  );



  const HandleClick=(e)=>{
      e.preventDefault()
     
      console.log(values)
      try{
    let result= fetch("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/login",{
        method:"POST",
        headers:{"Content-Type":"application/json"},
        body:JSON.stringify(values) //jsobject to json string
  
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
    <div className='form-content-right'>
      <form onSubmit={handleSubmit} className='form' noValidate>
        <h1>Remember !! WHY YOU STARTED ?
        </h1>
        <div className='form-inputs'>
          <label className='form-label'>Email</label>
          <input
            className='form-input'
            type='email'
            name='email'
            placeholder='Enter your email'
            value={values.email}
           onChange={handleChange}
           
          />
          {errors.email && <p>{errors.email}</p>}
        </div>
        <div className='form-inputs'>
          <label className='form-label'>Password</label>
          <input
            className='form-input'
            type='password'
            name='password'
            placeholder='Enter your password'
            value={values.password}
            onChange={handleChange}
           
           
          />
          {errors.password && <p>{errors.password}</p>}
        </div>
        <Link to={`/Home`} className="form-input-btn" type='submit'>Sign up</Link>


        
        <span className='form-input-login'>

        <Link to="/ForgetPassword">Forget Password ?</Link>
        </span>
      </form>
    </div>
  );
};

export default FormSignup;


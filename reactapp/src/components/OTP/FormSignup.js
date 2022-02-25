import React from 'react';
import useForm from './useForm';
import './Form.css';
const FormSignup = ({ submitForm }) => {
  const { handleChange, handleSubmit, values, errors } = useForm(submitForm);
  return (
    <div className='form-content-right'>
      <form onSubmit={handleSubmit} className='form' noValidate>
        <h4>Enter Your OTP Here </h4>  
        <div className='form-inputs'>
          <input className='form-input' name='number' placeholder='Enter your Mobile Number' value={values.mobileNo} onChange={handleChange} />
          {errors.mobileNo && <p>{errors.mobileNo}</p>}
        </div>
        <div className='form-inputs'>
          <input className='form-input'type='text' name='text' placeholder='Enter your OTP here' value={values.otp} onChange={handleChange}/>
          {errors.otp && <p>{errors.otp}</p>}
        </div>  
        
        <button className='form-input-btn' type='submit'> Verify </button>
      </form>
    </div>
  );
};
export default FormSignup;
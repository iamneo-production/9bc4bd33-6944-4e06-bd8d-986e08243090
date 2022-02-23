import React from 'react';
import validate from './validateInfo';
import useForm from './useForm';
import './Form.css';

const FormSignup = ({ submitForm }) => {
  const { handleChange, handleSubmit, values, errors } = useForm(
    submitForm,
    validate
  );
  return (
    <div className='form-content-right'>
      <form onSubmit={handleSubmit} className='form' noValidate>
        <h3>Oh NO! You are leaving. Are You Sure ??</h3>
        <button className='form-input-btn' type='submit'>
          Naah, Just Kidding
        </button>
        <button className='form-input-btn' type='submit'>
          Yes, Log Me Out
        </button>
        <button className='form-input-btn1' type='submit'>
          LOGIN AGAIN
        </button>
      </form>
    </div>
  );
};

export default FormSignup;
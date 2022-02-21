import React from 'react';
import { fireEvent, render, screen } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect';
import Form from '../Form';
import { MemoryRouter } from 'react-router';
describe('<Form />', () => {
  test('feForm', () => {
    render(<MemoryRouter><Form /></MemoryRouter>);
    const form_input_btn = screen.getByTestId('form_input_btn');
    const form_input = screen.getByTestId('form_input');
    const loginButton = screen.getByTestId('loginButton');
    const signupForm = screen.getByTestId('signupForm');
    expect(form_input_btn).toBeTruthy();
    expect(form_input).toBeTruthy();
    expect(loginButton).toBeTruthy();
    expect(signupForm).toBeTruthy();
    fireEvent.change(email, {target : {value : 'test email'}})
    expect(email.value).toBe('test email');   
  });
});
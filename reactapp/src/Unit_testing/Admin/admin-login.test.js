import React from 'react';
import { fireEvent, render, screen } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect';
import Login from '../Login';
import { MemoryRouter } from 'react-router';
describe('<Login />', () => {
  test('feLogin', () => {
    render(<MemoryRouter><Login /></MemoryRouter>);
    const admin_username = screen.getByTestId('admin_username');
    const admin_password = screen.getByTestId('admin_password');
    const admin_login_submit = screen.getByTestId('admin_login_submit'); 
    expect(admin_username).toBeTruthy();
    expect(admin_password).toBeTruthy();
    expect(admin_login_submit).toBeTruthy();
    fireEvent.change(email, {target : {value : 'test email'}})
    expect(email.value).toBe('test email');    
    fireEvent.change(password, {target : {value : 'test password'}})
    expect(password.value).toBe('test password');   
  });
});
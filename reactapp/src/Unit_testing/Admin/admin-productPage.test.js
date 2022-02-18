import React from 'react';
import { fireEvent, render, screen } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect';
import Navbar from '../Navbar/Navbar';
import { MemoryRouter } from 'react-router';
describe('<Navbar />', () => {
  test('feNavbar', () => {
    render(<MemoryRouter><Navbar /></MemoryRouter>);
    const Button = screen.getByTestId('Button');
    expect(Button).toBeTruthy();
    it ("renders without crashing",()=>{
        const div = document.createElement("div");
        ReactDOM.render(<Navbar></Navbar>, div())
      })
  });
});
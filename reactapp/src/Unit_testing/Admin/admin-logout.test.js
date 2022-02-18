import React from 'react';
import { fireEvent, render, screen } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect';
import Form from '../Form';
import { MemoryRouter } from 'react-router';
describe('<Form />', () => {
  test('feForm', () => {
    render(<MemoryRouter><Form /></MemoryRouter>);
    expect(button1).toBeTruthy();
    expect(button2).toBeTruthy();
  });
});
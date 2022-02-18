import React from 'react';
import { render, screen } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect';
import add_products from '../admin/admin_add_products';
import { MemoryRouter } from 'react-router';
describe('<add_products />', () => {
  test('feadd_products', () => {
    render(<MemoryRouter><add_products /></MemoryRouter>);
    const product_name = screen.getByTestId('enterProductName');
    const product_id = screen.getByTestId('enterProductPrice');
    const product_image = screen.getByTestId('enterProductImageUrl');
    const product_quantity = screen.getByTestId('enterProductQuantity');
    expect(productName).toBeTruthy();
    expect(productPrice).toBeTruthy();
    expect(productImageUrl).toBeTruthy();
    expect(productQuantity).toBeTruthy();
  });
});
import React from 'react';
import { fireEvent, render, screen } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect';
import { MemoryRouter } from 'react-router';
import Sidebar from "./Admin/components/sidebar/Sidebar";
import "./App.css";
import Login from './Admin/pages/login/Login';
import ForgetPassword from './Admin/pages/forgetPassword/ForgetPassword';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import UserList from "./Admin/pages/userList/UserList";
import NewUser from "./Admin/pages/newUser/NewUser";
import ProductList from "./Admin/pages/productList/ProductList";
import NewProduct from "./Admin/pages/newProduct/NewProduct";
import OrderList from "./Admin/pages/orderList/OrderList";
import NewUser from "./Admin/pages/orderList/NewUser";
import NewProduct from "./Admin/pages/orderList/NewProduct";

describe('<Login />', () => {
  test('feLogin', () => {
    render(<MemoryRouter><Login /></MemoryRouter>);
    const loginBox = screen.getByTestId('loginBox');
    const email = screen.getByTestId('email');
    const password = screen.getByTestId('password');
    const loginButton = screen.getByTestId('loginButton');
    const signupLink = screen.getByTestId('signupLink');
    expect(loginBox).toBeTruthy();
    expect(email).toBeTruthy();
    expect(password).toBeTruthy();
    expect(loginButton).toBeTruthy();
    expect(signupLink).toBeTruthy();
    fireEvent.change(email, {target : {value : 'test email'}})
    expect(email.value).toBe('test email');
    fireEvent.change(password, {target : {value : 'test password'}})
    expect(password.value).toBe('test password');
  });
});

describe('<ForgetPassword />', () => {
  test('feForgetPassword', () => {
    render(<MemoryRouter><ForgetPassword /></MemoryRouter>);
    const loginBox = screen.getByTestId('loginBox');
    const email = screen.getByTestId('email');
    const loginButton = screen.getByTestId('loginButton');
    const signupLink = screen.getByTestId('signupLink');
    expect(loginBox).toBeTruthy();
    expect(email).toBeTruthy();
    expect(loginButton).toBeTruthy();
    expect(signupLink).toBeTruthy();
    fireEvent.change(email, {target : {value : 'test email'}})
    expect(email.value).toBe('test email');
    expect(password.value).toBe('test password');
  });
});

const links = [
  { text: 'Home', location: "/" },
  { text: 'Users', location: "/Users" },
  { text: 'Products', location: "/Products" },
  { text: 'Orders', location: "/orders" },
];
test.each(links)(
  "Check if Nav Bar have %s link.",
  (link) => {
    render(<NavBar />);
    const linkDom = screen.getByText(link.text); 
    expect(linkDom).toHaveAttribute("href", link.location);
  }
);
test('Check if have logo and link to home page', () => {
    render(<NavBar />);
    const logoDom = screen.getByTestId(/company-logo/); 
    expect(logoDom).toHaveAttribute("href", "/"); 
  expect(screen.getByAltText(/Company Logo/)).toBeInTheDocument(); 
});

const rows = wrapper.find('.ordersList')
      expect(rows.length).to.eql(2)
      const firstRowColumns = rows.first().find('td').map(column => column.text())
      expect(firstRowColumns.length).to.eql(4)
      expect(firstRowColumns[0]).to.eql('Address')
      expect(firstRowColumns[1]).to.eql(20)
      expect(firstRowColumns[2]).to.eql(someDate1)
const SecondRowColumns = rows.last().find('td').map(column => column.text())
      expect(firstRowColumns.length).to.eql(4)
      expect(firstRowColumns[0]).to.eql('Address')
      expect(firstRowColumns[1]).to.eql(30)
      expect(firstRowColumns[2]).to.eql(someDate2)

const rows = wrapper.find('.ProductList')
      expect(rows.length).to.eql(2)
      const firstRowColumns = rows.first().find('td').map(column => column.text())
      expect(firstRowColumns.length).to.eql(4)
      expect(firstRowColumns[0]).to.eql('Name')
      expect(firstRowColumns[1]).to.eql(20)
      expect(firstRowColumns[2]).to.eql(someDate1)
const SecondRowColumns = rows.last().find('td').map(column => column.text())
      expect(firstRowColumns.length).to.eql(4)
      expect(firstRowColumns[0]).to.eql('Name')
      expect(firstRowColumns[1]).to.eql(30)
      expect(firstRowColumns[2]).to.eql(someDate2)

const rows = wrapper.find('.UserList')
      expect(rows.length).to.eql(2)
      const firstRowColumns = rows.first().find('td').map(column => column.text())
      expect(firstRowColumns.length).to.eql(4)
      expect(firstRowColumns[0]).to.eql('UserName')
      expect(firstRowColumns[1]).to.eql(20)
      expect(firstRowColumns[2]).to.eql(someDate1)
const SecondRowColumns = rows.last().find('td').map(column => column.text())
      expect(firstRowColumns.length).to.eql(4)
      expect(firstRowColumns[0]).to.eql('UserName')
      expect(firstRowColumns[1]).to.eql(30)
      expect(firstRowColumns[2]).to.eql(someDate2)

describe('<AddUser />', () => {
  test('feAddUser', () => {
    render(<MemoryRouter><Login /></MemoryRouter>);
    const newUserItem = screen.getByTestId('newUserItem');
    const newUserButton = screen.getByTestId('newUserButton');
    expect(newUserButton).toBeTruthy();
        });
      });

describe('<NewProduct />', () => {
  test('feNewProduct', () => {
    render(<MemoryRouter><NewProduct /></MemoryRouter>);
    const addProductItem = screen.getByTestId('addProductItem ');
    const addProductButton = screen.getByTestId('addProductButton');
    expect(addProductButton).toBeTruthy();
    });
  });


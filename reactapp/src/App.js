import './App.css';
import { Route, Routes } from 'react-router-dom';
import UserHome from './User/components/UserHome';
import About from './User/components/About'
import UserProduct from './User/components/UserProduct';
import Header from './User/components/Header'
import ProductDetail from './User/components/ProductDetail';
import Helpdesk from './User/components/Helpdesk'
import Review from './User/components/Review';
import FirstPage from './firstPage/FirstPage';
import Sidebar from './Admin/components/sidebar/Sidebar';
import Topbar from './Admin/components/topbar/Topbar';
import Login from './Admin/pages/login/Login';
import ForgetPassword from './Admin/pages/forgetPassword/ForgetPassword';
import Home from './Admin/pages/home/Home';
import UserList from './Admin/pages/userList/UserList';
import User from './Admin/pages/user/User';
import NewUser from './Admin/pages/newUser/NewUser';
import ProductList from './Admin/pages/productList/ProductList';
import Product from './Admin/pages/product/Product';
import NewProduct from './Admin/pages/newProduct/NewProduct';
import OrderList from './Admin/pages/orderList/OrderList';
import Admin_helpdesk from './Admin/pages/Admin_helpdesk/Admin_helpdesk';
import { Fragment } from 'react';
function App() {
  return (
    <>
    <div>
      <Routes>
        <Route exact path='/' element={<FirstPage />} />
        <Route path='/userHome' element={<Fragment><Header /><UserHome /></Fragment>} />
        <Route path='/about' element={<Fragment><Header /><About /></Fragment>} />
        <Route path='/product' element={<Fragment><Header /><UserProduct /></Fragment>} />
        <Route path='/product/:id' element={<Fragment><Header /><ProductDetail /></Fragment>} />
        <Route path='/product/:id/reviews' element={<Fragment><Header /><Review /></Fragment>}/>
        <Route path='/helpdesk' element={<Fragment><Header /><Helpdesk /></Fragment>} />
        <Route path='/admin/login' element={<Login />} />
        <Route path='/ForgetPassword' element={<ForgetPassword />} />
        <Route path='/Home' element={<Fragment><Sidebar /><Home /></Fragment>} />
        <Route path='/users' element={<Fragment><Sidebar /><UserList /></Fragment>} />
        <Route path='/user/:userId' element={<Fragment><Sidebar/><User /></Fragment>} />
        <Route path='/newUser' element={<Fragment> <Sidebar/><NewUser /></Fragment>} />
        <Route path='/products' element={<Fragment><Sidebar/><ProductList /></Fragment>} />
        <Route path='/products/:productId' element={<Fragment><Sidebar/><Product /></Fragment>} />
        <Route path='/newproduct' element={<Fragment><Sidebar/> <NewProduct /></Fragment>} />
        <Route path='/orders' element={<Fragment><Sidebar/> <OrderList /></Fragment>} />  
        <Route path='/Admin_helpdesk' element={<Fragment><Sidebar /><Admin_helpdesk /></Fragment>} />                          
      </Routes>
      </div>    
    </>
  );
}
export default App;

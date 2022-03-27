import Sidebar from "./Admin/components/sidebar/Sidebar";
import Topbar from "./Admin/components/topbar/Topbar";
import "./App.css";
import Login from './Admin/pages/login/Login';
import ForgetPassword from './Admin/pages/forgetPassword/ForgetPassword';
import FirstPage from './Admin/pages/firstPage/FirstPage';
import Home from "./Admin/pages/home/Home";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import UserList from "./Admin/pages/userList/UserList";
import User from "./Admin/pages/user/User";
import NewUser from "./Admin/pages/newUser/NewUser";
import ProductList from "./Admin/pages/productList/ProductList";
import Product from "./Admin/pages/product/Product";
import NewProduct from "./Admin/pages/newProduct/NewProduct";
import OrderList from "./Admin/pages/orderList/OrderList";
import { Route, Routes } from 'react-router-dom';
import Home from './User/components/Home'
import About from './User/components/About'
import Product from './User/components/Product'
import Header from './User/components/Header'
import Helpdesk from './User/components/Helpdesk'
import Review from './User/components/Review';
import Orders from './User/components/Orders';
import Tracking from './User/components/Tracking';
import ProductDetail from './User/components/ProductDetail';
function App() {
  return (
    <Router>
      <div className="container">
        <Switch>
        <Route exact path="/">
            <FirstPage />
          </Route>
          <Route path="/Login">
            <Login />
          </Route>
          <Route path="/ForgetPassword">
            <ForgetPassword />
          </Route>
          <Route path="/Home">
            <Sidebar/>
            <Home />
          </Route>
          <Route path="/users">
          <Sidebar/>
            <UserList />
          </Route>
          <Route path="/user/:userId">
          <Sidebar/>
            <User />
          </Route>
          <Route path="/newUser">
          <Sidebar/>
            <NewUser />
          </Route>
          <Route path="/products">
          <Sidebar/>
            <ProductList />
          </Route>
          <Route path="/product/:productId">
          <Sidebar/>
            <Product />
          </Route>
          <Route path="/newproduct">
            <Sidebar/>
            <NewProduct />
          </Route>
          <Route path="/orders">
          <Sidebar/>
            <OrderList />
          </Route>
        </Switch>
      </div>
    </Router>
    <>
      <Header />
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/about' element={<About />} />
        <Route path='/product' element={<Product />} />
        <Route path='/product/:id' element={<ProductDetail />} />\
          <Route path='/product/:id/reviews' element={<Review />}/>
        <Route path='/helpdesk' element={<Helpdesk />} />
          <Route path='/orders' element={<Orders/>}/>
         <Route path="/view-order/:id" element={<Tracking/>}/>
           <Route path="/customer-service" element={<Helpdesk />}/>
//             <Route path="/bill-details" element={Orders}/>
      </Routes>
    </>
  );
}
export default App;

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
  );
}
export default App;

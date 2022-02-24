import './App.css';
import { BrowserRouter as Router, Switch, Route, Link, Routes } from "react-router-dom";

import Login from "./Login"

function App() {
  return (
    <Router>
      
      <Routes>
        <Route path='/' exact component={Login} />
        
      </Routes>
    </Router>
  );
}
  
export default App;
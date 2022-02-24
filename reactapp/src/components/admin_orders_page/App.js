import './App.css';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import Navbar from "./components/Navbar"
import Orders from "./pages/Orders"
// import Cats from "./pages/Cats"
// import Sheeps from "./pages/Sheeps"
// import Goats from "./pages/Goats"
function App() {
  return (
    <Router>
      <Navbar />
      <Switch>
        <Route path='/' exact component={Orders} />
        
      </Switch>
    </Router>
  );
}
  
export default App;
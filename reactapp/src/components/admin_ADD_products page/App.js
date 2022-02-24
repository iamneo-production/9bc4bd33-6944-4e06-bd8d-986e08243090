import React  from 'react';
import { BrowserRouter, Switch, Route} from 'react-router-dom';
import admin_add_products from './admin_add_products';



function App() {
  return (
    <div className="App">
      <BrowserRouter>
            <Switch>
              <Route exact path="/" component={admin_add_products} />
              
            </Switch>
          
      </BrowserRouter>
    </div>
  );
}

export default App;

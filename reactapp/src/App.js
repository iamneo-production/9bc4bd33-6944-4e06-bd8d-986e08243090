import React  from 'react';
import { BrowserRouter, Routes, Route} from 'react-router-dom';
import admin_add_products from '/home/coder/project/workspace/reactapp/src/Admin/add_products/admin_add_products.jsx';



function App() {
  return (
    <div className="App">
      <BrowserRouter>
            <Routes>
              <Route exact path="/home/coder/project/workspace/reactapp/src/Admin/add_products/admin_add_products.jsx" component={admin_add_products} />
              
            </Routes>
          
      </BrowserRouter>
    </div>
  );
}

export default App;

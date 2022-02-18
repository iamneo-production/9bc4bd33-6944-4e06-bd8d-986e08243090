import React from 'react';
function admin_add_products(props) {
  return (
    <div class="grid-container">
  <div class="grid-item1"></div>

  <div class="grid-item2">
    <div class='admin_login'>
    <form action='' method='POST'>
     <h1>ADD PRODUCT</h1><br/>
     
      <div class="admin_login_username">
        
        <input type="text" placeholder="Product Name" id="product_name" required /><br/>
        <input type="text"  placeholder="Product ID" id='product_id' required/><br/>
        <input type="text"  placeholder="Product Image" id='product_image' required/><br/>
        <input type="text"  placeholder="Product Quantity" id='product_quantity' required/><br/>

      </div>
      
      <input type="submit" id="admin_go_back" value={'Go Back'}  />
      <input type="submit" id="admin_confirm_add" value={'Confirm Add'} /><br /><br/>
    </form>
    </div>
    
    </div>
    </div>
  );
}


export default admin_add_products;
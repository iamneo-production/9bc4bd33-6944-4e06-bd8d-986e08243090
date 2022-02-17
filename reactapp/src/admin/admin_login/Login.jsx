import React from 'react';
function Login(props) {
  return (
    <div class="grid-container">
  <div class="grid-item1"></div>
  <div class="grid-item2">
 
    <div class='admin_login'>
    <form action='' method='POST'>
     <h1>ADMIN LOGIN</h1>Please Sign in to Continue !<br/><br/><br/>
     
      <div class="admin_login_username">
        Username: 
        <input type="text" placeholder="Enter Username" id="admin_username" />
      </div>
      <div>
        Password: 
        <input type="password"  placeholder="Enter Password" id='admin_password' required/><br/><br/>
        <a href="#" target="_blank">Forget Password?</a><br/>
      </div>
      
      <input type="submit" id="admin_login_submit" value={'Login'}  /><br /><br/>
    </form>
    </div>
    </div>
    </div>
  );
}


export default Login;
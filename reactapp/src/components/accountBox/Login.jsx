import React, { useContext } from "react";
import {
  BoldLink,
  BoxContainer,
  FormContainer,
  Input,
  MutedLink,
  SubmitButton,
} from "./common";
//import { Marginer } from "../marginer";
import { AccountContext } from "./accountContext";

export function Login(props) {
  const { switchToSignup } = useContext(AccountContext);

  return (
    
    <BoxContainer>
      <FormContainer>
      
        <Input type="email" placeholder="Email" id="email" required/>
        <Input type="password" placeholder="Password" id="password" required />
      </FormContainer>
      {/*<Marginer direction="vertical" margin={10} />*/}
      <MutedLink href="#">Forget your password?</MutedLink>
      
      <SubmitButton type="submit" id="loginButton">Login</SubmitButton>
      
      <MutedLink href="#">
        Don't have an account?{" "}
        <BoldLink href="#" id="signupLink" onClick={switchToSignup} >
          Signup
        </BoldLink>
      </MutedLink>
      <BoldLink href="" id="adminbutton" >Admin</BoldLink>
    </BoxContainer>
  );
}
export default Login;
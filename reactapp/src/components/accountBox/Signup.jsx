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

export function Signup(props) {
  const { switchToSignin } = useContext(AccountContext);

  return (
    <BoxContainer>
      <FormContainer>
      <Input type="email" name="email" id="email" placeholder="Enter Email" required/>
        <Input type="text" name="Username" id='username' placeholder="Enter Username" required />
        <Input type="text" name="MobileNumber" id='mobileNumber' placeholder="Enter MobileNumber" required/>
        <Input type="Password" name="Password" id='password' placeholder="Enter Password" required/>
        <Input type="Password" name="CPassword" id='confirmPassword' placeholder="ConfirmPassword" required/>
      </FormContainer>
      {/*<Marginer direction="vertical" margin={10} />*/}
      <SubmitButton type="submit" id="submitButton">Submit</SubmitButton>
      {/*<Marginer direction="vertical" margin="1em" />*/}
      <MutedLink href="#">
        Already have an account?
        <BoldLink href="#" onClick={switchToSignin}>
          Login
        </BoldLink>
      </MutedLink>
    </BoxContainer>
  );
}
export default Signup;
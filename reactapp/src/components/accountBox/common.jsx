import styled from "styled-components";

export const BoxContainer = styled.div`
  height: 290px;
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 0px;
  padding-right:10px;
`;

export const FormContainer = styled.form`
  width: 100%;
  display: flex;
  flex-direction: column;
  box-shadow: 0px 0px 2.5px #ff0066;
  margin-bottom: 5px;
`;

export const MutedLink = styled.a`
  font-size: 14px;
  color: #ff0066;
  font-weight: 100;
  text-decoration: none;
  margin-top: 10px;
  margin-bottom: 10px;
`;

export const BoldLink = styled.a`
  font-size: 15px;
  color: #0000ff;
  font-weight: 500;
  text-decoration: none;
  margin: 0 4px;
  padding-bottom :4px;
`;

export const Input = styled.input`
  width: 100%;
  height: 42px;
  outline: none;
  border: 3px solid #ff0066;
  padding: 0px 10px;
  border-bottom: 3px solid #ff0066;
  transition: all 200ms ease-in-out;
  font-size: 14px;

  &::placeholder {
    color: black;
  }

  &:not(:last-of-type) {
    border-bottom: 1.5px solid #ff0066;
  }

  &:focus {
    outline: none;
    border-bottom: 2px solid #ff0066;
  }
`;

export const SubmitButton = styled.button`
  width: 100%;
  padding: 11px 40px;
  margin: 10px 0px 10px 10px;
  color: white;
  font-size: 15px;
  font-weight: 600;
  border: 3px solid white;
  border-radius: 100px 100px 100px 100px;
  cursor: pointer;
  transition: all, 240ms ease-in-out;
  background: #0000ff;
  background: linear-gradient(
    58deg,
    #ff0066 20%,
    #0000ff 100%
  );

  &:hover {
    filter: brightness(2.03);
  }
`;

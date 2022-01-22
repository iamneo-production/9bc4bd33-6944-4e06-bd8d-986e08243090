import "./App.css";
import styled from "styled-components";
import { AccountBox } from "./components/accountBox"; https://github.com/iamneo-production/9bc4bd33-6944-4e06-bd8d-986e08243090.git

const AppContainer = styled.div`
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
`;

function App() {
  return (
    <AppContainer>
      <AccountBox />
    </AppContainer>
  );
}

export default App;

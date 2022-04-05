import React from "react";
import "react-step-progress-bar/styles.css";
import { ProgressBar, Step } from "react-step-progress-bar";
 
import {Link} from 'react-router-dom';

class Tracking extends React.Component {
  render() {
    return (
        <div>
            <div className="container py-5">
                <div className="row">
                    <div className="col-12 text-center">
                        <h1>TRACKING</h1>
                        <hr />
                    </div>
                </div>
            </div>


        <div  style={{width:"70%",marginLeft:"18%",pointerEvents:"none"}}>
         
      <ProgressBar 
        percent={40}
        filledBackground="linear-gradient(to right, #0da9ef, #0da9ef)"
      >
        <Step transition="scale">
          {({ accomplished }) => (
            <img
              style={{ filter: `grayscale(${accomplished ? 0 : 80}%)`,marginBottom:"95%",marginLeft:"50%"}}
              width="50"
              src="https://cdn-icons.flaticon.com/png/128/2543/premium/2543369.png?token=exp=1649089283~hmac=7f2904e260b65336988157a615cda407"
            />
            
          ) 
          }
        </Step>
        
        <Step transition="scale">
          {({ accomplished }) => (
            <img
              style={{ filter: `grayscale(${accomplished ? 0 : 80}%)`,marginBottom:"80%" }}
              width="50"
              src="https://cdn-icons.flaticon.com/png/128/2769/premium/2769339.png?token=exp=1649089325~hmac=46b4dd42066c4240e81ce7e78b9ad241"       
              />
          )}
        </Step>
        <Step transition="scale">
          {({ accomplished }) => (
            <img
              style={{ filter: `grayscale(${accomplished ? 0 : 80}%)`,marginBottom:"90%" }}
              width="50"
              src="https://cdn-icons.flaticon.com/png/128/5637/premium/5637217.png?token=exp=1649086830~hmac=b5ae4e8fe94cc9430f3e1b30d170a9a6"
            />
          )}
        </Step>
        <Step transition="scale">
          {({ accomplished }) => (
            <img
              style={{ filter: `grayscale(${accomplished ? 0 : 80}%)` ,marginBottom:"100%",marginRight:"100%"}}
              width="50"
              src="https://cdn-icons.flaticon.com/png/128/384/premium/384082.png?token=exp=1649086926~hmac=96fe240d745646902bf53317eedeae4f"
            />
          )}
        </Step>
        
      </ProgressBar>
      <span >Ordered</span>
      <span style={{marginLeft:"25%"}}>Dispatched</span>
      <span style={{marginLeft:"25%"}}>Out For Delivery</span>
      <span style={{marginLeft:"16%"}}>Delivered</span>
      </div>
      
      <button className="btn btn-primary" style={{marginLeft:"40%" ,marginTop:"10%"}} ><Link to={{ pathname: `/customer-service`  }} style ={{ color:"white"}} >Contact Customer Service</Link></button>
      </div>
    );
  }
}
export default Tracking;

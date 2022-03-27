import React,{ Component } from 'react'
import './Tracking.css'
import OrderService from "./OrderService";
import {Link} from 'react-router-dom';


class Tracking extends React.Component {
  constructor(props)
  {
      super(props)
      this.state={
          id:this.props.match.params.id,
          order :{}
      }
  }

  customerService()
  {
      this.props.history.push(`/customer-service`);
  }
  billDetails()
  {
      this.props.history.push(`/bill-details`);
  }
  
  
  componentDidMount(){
      OrderService.getOrdersById(this.state.id).then( res => {
          this.setState({order: res.data}); });

  }

  render() {
    
    return (
      
      <div className="main_container">
     <div class="container padding-bottom-3x mb-1">
        <div class="card mb-3">
         <div class="d-flex flex-wrap flex-sm-nowrap justify-content-between py-3 px-2 bg-secondary">
           
            <div>Order Status : { this.state.order.status }</div> 
          </div>
          
          <div class="card-body">
            <div class="steps d-flex flex-wrap flex-sm-nowrap justify-content-between padding-top-2x padding-bottom-1x">
              
              <div class="step completed">
                <div class="step-icon-wrap">
                  <div class="step-icon"><i class="pe-7s-cart"></i></div>
                </div>
                <h4 class="step-title">Ordered</h4>
              </div>
            
              <div class="step completed">
                <div class="step-icon-wrap">
                  <div class="step-icon"><i class="pe-7s-config"></i></div>
                </div>
                <h4 class="step-title">Dispached</h4>
              </div>
              <div class="step ">
                <div class="step-icon-wrap">
                  <div class="step-icon"><i class="pe-7s-medal"></i></div>
                </div>
                <h4 class="step-title">Out for Delivery</h4>
              </div>
              <div class="step ">
              <div class="step-icon-wrap">
                  <div class="step-icon"><i class="pe-7s-home"></i></div>
                </div>
                <h4 class="step-title">Delivered</h4>
              </div> 
              
            </div>
          </div>
        </div>
        
          <Link to="\bill-details">
          <div  onClick={() => this.billDetails()} class="text-left text-sm-right"><button class="bill" style={{backgroundColor: "#0da9ef", color: "#fff",borderRadius:"2%"}}>View Bill Details</button></div>
          </Link>
        </div>
        
        <div class="card card1 ">
          <div className="card-body">
            
          
            {/* <div><button style={{width:"60%",marginLeft:"8%",borderRadius:"6px",backgroundColor: "#0da9ef", color: "#fff",marginBottom:"2%"}} >Cancel</button></div>
            */}
            <div class="customer">
            {/* <li> */}
            {/* <Link to="/customer-service"> */}
            
            <button onClick={() => this.customerService()} style={{width:"60%",marginLeft:"8%",borderRadius:"6px",backgroundColor: "#0da9ef", color: "#fff"}}>Contact Customer Service</button>

            {/* </Link> */}
            {/* </li> */}
            </div>
            
             
            
           
            </div>
  
        </div>
        
      </div>
      
      
    );
  }
  
}

 export default Tracking;



import React,{ Component } from 'react'
import { Link } from 'react-router-dom'
import './Orders.css';



class Orders extends Component {
 
  constructor(props) {
    super(props)

    this.state = {
      orders: []
    }
    
  }
    // viewOrder(id)
    //    {
    //          this.props.history.push(`/view-order/${id}`);
    //    }
     
      componentDidMount(){
        fetch("http://localhost:8080/Orders")
        .then((response) => response.json())
        .then(ordersList => {
            this.setState({ orders: ordersList });
        });
           
 
      }
      render(){
          return(
              <div data-testid="orders-1" style ={ {backgroundcolor:"linear-gradient(rgb(63, 62, 70) 0%, rgb(63, 62, 70) 100%))"}}>
              {/* <h2 className="text-center">MyOrders</h2> */}
              {/* <h1>{this.state.status}</h1> */}
              <div className="container py-5">
                <div className="row">
                    <div className="col-12 text-center">
                        <h1>ORDERS</h1>
                        <hr />
                    </div>
                </div>
            </div>

                 <div className="row " >
                  
                   <table class="table table-striped"  style ={ {width:"80%",marginLeft:"10%",borderCollapse:"collapse",marginTop:"-2%"}}>
                      <thead data-testid="thead">
                          <tr>
                             
                              <th scope="col">ProductName</th>
                              <th scope="col"> Status</th>
                              <th scope="col">Date</th>
                              <th> </th>
                              
                          </tr>
                          
                          
                      </thead>
                      
                      <tbody >
                         {this.state.orders.map((order) => (
                    
             
                             
                                  <tr key={order.id}>
                                  
                                    <td scope="row" value={order.name}>{order.name}</td>
                                    <td>{order.status}</td>
                                    <td>{order.date}</td>
                                    {/* <td ><button   onClick={() => this.viewOrder(order.id)}   className="btn btn-primary" style={{marginLeft:"25%"}}>Click here to see more</button> */}
                                    {/* <button onClick={() => this.deleteProduct(order.id)} className="btn btn-danger">cancel</button> */}
                                    {/* <button onClick={() => this.updateStatus(order.id,order.status)} value="canceled" className="btn btn-info">can</button>
                                     */}
                                    {/* </td> */}
                                    <td><button className="btn btn-primary" style={{marginLeft:"40px"}} ><Link to={{ pathname: `/tracking/${order.id}`, state:{status:"dispatched"}  }} style ={{ color:"white"}} >Click here to see more</Link></button> </td>

                                  </tr>
                                    ))}
                            
                          
                      </tbody>
  
                     </table>
                     </div>  
                   </div>
                 
          
          );
   
      }
  }
  export default Orders;
  





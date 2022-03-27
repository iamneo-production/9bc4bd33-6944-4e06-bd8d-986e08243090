import React,{ Component } from 'react'

import './Orders.css';



class Orders extends Component {
 
   
    state={
      orders:[]
    }
    viewOrder(id)
       {
             this.props.history.push(`/view-order/${id}`);
       }
     
      componentDidMount(){
        fetch("https://8080-bdcafacdfaacdbaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/Orders")
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
                 <div className="row " >
                  
                   <table   style ={ {width:"80%",marginLeft:"10%",borderCollapse:"collapse"}}>
                      <thead data-testid="thead">
                          <tr>
                             
                              <th >ProductName</th>
                              <th>Status</th>
                              <th>Date</th>
                              <th></th>
                          </tr>
                          
                          
                      </thead>
                      
                      <tbody   className="circle">
                         {this.state.orders.map((order) => (
                    
             
                             
                                  <tr key={order.id}>
                                  
                                    <td  value={order.name}>{order.name}</td>
                                    <td>{order.status}</td>
                                    <td>{order.date}</td>
                                    <td ><button   onClick={() => this.viewOrder(order.id)}  value={order.status} className="btn btn-primary" style={{marginLeft:"25%"}}>Click here to see more</button>
                                    {/* <button onClick={() => this.deleteProduct(order.id)} className="btn btn-danger">cancel</button> */}
                                    {/* <button onClick={() => this.updateStatus(order.id,order.status)} value="canceled" className="btn btn-info">can</button>
                                     */}
                                    </td>
                                 
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
  



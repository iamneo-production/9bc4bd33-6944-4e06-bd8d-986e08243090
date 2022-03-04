import React,{Component } from 'react'
import OrderService from '../services/OrderService'
import {Link} from 'react-router-dom';
class Orders extends Component {
    constructor(props){
        super(props)
        this.state={
              orders: []
        }
    }
    componentDidMount(){
        OrderService.getOrders().then((res)=>{
            this.setState({orders:res.data});
        })
    }
    render(){
        return(
            <div style ={ {backgroundcolor:"linear-gradient(rgb(63, 62, 70) 0%, rgb(63, 62, 70) 100%))"}}>
            {/* <h2 className="text-center">MyOrders</h2> */}
            
               <div className="row">
                 <table className="table table-striped table-bordered ">
                    <thead>
                        <tr>
                           
                            <th>ProductName</th>
                            <th>Status</th>
                            <th>Date</th>
                            <th></th>
                        </tr>

                    </thead>
                    <tbody>
                        {
                            this.state.orders.map(
                                order => 
                                <tr key={order.id}>
                                 
                                  <td>{order.productName}</td>
                                  <td>{order.status}</td>
                                  <td>{order.date}</td>
                                  <td><button class="btn btn-primary">Click here to see more</button></td>
                                  {/* <td><Link to="/tracking"><button class="btn btn-primary">click here to see more</button></Link></td>  */}
                                 </tr>
                            )
                        }
                    </tbody>

                   </table>
                    
                 </div>
            </div>   
        
        );
 
    }
}
export default Orders;
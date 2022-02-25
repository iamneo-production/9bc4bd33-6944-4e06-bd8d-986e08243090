import React from 'react';
import productService from '../service/productService';
import "./pagebody.css";
class Pagebody extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            products:[]
        }
    }

    componentDidMount(){
        productService.getProducts().then((response) => {
            this.setState({ products: response.data})
        });
    }
    render (){
        return (
            <div className="container">
                <h1 className = "text-center"> Welcome To fishLandia</h1>
              
                    <div class="row">
                        {
                            this.state.products.map(
                                product => 
                                <div className="card" class="col-4" key = {product.id}>
                                    <div className="card_img">
                                    <img src={product.image} alt="Logo" className="fish-logo"/>
                                        </div>
                                        <div className="card_header">
                                        <h4 className="fish-name">{product.name}</h4>
                                          
                                         </div>
                                        
                                </div>
                            )
                        }

                    </div>
               

            </div>

        )
    }
}
export default Pagebody
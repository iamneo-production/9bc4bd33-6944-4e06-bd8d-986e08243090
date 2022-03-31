import { Link } from "react-router-dom";
import "./product.css";
import Chart from "../../components/chart/Chart"
//import {productData} from "../../../dummyData"

import { Publish } from "@material-ui/icons";
import { useState,useEffect } from "react";
import { useParams } from "react-router-dom";
export default function Product() {

    
    const[price,setPrice]=useState('540')
    const[productName,setName]=useState('Archer fish')
    const[status,setStatus]=useState('avaliable')
    const[stock,setStock]=useState('9')
    


        

  return (
    <div className="product">
      <div className="productTitleContainer">
        <h1 className="productTitle">Product</h1>
       
      </div>
      <div className="productTop">
         
         <div className="productTopRight">
              <div className="productInfoTop">
                  <img src="https://i.pinimg.com/originals/1e/4b/71/1e4b712d5cef759f9b9c39f5196ae0e5.webp" alt="" className="productInfoImg" />
                  <span className="productName">{productName}</span>
              </div>
              <div className="productInfoBottom">
                  <div className="productInfoItem">
                      <span className="productInfoKey">id:</span>
                      <span className="productInfoValue">1</span>
                  </div>
                  <div className="productInfoItem">
                      <span className="productInfoKey">Price:</span>
                      <span className="productInfoValue">{price}</span>
                  </div>
                  <div className="productInfoItem">
                      <span className="productInfoKey">Stock:</span>
                      <span className="productInfoValue">{stock}</span>
                  </div>
                  <div className="productInfoItem">
                      <span className="productInfoKey">Status:</span>
                      <span className="productInfoValue">{status}</span>
                  </div>
              </div>
          </div>
      </div>
      <div className="productBottom">
          <form className="productForm">
              <div className="productFormLeft">
              <h2>Edit Product Details</h2>
                  <label>Product Name</label>
                  <input type="text" placeholder="Enter Name" onChange={(e)=>setName(e.target.value)} />
                
                  <label>Stock</label>
                <input
                  type="number"
                  placeholder="Enter Stock"
                  className="userUpdateInput"
                  onChange={(e)=>setStock(e.target.value)}/>
                 <label>Price</label>
                <input
                  type="number"
                  placeholder="Enter Price"
                  className="userUpdateInput"
                  onChange={(e)=>setPrice(e.target.value)}/>

                  <label>Status</label>
                  <select name="active" id="active" onChange={(e)=>setStatus(e.target.value)}>
                  <option value="option">Options</option>
                      <option value="avaliable">Avaliable</option>
                      <option value="notAvaliable">Not Avaliable</option>
                  </select>
              </div>
             
          </form>
      </div>
    </div>
  );
}

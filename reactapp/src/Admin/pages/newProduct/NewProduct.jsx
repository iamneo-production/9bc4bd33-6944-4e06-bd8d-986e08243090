import "./newProduct.css";
import { useState,useEffect } from "react";
export default function NewProduct() {

  const[image,setImage]=useState('')
  const[price,setPrice]=useState('')
  const[productName,setName]=useState('')
  const[status,setStatus]=useState('')
  const[stock,setStock]=useState('')
  
  const HandleClick=(e)=>{
    e.preventDefault()
    const product={image,price,productName,status,stock}
    console.log(product)
    fetch("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/addProduct",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(product) //jsobject to json string

  }).then(()=>{
    console.log("New Product added")
    
  })
}

  return (
    <div className="newProduct">
      <h1 className="addProductTitle">Add New Product</h1>
      <form className="addProductForm">
      <div className="addProductItem">
          <label>Image</label> <input type="text" placeholder="Enter the Image URL..." onChange={(e)=>setImage(e.target.value)} />
        </div>
        <div className="addProductItem">
          <label>Name</label> <input type="text" placeholder="Enter the Product Name..." onChange={(e)=>setName(e.target.value)} />
        </div>
        <div className="addProductItem">
          <label>Price</label> <input type="number" placeholder="Enter the Product Price..." onChange={(e)=>setPrice(e.target.value)} />
        </div>
        <div className="addProductItem">
          <label>Stock</label> <input type="number" placeholder="Enter the Stock Details..." onChange={(e)=>setStock(e.target.value)} />
        </div>
        <div className="addProductItem">
          <label>Active</label> <select name="active" id="active" onChange={(e)=>setStatus(e.target.value)}>
          <option value="option">Options</option>
            <option value="avaliable">Avaliable</option>
            <option value="unAvaliable">Not Avaliable</option>
          </select>
        </div>
        <button className="addProductButton" onClick={HandleClick}>ADD CONFIRM</button>
      </form>
    </div>
  );
}

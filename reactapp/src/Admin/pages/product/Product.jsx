import { Link } from "react-router-dom";
import "./product.css";
import Chart from "../../components/chart/Chart"
//import {productData} from "../../../dummyData"
import { Publish } from "@material-ui/icons";
import { useState,useEffect } from "react";
import { useParams } from "react-router-dom";
export default function Product() {


        const [Data, setData] = useState([]);
      
        useEffect(() => {
          fetch("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/admin")
            .then((data) => data.json())
            .then((data) => setData(data))
      
        }, [])




        const prodid = useParams()
        const proDetail = Data.filter(x => x.id == prodid.id)
        const product = proDetail[1]
        console.log(product)
    


  return (
    <div className="product">
      <div className="productTitleContainer">
        <h1 className="productTitle">Product</h1>
        <Link to="/newproduct">
          <button className="productAddButton">Create</button>
        </Link>
      </div>
      <div className="productTop">
         
         <div className="productTopRight">
              <div className="productInfoTop">
                  <img src="https://th.bing.com/th/id/OIP.puMo9ITfruXP8iQx9cYcqwHaGJ?pid=ImgDet&rs=1" alt="" className="productInfoImg" />
                  <span className="productName">Archer fish</span>
              </div>
              <div className="productInfoBottom">
                  <div className="productInfoItem">
                      <span className="productInfoKey">id:</span>
                      <span className="productInfoValue">1</span>
                  </div>
                  <div className="productInfoItem">
                      <span className="productInfoKey">Price:</span>
                      <span className="productInfoValue">540</span>
                  </div>
                  <div className="productInfoItem">
                      <span className="productInfoKey">Stock:</span>
                      <span className="productInfoValue">9</span>
                  </div>
                  <div className="productInfoItem">
                      <span className="productInfoKey">Status:</span>
                      <span className="productInfoValue">avaliable</span>
                  </div>
              </div>
          </div>
      </div>
      <div className="productBottom">
          <form className="productForm">
              <div className="productFormLeft">
                  <label>Product Name</label>
                  <input type="text" placeholder="Archer fish" />
                
                  <label>Stock</label>
                <input
                  type="number"
                  placeholder="Enter Stock"
                  className="userUpdateInput"
                />
                 <label>Price</label>
                <input
                  type="number"
                  placeholder="Enter Price"
                  className="userUpdateInput"
                />

                  <label>Status</label>
                  <select name="active" id="active">
                  <option value="option">Options</option>
                      <option value="avaliable">Avaliable</option>
                      <option value="notAvaliable">Not Avaliable</option>
                  </select>
              </div>
              <div className="productFormRight">
                 
                  <button className="productButton">Update</button>
              </div>
          </form>
      </div>
    </div>
  );
}


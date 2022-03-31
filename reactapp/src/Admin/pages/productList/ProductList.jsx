import "./productList.css";
import { DataGrid } from "@material-ui/data-grid";
import { DeleteOutline } from "@material-ui/icons";
import { productRows } from "../../../dummyData";
import { Link } from "react-router-dom";
import { useState,useEffect } from "react";
import { useParams } from 'react-router-dom'

export default function ProductList() {
  const [tableData, setData] = useState([]);

  useEffect(() => {
    fetch("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/admin")
      .then((data) => data.json())
      .then((data) => setData(data))

  }, [])


  const handleDelete = (id) => {
    fetch(`https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/admin/delete/${id}`,
    {
      method:'DELETE'
    }).then((result)=>{
      result.json().then((resp)=>{
        console.warn(resp)
        //getReviews()
      })
    })
    };


  //const handleDelete = (id) => {
    //setData(tableData.filter((item) => item.id !== id));
  //};

  const columns = [
    { field: "id", headerName: "ID", width: 90 },
    {
      field: "productName",
      headerName: "Product",
      width: 200,
      renderCell: (params) => {
        return (
          <div className="productListItem">
            <img className="productListImg" src={params.row.image} alt="" />
            {params.row.productName}
          </div>
        );
      },
    },
    { field: "stock", headerName: "Stock", width: 200 },
    {
      field: "status",
      headerName: "Status",
      width: 120,
    },
    {
      field: "price",
      headerName: "Price (in $)",
      width: 160,
    },
    {
      field: "action",
      headerName: "Action",
      width: 150,
      renderCell: (params) => {
        return (
          <>

<Link to={`/products/${params.row.id}`} className="productListEdit">Edit</Link>
            
            <DeleteOutline
              className="productListDelete"
              onClick={() => handleDelete(params.row.id)}
            />
          </>
        );
      },
    },
  ];

  return (
    <>
  
  <Link to="/newproduct">
    <button className="productAddButton" >Create</button>
  </Link>
    <div className="productList">
      <DataGrid
        rows={tableData}
        disableSelectionOnClick
        columns={columns}
        pageSize={8}
        checkboxSelection
      />
    </div>
</>
  );
}

import FeaturedInfo from "../../components/featuredInfo/FeaturedInfo";
import "./home.css";
import React, { useEffect, useState } from 'react';
import { DataGrid } from "@material-ui/data-grid";
import { DeleteOutline } from "@material-ui/icons";



export default function Home() {

  const columns = [
    { field: 'id', headerName: 'ID', width: 100 },
    {
      field: 'userid',headerName: 'UserId',type: 'number',width: 150,editable: true,
    },
    {
      field: 'name',headerName: 'Full Name', width: 150, editable: true,
    },
    {
      field: 'email',headerName: 'Email',width: 180,editable: true,sortable:false
    },
    
    {
      field: 'problem',
      headerName: 'Message',
      description: 'This column has a value getter and is not sortable.',
      sortable: false,
      width: 160,
      
    },
    {
      field: "action", headerName: "Action",width: 150,
    renderCell: (params) => {
    return (
          <p>
            <DeleteOutline
              onClick={() => handleDelete(params.id)}
            /> &nbsp;
           
          </p>
        );
      },
    },
  
  ];

  const[tableData,setTableData]= useState([])
  useEffect(() => {
    getHelpdesk()
}, [])
  console.log(tableData)

function getHelpdesk(){
  fetch("http://localhost:8080/helpdesk/Helpdesks")
      .then((data) => data.json())
      .then((data) => setTableData(data))
}

const handleDelete = (id) => {
fetch(`http://localhost:8080/helpdesk/Helpdeskdelete/${id}`,
{
  method:'DELETE'
}).then((result)=>{
  result.json().then((resp)=>{
    console.warn(resp)
    getHelpdesk()
  })
})
};
  
  /*const rows = [
    { id: 1,userid: 101 , fullname: 'Jon Snow',email:'jon@snow.com',         message: 'Login Problem'},
    { id: 2,userid: 201 , fullname: 'Harry Potter',email:'potter@harry.com',message: 'Billing Problem' },
    { id: 3,userid: 301 , fullname: 'Cersei Lannister',email:'lann@cersei.com',message: 'Payment Problem'},
    { id: 4,userid: 401 , fullname: 'Arya Stark',email:'stark@arya.com',message: 'Login Problem'},
    {id: 5,userid: 501 , fullname: 'Ferrara Clifford',email:'cliff@ferr.com',message: 'Payment Problem' },
    {id: 6,userid: 601 , fullname: 'Snow Jon',email:'jon@snow.com',message: 'Signin Problem' },
    {id: 7,userid: 701 , fullname: 'Snow Jon',email:'jon@snow.com',message: 'Login Problem'},
    {id: 8,userid: 801 ,fullname: 'Snow Jon',email:'jon@snow.com',message: 'Login Problem'},
    
  ];*/

  return (
    <div className="home">      
     
    

      <div className="problems_display"><b><h2 style={{ margin:'10px 450px'}}>USER'S  HELPDESK</h2></b>
      <div style={{ height: 300, width: '80%', margin:'1px 90px' }}>
      <DataGrid
        rows={tableData}
        columns={columns}
        pageSize={5}
        rowsPerPageOptions={[5]}
        //checkboxSelection
        disableSelectionOnClick
      />
    </div>
      </div>

    </div>
    
  );
}
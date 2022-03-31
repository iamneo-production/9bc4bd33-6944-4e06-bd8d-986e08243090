import "./userList.css";
import { DataGrid } from "@material-ui/data-grid";
import { DeleteOutline } from "@material-ui/icons";
import { userRows } from "../../../dummyData";
import { Link } from "react-router-dom";
import { useState,useEffect } from "react";

export default function UserList() {
  const [data, setData] = useState([]);
  useEffect(() => {
    fetch("https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/users")
      .then((data) => data.json())
      .then((data) => setData(data))

  }, [])


  const handleDelete = (id) => {
    fetch(`https://8080-acddafabaffddeefcfbeddbecdddbadefcdd.examlyiopb.examly.io/deleteUsers/${id}`,
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
    //setData(data.filter((item) => item.id !== id));
  //};
  
  const columns = [
    { field: "id", headerName: "ID", width: 100 },
    {
      field: "username",
      headerName: "User",
      width: 200,
      
    },
    { field: "email", headerName: "Email", width: 200 },
    {
      field: "active",
      headerName: "Active",
      width: 120,
    },
    {
      field: "action",
      headerName: "Action",
      width: 150,
      renderCell: (params) => {
        return (
          <>
            <Link to={"/user/" + params.row.id}>
              <button className="userListEdit">Edit</button>
            </Link>
            <DeleteOutline
              className="userListDelete"
              onClick={() => handleDelete(params.row.id)}
            />
          </>
        );
      },
    },
  ];

  return (
    <>
    <Link to="/newUser">
    <button className="userAddButton">Create</button>
  </Link>
    <div className="userList">
      <DataGrid
        rows={data}
        disableSelectionOnClick
        columns={columns}
        pageSize={8}
        checkboxSelection
      />
    </div>
    </>
  );
}

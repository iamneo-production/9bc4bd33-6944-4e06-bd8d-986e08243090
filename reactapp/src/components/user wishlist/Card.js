import React ,{useState,useEffect} from 'react'


function Card() {
    const [user,setUser] = useState([]);

    const handleClick=(e)=>{
      e.preventDefault()

      fetch("http://localhost:8080/wishlist/add",{
        method:"POST",
        headers:{"Content-Type":"application/json"},
        body:JSON.stringify(user) 

    }).then(()=>{
      console.log("New Product added")
    })
  }

    const fetchData =()=>{
        fetch("https://randomuser.me/api/?nat=us&results=18&page=1")
        .then((response) =>{
            return response.json();
        }).then((data)=>{
            let fish = data.results
            console.log(fish);
            setUser(fish)
        })
    }
    useEffect(()=>{
        fetchData();
    },[])

    return (
        <div className="clearfix">
        <div className='navbar'>


          <div class="left">
            <a href="#">Fish Landia</a>
          </div>
        
            <div className="mid">
          <a href="#">Home </a> <a href="#">Orders </a> <a href="#">Users </a> <a href="#">Products </a>

          </div>
          <div class="right">
              <a href="#">Logout</a>
            </div>
        </div>
        <div className="row"><h1>Wishlist</h1>
          {user.map(data => (
            <div className="col-md-4 animated fadeIn" key={data.id.value}>
              <div className="card">
                <div className="card-body">
                  <div className="avatar">
                    <img
                      src={data.picture.large}
                      className="card-img-top"
                      alt=""
                    />
                  </div>
                  <h5 className="card-title">
                    {data.name.first +
                      " " +
                      data.name.last}
                  </h5>
                  <p className="card-text">
                    {data.location.city +
                      ", " +
                      data.location.state}
                    <br />
                    <span className="phone">{data.phone}</span>
                  </p>

                  <button id='wishlist' onClick={handleClick}>Add to Cart</button>
                  <button id='wishlist' onClick={handleClick}>Delete</button>
                
                  </div>
              </div>
            </div>
          ))}
        </div>
    
      </div>
    )
}

export default Card

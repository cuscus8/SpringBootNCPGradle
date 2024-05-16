import React, { useEffect } from 'react';
import axios from 'axios'


const App = () => {

useEffect(()=>{

  axios.get("http://localhost:8080/plus",{params:{
    a:"1",
    b:"2"
  }})
  .then(res => console.log(res.data))
  .catch(error => console.log(error))
},[])


  return (
    <div>

        <h1>SpringBootNCPGradle</h1>

        <img src='../image/peng.png' alt='cake' width='100px' height='100px'/>
     
    </div>
  );
};

export default App;

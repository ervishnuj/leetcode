import React from 'react'
import { Routes,Route,Link} from 'react-router-dom'
const Home=()=>{
  return <h2>Home Page</h2>
}
const About=()=>{
  return <h2>About Page</h2>
}
const Contact=()=>{
  return <h2>Contact Page</h2>
}
const NotFound=()=>{
  return <h2>not Found Page</h2>
}
const App = () => {
  return (
    <div>
      <nav>
        <Link to="/">Home</Link>
        <Link to="/about">About</Link>
        <Link to="/contact">Contact</Link>
      </nav>
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/about" element={<About/>} />
        <Route path="/contact" element={<Contact/>} />
        <Route path="/*" element={<NotFound/>} />
      </Routes>
    </div>
  )
}

export default App

// import React from 'react'
// import { useEffect,useState } from "react";
// const App = () => {
//   const [posts,setPosts]=useState([]);
//   const[loading,setLoading]=useState(true);
//   const [error,setError]=useState(null)
//   useEffect(
//     fetch("https://jsonplaceholder.typicode.com/todos/1").then(response => {
//       if(!response.ok){
//         throw new Error("API call failed")
//       }
//       return response.json();})
//       // .then(json => console.log(json))
//       .then(
//         (json)=>{
//           console.log(json);
//           setPosts(json);
//           setLoading(false);
//         }
//       ).catch((err)=>{
//         setError(err.message);
//         setLoading(false);
//       })
//   )
//   return(
//     <div>
//       <h1>Posts</h1>
//       {loading && <p>Loading....</p>}
//     {error && <p> {error}</p>}
//     {!loading && !error&&(
//       <ul>
//         {posts.slice(0,5).map((post)=>(
//           <li key={post.id}>{post.title}</li>
//         ))}
//       </ul>
//     )}    
//     </div>
//   )
  
// //   const [count,setCount]=useState(0);
// //   useEffect(()=>{
// //   console.log("component Mounted")
// // },[count])
//   // return <h1>Demo Text</h1>
//   // return (
//   //   <button onClick={()=>setCount(count+1)}>Change</button>
//   // )
// };

// export default App

// // import React, { Component } from 'react'
// // // import ProductCard from './components/ProductCard';
// // import { useState } from 'react';
// // const ProductCard=()=>{
// //   return(
// //     <div>
// //       <h2>
// //         Demo content
// //       </h2>
// //       <p>This is a demo data</p>
// //     </div>
// //   )
// // }

// // const App = () => {
// //   // const name="Demo";
// //   // const age =32;
// //   // const [count,setCount]=useState(0);
// //   const [username,setUsername]=useState("");
// //   const [password,setPassword]=useState("");
// //   // const isPremium=false;
// //   // const courses=["react","java","javascript"]
// //   console.log("Component re-render")
// //   return (
// //     <div>
    
// //     {/* <div className="container">This is {name} content and age is {age}</div> */}
// //     {/* // <div>{isPremium?"Premium access granted": "Upgrade to Premium"}</div> */}
// //     {/* <div>
// //       <ul>
// //         {courses.map((course,index)=>(
// //           <li key={index}>
// //             {index+1}.{course}
// //           </li>
// //         ))}
// //       </ul>
// //     </div> */}
// //     {/* <ProductCard title="laptop" price={5000}/>
// //     <ProductCard title="Mobile" price={65000}/> */}
// //     {/* <h1>{count}</h1> */}
// //     {/* <button onClick={()=>setCount(count+1)}>increase</button>
// //     <button onClick={()=>{if(count>0)setCount(count-1)}}>decrease</button>
// //     <button onClick={()=>setCount(0)}>reset</button>
// //     <button onClick={()=>setCount(prev=>prev+1)}>prev</button> */}
// //     <h1>Hello {username}</h1>
// //     <p>Your password {password}</p>
// //     <form onSubmit={(e)=>{
// //       e.preventDefault();
// //       console.log("Username",username);
// //       console.log("Password",password);
// //       setUsername("");
// //       setPassword("");
// //     }} > 
// //       <input type="text" placeholder='Enter username' Value={username} onChange={(e)=>setUsername(e.target.value)} />
// //       <input type="password" placeholder='Enter password' Value={password} onChange={(e)=>setPassword(e.target.value)} />
// //       <button type="submit" disabled={!username||!password}>Submit</button>
// //     </form>
    
// //     </div>
// //   )
// // }

import { useState } from "react";
export default function Q5(){

//     const [text,setText]=useState("");

//    let handleInput=(e)=>{
//     setText(e.target.value);
const [message,setMessage]=useState(false);
let show=()=>{
    setMessage(true);
}
    return<>
    {/* <input type="text" name="username" placeholder="Enter text what you want enter "
    onChange={handleInput} style={{width:"30%",height:"40px" ,padding:"10px",margin:"20px", backgroundColor:"white", color:"black"}}/>
    {text && <h5 style={{ marginTop: "5px"}}>You entered text is:- {text}</h5>}
     */}
     {/* <button onClick={show} style={{margin:"20px",height:"40px",width:"30%", backgroundColor:"orange"}}>Get Message</button>
     {message && <h2>Wel-Come to React Programming </h2>} */}


     <p>jn knnk jin nj njf  njbbnfekm fefkj mkjnn knf ec 
        fnekfc kn kkn fkn knn k n mkfn fm jkn e fjke  e kj dw;
        dn kdnk d </p>
         {message && <p>this second paragraph text </p>}
         <button style={{width:"10%"}} onClick={show}>
            {show ? "More" : "Show"}
         </button>
         
    </>
}
import React from "react";
//import '../public/Question4.css';
import '../public/Question4.css';
export default function Question4(){
    const loginhandler=()=>{
        alert("Login button clicked ...");
        console.log("Login button clicked....");
    }
    const registerhandler=()=>{
        alert("Register button clicked...");
        console.log("Register button clicked....");
    }
    return<>
    
    <div className="container">
    <div className="card">
        <button className="btn" onClick={loginhandler}>Login</button>
        <button  className="btn"onClick={registerhandler} >Register</button>

    </div>
    </div>
    
    </>
}



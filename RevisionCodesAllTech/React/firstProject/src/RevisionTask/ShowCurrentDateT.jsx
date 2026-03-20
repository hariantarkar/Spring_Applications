import React, { useEffect, useState } from "react";
import {format} from "date-fns";
export default function ShowCurrentDateT(){
const [time,setTime]=useState(new Date());

useEffect(()=>{

    const timer=setInterval(()=>{
        setTime(new Date());
    },1000);

    return()=>{
        clearInterval(timer);
    }
},[]);
    return (
        <h1>Current Date and Time is :<br></br><br></br> {format(time,"dd-MM-yyyy HH:mm:ss")}</h1>
    );

}
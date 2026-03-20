import React from "react";
import '../public/Student.css';
export default function Student(props) {
 return<>
 <div className="container">
    <div className="card">
        <ul className="list">
            <li>{props.Name}</li>
            <li>{props.Course}</li>
            <li>{props.City}</li>
        </ul>
    </div>
     <div className="card">
        <ul className="list">
            <li>{props.Name}</li>
            <li>{props.Course}</li>
            <li>{props.City}</li>
        </ul>
    </div>
</div>
    </>
 
}

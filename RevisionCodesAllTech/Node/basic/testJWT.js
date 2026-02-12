let express=require("express");
let jwt=require("jsonwebtoken");
const secretkey="$$565&&$$";
let app=express();

let token=jwt.sign({
    id:1,
    name:"sham",
    
},secretkey,{expiresIn:'1m'});
console.log(token);

console.log("token created ...........");


setTimeout(()=>{
    
jwt.verify(token,secretkey,(err,decoded)=>{
    if(err){
        console.log("expiresed token time out  ");
    }
    else{
        console.log("Token verified");
    
        console.log("token verify .."+decoded.id);
        console.log("token verify.."+decoded.name);

    }
})
},70000);
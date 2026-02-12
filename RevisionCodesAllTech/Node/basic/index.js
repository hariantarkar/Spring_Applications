let express=require("express");
let bodyParser=require("body-parser");
let session=require("express-session");

let path=require("path");




let app=express();

app.use(express.static("public"));

app.use(bodyParser.urlencoded({exteded:true}))

let p=path.join(__dirname+"/public")

app.get("/",(req,res)=>{
    res.sendFile(p +"/first.html");

});

app.use(session({

    secret :"##123666$$",
    resave:false,
   saveUninitialized:true


}));

app.post("/save",(req,res)=>{

    let {name,email ,contact}=req.body;

    req.session.uname=name;
    req.session.uemail=email;
    req.session.ucontact=contact;

    res.send(`User name ${req.session.uname} UserEmail ${req.session.uemail} UserContact${req.session.ucontact}`);

});

app.listen(3333,()=>{
console.log("server running");
});


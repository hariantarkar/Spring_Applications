let express=require("express");
let bodyParser=require("body-parser");
let path=require("path");
let mysql=require("mysql2");

let conn=mysql.createConnection({
	 host:"localhost",
     port:"3307",
	 user:"root",
	 password:"root",
	 database:"productapp"
});
conn.connect((err)=>{
	if(err){
		 console.log("connection failed");
	}
	else{
		console.log("Database is connected");
	}
});
let app=express();

app.use(express.static("public"));

app.use(bodyParser.urlencoded({extended:true}));

let p=path.join(__dirname+"/public");
app.get("/",(req,res)=>{
	  res.sendFile(p+"/first.html");
});

/*app.post("/save",(req,res)=>{
	  let {name,email,contact}=req.body;
	  conn.query("insert into employee values(?,?,?)",[name,email,contact],(err,result)=>{
		 
			if(err)
			{ console.log("Not inserted"+err);
			} 
			else{
			   if(result.affectedRows>0)
			   { res.send("Employee Added");
			   }
			   else{
				   res.send("Employee Not Added");
			   }
			}
	  });
	  
	  
});
conn.query("delete  from employee where email=?",["harish3738@gmail.com"],(err,result)=>{
    if(err){

        console.log("employee not deleted ".err);
    }
    else{
        if(result.affectedRows){
            console.log("employee deleted successfully");
        }
    }
});
conn.query("select *from employee",(err,result)=>{
    if(err){
        console.log("something wrong ");
    }
    else{
        result.forEach((row)=>{
        console.log(row.name+"\t\t"+row.email+"\t\t"+row.contact);

        });
    }
});*/

conn.query("update employee set email=? ,contact=? where name=?",["pavan@gmail.com","3433433","pavan"],(err,result)=>{
    if(err){
        console.log("something is wrong ");
    }
    else{
        if(result.affectedRows>0){
            console.log("record updated successfully");
         }
        }
});

app.listen(3000,()=>{
  console.log("server started");
});


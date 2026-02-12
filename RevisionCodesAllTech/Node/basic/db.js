let mysql=require("mysql2");

let conn=mysql.createConnection({
    Host:"localhost",
    Port:"3307",
    User:"root",
    password:"root",
    db_name:"productapp"
});

conn.connect((err)=>{
    if(err){
        console.log("database is not connected ");
    }
    else{
        console.log("data base is connected ");
    }
});

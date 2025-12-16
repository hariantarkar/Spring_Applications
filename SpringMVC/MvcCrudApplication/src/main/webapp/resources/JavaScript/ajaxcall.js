function Ajaxcall(value){
	
	let xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange=function(){
		if(this.readyState==4 && this.status==200){
			
			let jsonObj=JSON.parse(this.responseText);
			
			let tbody=document.getElementById("tbody");
			tbody.innerHTML="";
			jsonObj.forEach((val)=>{
				let tr=document.createElement("tr");
				
				let td=document.createElement("td");
				    td.innerHtml=""+val.id;
					tr.appendChild(td);
					
				    td=document.createElement("td");
				    td.innerHTML=""+val.name;
					tr.appendChild(td);
					
				    td=document.createElement("td");
					td.innerHTML=""+val.email;
					tr.appendChild(td);
					
					td=document.createElement("td");
					td.innerHTML=""+val.contact;
					tr.appendChild(td);
					
					td=document.createElement("td");
					td.innerHTML="<a href='delEmp?Id="+val.id +"'>Delete</a>";
					tr.appendChild(td);
					
					
					td=document.createElement("td");
					td.innerHTML="<a href='UpdateEmp?Id="+val.id +"name="+val.name+"email="+val.email +"contact= "+val.contact+"'>Update</a> ";
					tr.appendChild(td);
					
				tbody.appendChild(tr);
				
				
			})
			
		}
	};
	xhttp.open("get","search?d="+value,true);
	xhttp.send();
	
	
	
}
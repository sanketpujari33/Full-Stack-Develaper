import React,{useEffect, useState} from 'react';
function PostMethod() {
        const [name , setName]=useState("");
        const [email, setEmail]=useState("");
        const [mobile, setMobile]=useState("");
        function saveUser(){
            let data={name,email,mobile}
            const url='https://jsonplaceholder.typicode.com/users';
            fetch(url,{
                method:'POST',
                headers:{
                    'Accept': 'application/json',
                    'Content-Type':'application/json'
                },
                body:JSON.stringify(data)
            }
                ).then((response)=>{
                    if(response.ok){
                        response.json().then((data)=>{
                            console.log(data);
                        })
                    }else{
                        response.json().then((data)=>{
                            console.log(data);
                        })
                    }

            })
        }

    return ( 
        <>
         <h1>Post Method</h1>
         <input type="text" value={name} onChange={(e)=>{setName(e.target.value)}} name="name"/><br /> <br />
         <input type="text" value={email} onChange={(e)=>{setEmail(e.target.value)}}  name="email"/><br /> <br />
         <input type="text" value={mobile} onChange={(e)=>{setMobile(e.target.value)}} name="mobile"/><br /> <br />
         <button type="button" onClick={saveUser}>save new User</button>
        </>
     );
}

export default PostMethod;
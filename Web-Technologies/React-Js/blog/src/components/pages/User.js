import { useParams, useLocation } from 'react-router-dom';
function User() {
    const location=useLocation();
    console.log(location);
    const params = useParams();
    const { name } = params;
    console.log(name);
    // http://localhost:3000/user/Sanket?surename=Pujari#6566546
    return ( 
        <>
        <h1>This is {name}'s page</h1>    
        </>
     );
}

export default User;
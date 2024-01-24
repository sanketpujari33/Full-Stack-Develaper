import Table from 'react-bootstrap/Table';
function ArrayListing() {
    // const student=['Snaket','Shekhar','Nitin','vishal','swopnil'];
    // //map looping
    // student.map((data)=>{
    //     // console.warn("My Name is: ",data);
    // })
    // for(let i=0; i<student.length; i++){
    //     console.warn("My Name is: ",student[i]);
    // }
    const info = [
        { name: 'Snaket', age: 24, email: 'sanket@gmail.com', contact: 111 },
        { name: 'Shekhar', age: 28, email: 'shekhar@gmail.com', contact: 222 },
        { name: 'Nitin', age: 29, email: 'nitin@gmail.com', contact: 333 },
        { name: 'vishal', age: 23, email: 'vishal@gmail.com', contact: 444 },
        { name: 'swopnil', age: 27, email: 'swopnil@gmail.com', contact: 555 }
    ];
    const data = ["id","name", "age", "email", "contact"]
    return (
        <>
            <h1>ArrayListing</h1>


            <Table striped variant='dark' bordered hover size="sm">
                <thead>
                    <tr key={'thead'}>
                        {data.map((data, index) => (
                            <th key={index}>{data}</th>
                        ))}
                    </tr>
                </thead>
                <tbody>
                    {info.map((info, index) =>
                        <tr key={index}>
                            <td>{index+1}</td>
                            <td >{info.name}</td>
                            <td >{info.age}</td>
                            <td >{info.email}</td>
                            <td>{info.contact}</td>
                        </tr>
                    )}
                </tbody>
            </Table>
        </>
    );
}

export default ArrayListing;
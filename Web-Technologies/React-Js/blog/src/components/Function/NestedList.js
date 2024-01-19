import { Table } from 'react-bootstrap';
function NestedList() {
    const info = [
        {
            name: 'Snaket',
            age: 24,
            email: 'sanket@gmail.com',
            contact: 111,
            address: [
                { Hn: 10, city: 'Noida', country: 'India' },
                { Hn: 34, city: 'Gurgaon', country: 'India' },
                { Hn: 90, city: 'Delhi', country: 'India' },
                { Hn: 43, city: 'Noida', country: 'India' },
            ]
        },
        {
            name: 'Shekhar',
            age: 28,
            email: 'shekhar@gmail.com',
            contact: 222,
            address: [
                { Hn: 10, city: 'Noida', country: 'India' },
                { Hn: 34, city: 'Gurgaon', country: 'India' },
                { Hn: 90, city: 'Delhi', country: 'India' },
                { Hn: 43, city: 'Noida', country: 'India' },
            ]
        },
        {
            name: 'Nitin',
            age: 29,
            email: 'nitin@gmail.com',
            contact: 333,
            address: [
                { Hn: 10, city: 'Noida', country: 'India' },
                { Hn: 34, city: 'Gurgaon', country: 'India' },
                { Hn: 90, city: 'Delhi', country: 'India' },
                { Hn: 43, city: 'Noida', country: 'India' },
            ]
        },
        {
            name: 'vishal',
            age: 23,
            email: 'vishal@gmail.com',
            contact: 444,
            address: [
                { Hn: 10, city: 'Noida', country: 'India' },
                { Hn: 34, city: 'Gurgaon', country: 'India' },
                { Hn: 90, city: 'Delhi', country: 'India' },
                { Hn: 43, city: 'Noida', country: 'India' },
            ]
        },
        {
            name: 'swopnil',
            age: 27, email:
                'swopnil@gmail.com',
            contact: 555,
            address: [
                { Hn: 10, city: 'Noida', country: 'India' },
                { Hn: 34, city: 'Gurgaon', country: 'India' },
                { Hn: 90, city: 'Delhi', country: 'India' },
                { Hn: 43, city: 'Noida', country: 'India' },
            ]
        }
    ];
    const data = ["id", "name", "age", "email", "contact", "addresses"]
    return (
        <>
            <h1>Nested List</h1>


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
                            <td>{index + 1}</td>
                            <td >{info.name}</td>
                            <td >{info.age}</td>
                            <td >{info.email}</td>
                            <td>{info.contact}</td>
                            <td>
                                <Table striped variant='dark' bordered hover size="sm">

                                    <thead>
                                        <tr key={'thead'}>
                                                <th >HN</th>
                                                <th >City</th>
                                                <th >Country</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        {info.address.map((add, i) =>
                                            <tr key={i}>
                                                <td>{add.Hn}</td>
                                                <td>{add.city}</td>
                                                <td>{add.country}</td>
                                            </tr>
                                        )}
                                    </tbody>
                                </Table>
                            
                            </td>
                        </tr>
                    )}
                </tbody>
            </Table>
        </>
    );
}

export default NestedList;
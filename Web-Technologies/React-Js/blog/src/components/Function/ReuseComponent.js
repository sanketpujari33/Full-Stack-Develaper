import Student from "./Student";

function ReuseComponent() {
    const data = [
        { name: 'Snaket', age: 24, email: 'sanket@gmail.com', contact: 111 },
        { name: 'Shekhar', age: 28, email: 'shekhar@gmail.com', contact: 222 },
        { name: 'Nitin', age: 29, email: 'nitin@gmail.com', contact: 333 },
        { name: 'vishal', age: 23, email: 'vishal@gmail.com', contact: 444 },
        { name: 'swopnil', age: 27, email: 'swopnil@gmail.com', contact: 555 }
    ];

    return (
        <>
            <h1>Reuse Component</h1>
            <div style={{ padding: 20, margin: 30, justifyContent: 'space-evenly', flexWrap: 'wrap' }}>
                {data.map((item, i) =>
                    <Student data={item} />
                )}
            </div>
        </>
    );
}

export default ReuseComponent;
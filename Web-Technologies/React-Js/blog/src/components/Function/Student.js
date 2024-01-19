import {Card} from 'react-bootstrap'
function Student(props) {
    console.log(props);
    return (
          <>
            <Card
              bg={"Dark".toLowerCase()}
              key={"Dark"}
              text={"Dark".toLowerCase() === 'light' ? 'dark' : 'white'}
              style={{ width: '18rem' }}
              className="mb-2"
            >
              <Card.Header>Header</Card.Header>
              <Card.Body>
                <Card.Title>{ props.data.name}</Card.Title>
                <Card.Text>
                  {props.data.email}
                </Card.Text>
              </Card.Body>
            </Card>
        </>
    );
}

export default Student;
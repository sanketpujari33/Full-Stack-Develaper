import React,{Component} from 'react'
import { Button } from  'react-bootstrap'
import GetSnapshotBeforeUpdate2 from './GetSnapshotBeforeUpdates2';
class getSnapshotBeforeUpdate extends Component {
    constructor() {
        super();
        this.state = {
            name: "Sanket",
        };
    }
    render() {
        return (
            <>
            <GetSnapshotBeforeUpdate2 name={this.state.name}/>
            <Button onClick={()=>{ 
                this.setState({name:"sanketpujari"})}}
                >ChangeProps</Button>
            </>
        );
    }
}

export default getSnapshotBeforeUpdate;
import React, { Component } from 'react';
import { FaThinkPeaks, FaSignature, FaPushed } from 'react-icons/fa';
import '../assest/css/c.css';
import Hmm from './Hmm';
import DataService from '../api/DataService'

class Welcome extends Component {
    constructor() {
        super();
        this.state = {
            companyCount: 0,
            complexCount: 0,
            buildingCount: 0,
            roomCount: 0
        }
    }

    componentDidMount = () => {
        DataService.getCount().then(response => {
            console.log(response.data); this.setState({
                companyCount: response.data.companyCount,
                complexCount: response.data.complexCount,
                buildingCount: response.data.buildingCount,
                roomCount: response.data.roomCount,
            })
        });
    }

    render() {
        return (
            <>
                <div id="content" className="p-4 p-md-5 pt-5">
                    <div className="row">
                        <Hmm name={'Company'} count={this.state.companyCount} icons={<FaPushed size={75} color="#c0c0c0" opacity="0.7" />} color={{ backgroundColor: "#FFD700" }} />
                        <Hmm name={'complex'} count={this.state.complexCount} icons={<FaThinkPeaks size={75} color="#c0c0c0" opacity="0.7" />} color={{ backgroundColor: "#32CD32" }} />
                        <Hmm name={'Building'} count={this.state.buildingCount} icons={<FaSignature size={75} color="#c0c0c0" opacity="0.7" />} color={{ backgroundColor: "#BA55D3" }} />
                        <Hmm name={'Room'} count={this.state.roomCount} icons={<FaThinkPeaks size={75} color="#c0c0c0" opacity="0.7" />} color={{ backgroundColor: "#32CD32" }} />
                    </div>
                </div>
            </>
        )
    }
}
export default Welcome;
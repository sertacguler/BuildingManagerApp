import React, { Component } from 'react';
import Campanies from './Campanies';
import Outgoings from './Outgoings';

class Inout extends Component {
    constructor() {
        super();
        this.state = {
            income: false,
            outgoings: true,
            bgColorActive: 'Blue',
            txtColor: 'White',
            bgColorPasive: 'darkblue'
        }
    }

    changeTable = (event) => {
        if (event.target.name === 'income') {
            this.setState({ income: true })
            this.setState({ outgoings: false })
        }
        else if (event.target.name === 'outgoings') {
            this.setState({ income: false })
            this.setState({ outgoings: true })
        }
    }

    render() {
        return (
            <>
                <div id="content" className="p-4 p-md-5 pt-5">
                    <div className="btn-group">
                        <button type="button" name="income" className="btn"
                            style={this.state.income ? { backgroundColor: 'blue', color: 'White' } : { backgroundColor: 'darkblue', color: 'White' }}
                            onClick={this.changeTable}>Gelir</button>
                        <button type="button" name="outgoings" className="btn"
                            style={this.state.outgoings ? { backgroundColor: 'blue', color: 'White' } : { backgroundColor: 'darkblue', color: 'White' }}
                            onClick={this.changeTable}>Gider</button>
                    </div>
                    <div className="btn-group float-right">
                        <button type="button" name="giderEkle" className="btn btn-dark"
                            onClick={this.add}>Gelir Ekle</button>
                        <button type="button" name="gelirEkle" className="btn btn-secondary"
                            onClick={this.changeTable}>Gider Ekle</button>
                    </div>
                    {this.state.income ? <Campanies /> : <Outgoings />}
                </div>
            </>
        )
    }
}
export default Inout;
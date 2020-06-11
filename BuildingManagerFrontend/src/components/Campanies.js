import React, { Component } from 'react';
import '../assest/css/main.css';
import '../assest/css/util.css';
import Filltable from './Filltable'

import UserConsumer from './theme';

class Campanies extends Component {

    render() {
        return (
            <>
                <div id="content" className="p-4 p-md-5">

                    <div className="table100 ver2 m-b-110">
                        <div className="table100-head">
                            <table>
                                <thead>
                                    <tr className="row100 head">
                                        <th className="cell100 column2 pl-3">Firma Adı</th>
                                        <th className="cell100 column3">Firma Sahibi</th>
                                        <th className="cell100 column4">Firma Adres</th>
                                        <th className="cell100 column5">Firma Tel</th>
                                        <th className="cell100 column5">Ücret</th>
                                    </tr>
                                </thead>
                            </table>
                        </div>
                        <div className="table100-body js-pscroll">
                            <table>
                                <tbody>

                                    <Filltable />

                                </tbody>
                            </table>
                        </div>
                    </div>

                    <UserConsumer>{value => {
                        const x = value;
                        console.log(x);
                    return (<span>{x}</span>)
                    }}
                    </UserConsumer>
                    
                </div>
            </>
        )
    }
}

export default Campanies;
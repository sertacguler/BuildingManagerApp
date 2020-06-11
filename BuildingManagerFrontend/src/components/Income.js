import React, { Component } from 'react';
import '../assest/css/main.css';
import '../assest/css/util.css';
import Filltable from './Filltable'

import UserConsumer from './theme';

class Income extends Component {
    constructor() {
        super();
        this.state = {
            items: [{
                "companyid": "1",
                "companyno": "202002291235",
                "tanımlama": "Sunucu",
                "aciklama": "Sunucu domain aylık Ücreti",
                "duzenlenmeTarihi": "2020-05-12",
                "sonOdemeTarihi": "2020-05-22",
                "durumu": false,
                "Kategori": "Net",
                "ucret": "35"
            },
            {
                "companyid": "2",
                "companyno": "202002291238",
                "tanımlama": "Sunucu",
                "aciklama": "Sunucu Hosting yıllık Ücreti",
                "duzenlenmeTarihi": "2020-12-01",
                "sonOdemeTarihi": "2020-12-30",
                "durumu": false,
                "Kategori": "Net",
                "ucret": "110"
            }]
        }

    }

    render() {
        return (
            <>
                <div id="content" className="p-4 p-md-5">
                    <h4>Income</h4>
                    <div className="table100 ver2 m-b-110">
                        <div className="table100-head">
                            <table>
                                <thead>
                                    <tr className="row100 head">
                                        <th className="cell100 column2 pl-3">Tanımlama</th>
                                        <th className="cell100 column5">Açıklama</th>
                                        <th className="cell100 column4">Tekrar</th>
                                        <th className="cell100 column5">Tarih</th>
                                        <th className="cell100 column5">Kategori</th>
                                        <th className="cell100 column5">Ücret</th>
                                    </tr>
                                </thead>
                            </table>
                        </div>
                        <div className="table100-body js-pscroll">
                            <table>
                                <tbody>


                                   


                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </>
        )
    }
}

export default Income;
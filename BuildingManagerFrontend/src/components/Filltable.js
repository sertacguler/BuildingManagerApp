import React, { useContext } from 'react';
import '../assest/css/main.css';
import '../assest/css/util.css';
import { ItemContext } from './ItemContext';

function openCompany(e) {
    console.log(e);
}

const Filltable = () => {

    const [items] = useContext(ItemContext);

    return (
        <>
            {items.map(item => (
                <tr className="row100 body" key={item.companyno} onClick={(e) => openCompany(item.companyno)}>
                    <td className="cell100 column2 pl-3">{item.companyname}</td>
                    <td className="cell100 column3"><b>{item.companyowner}</b></td>
                    <td className="cell100 column4">{item.companyaddress}</td>
                    <td className="cell100 column5">{item.companyphone}</td>
                    <td className="cell100 column5"><b>{item.companyprice} TL</b></td>
                </tr>
            ))}
        </>
    )
}

export default Filltable;
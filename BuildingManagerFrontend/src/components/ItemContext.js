import React, { useState, useEffect } from 'react';
import axios from 'axios';

export const ItemContext = React.createContext();

export const ItemProvider = props => {

    const [items, setItems] = useState([]);

    useEffect(() => {
        const fetchData = async () => {
            const response = await axios('http://localhost:2525/companies');
            console.log(response.data);
            setItems(response.data);
        };
        fetchData();
    }, []);

    return (
        <ItemContext.Provider value={[items, setItems]}>
            {props.children}
        </ItemContext.Provider>
    );
}

export default ItemProvider;
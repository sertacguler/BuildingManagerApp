import React, { Component } from 'react';

const CompContext = React.createContext();

export class UserProvider extends Component {
    render() {
        return (
            <CompContext.Provider value={'123456789'}>
                {this.props.children}
            </CompContext.Provider>
        )
    }
}

const UserConsumer = CompContext.Consumer;
export default UserConsumer;
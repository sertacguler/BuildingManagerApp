import React from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Sidebar from './components/Sidebar';
import Welcome from './components/Welcome';
import Campanies from './components/Campanies';
import Calculate from './components/Calculate';
import Inout from './components/Inout';
import Login from './components/Login';
import Logout from './components/Logout';

import { ItemProvider } from './components/ItemContext';
import {UserProvider} from './components/theme';

function App() {

  return (
    <ItemProvider>
      <UserProvider>
        <div className="wrapper d-flex align-items-stretch">
          <Router>
            <>
              <Sidebar />
              <Switch>
                <Route path="/" exact component={Welcome} />
                <Route path="/campanies" component={Campanies} />
                <Route path="/calculate" component={Calculate} />
                <Route path="/inout" component={Inout} />
                <Route path="/login" component={Login} />
                <Route path="/logout" component={Logout} />
                <Route component={Error} />
              </Switch>
            </>
          </Router>
        </div>
      </UserProvider>
    </ItemProvider>
  );
}

export default App;

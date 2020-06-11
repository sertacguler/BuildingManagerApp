import React from 'react';

import { Link } from "react-router-dom";
import { withRouter } from 'react-router';

function Sidebar() {

    return (
        <>
            <nav id="sidebar">
                <div className="custom-menu">
                    <button type="button" id="sidebarCollapse" className="btn btn-primary">
                        <i className="fa fa-bars"></i>
                        <span className="sr-only">Toggle Menu</span>
                    </button>
                </div>
                <div className="p-4">
                    <h1><a href="index.html" className="logo">Manager<span>Building Manager</span></a></h1>
                    <ul className="list-unstyled components mb-5">
                        <li className="active">
                            <Link to="/"><span className="fa fa-user mr-3"></span> Ana Sayfa</Link>
                        </li>
                        <li>
                            <Link to="/campanies"><span className="fa fa-user mr-3"></span> Firmalar</Link>
                        </li>
                        <li>
                            <Link to="/calculate"><span className="fa fa-briefcase mr-3"></span> Gelir Hesaplama</Link>
                        </li>
                        <li>
                            <Link to="/inout"><span className="fa fa-briefcase mr-3"></span> Gelir/Gider</Link>
                        </li>
                        <li>
                            <Link to="/logout"><span className="fa fa-sticky-note mr-3"></span> Giriş / Çıkış</Link>
                        </li>
                    </ul>

                    <div className="mb-5">
                        <h3 className="h6 mb-3">Subscribe for newsletter</h3>
                        <form action="#" className="subscribe-form">
                            <div className="form-group d-flex">
                                <div className="icon"><span className="icon-paper-plane"></span></div>
                                <input type="text" className="form-control" placeholder="Enter Email Address" />
                            </div>
                        </form>
                    </div>

                    <div className="footer">
                        <p>Ne yazalım bilemedim</p>
                    </div>

                </div>
            </nav>
        </>
    )
}

export default withRouter(Sidebar);
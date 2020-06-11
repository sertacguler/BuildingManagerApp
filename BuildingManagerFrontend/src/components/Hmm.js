import React from 'react';

function Hmm(props) {

    return (
        <>

            <div className="col-3">
                <div className="card text-white bg-flat-color-1">
                    <div className="card-body" style={props.color}>
                        <div className="card-left pt-1 float-left">
                            <h3 className="mb-0 fw-r">
                                <div>
                                    {/* <span className="currency float-left mr-1">$</span> */}
                                    <span className="count"><span data-v-0e38f4aa="">{props.count}</span></span>
                                </div>
                            </h3>
                            <p className="text-dark mt-1 m-0">{props.name}</p>
                        </div>
                        <div className="card-right float-right text-right">
                            {props.icons}
                        </div>
                    </div>
                </div>
            </div>

        </>
    )
}

export default Hmm;
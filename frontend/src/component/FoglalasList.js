import React from 'react';
import {default as store} from '../store/FoglalasStore'
import FoglalasListItem from "../../../../../Adatok/FoglalasListItem";

class FoglalasList extends React.Component{

    constructor(props) {
        super(props);
        this.state = {foglalas : []};
        this._updateState = this._updateState.bind(this);
    }


    componentDidMount() {
        store.addChangeListener(this._updateState);
    }


    componentWillUnmount() {
        store.removeChangeListener(this._updateState);
    }

    _updateState(){
        this.setState({foglalas : store._foglalasok});
    }

    render() {
        return(
            <div>
                {this.state.foglalasok.map(({Foglalas_Id, cellaszam, erkezes, tavozas, vezeteknev, keresztnev, telefonszam, tipus, aram}, index)=>{
                    return(
                        <FoglalasListItem key={index} Foglalas_Id={Foglalas_Id} cellaszam={cellaszam} erkezes={erkezes}
                        tavozas={tavozas} vezeteknev={vezeteknev} keresztnev={keresztnev} telefonszam={telefonszam}
                        tipus={tipus} aram={aram}/>
                    );
                })}
            </div>
        );
    }
}

export default FoglalasList;

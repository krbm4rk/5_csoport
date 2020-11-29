import axios from 'axios';
import dispatcher from '../dispatcher/Dispatcher';
import * as actionConstants from '../dispatcher/FoglalasActionConstants'

export const recordFoglalas = ({Foglalas_Id, cellaszam, erkezes, tavozas, vezeteknev, keresztnev, telefonszam, tipus, aram }) =>{
    axios.post('/foglalas/record',
        {
            Foglalasfoglalas_Id : Foglalasfoglalas_Id,
            cellaszam : cellaszam,
            erkezes : erkezes,
            tavozas : tavozas,
            vezeteknev : vezeteknev,
            keresztnev : keresztnev,
            telefonszam : telefonszam,
            tipus : tipus,
            aram : aram
        })
        .then(() => {
            fetchComplexNumbers();
            dispatcher.dispatch({action : actionConstants.clearError});
        })
        .catch((err) => {
            dispatcher.dispatch({
                action : actionConstants.showError,
                payload: `${err.response.status}-${err.response.statusText}: ${err.response.data.message}`
            });
            fetchComplexNumbers();
        });
}

export const fetchFoglalasok = () =>{

    axios.get('/foglalasok/').then((resp)=>{
        dispatcher.dispatch({
            action : actionConstants.refresh,
            payload: resp.data
        });
    })
}

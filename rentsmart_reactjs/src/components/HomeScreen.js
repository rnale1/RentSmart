import { useContext, useEffect } from 'react';
import {HomeContext} from '../contexts/HomeScreenContext'
import Apartment from './Apartment'

const HomeScreen = () => {
    const [homeState, dispatch] = useContext(HomeContext);
    const apiUrl = 'http://localhost:8081/apartment/getAllListings';

    useEffect(() => {
        if(homeState.apartments.length > 0){
            return;
        }
        console.log('fetching apartment data');
        fetch(apiUrl)
        .then(res => res.json())
        .then((apartments) => {
            console.log('Data:',apartments);
            dispatch({type: 'SET_APARTMENT_DATA', payload: apartments});
        }).catch(err => {
            console.log(err);
        });
    });

    return(
        <div>
        {homeState.apartments.length > 0 && (
            <div>
                <p className='apartments-heading fs-2'>Apartment listings</p>
                <table className='table table-success table-striped apartments-table'>
                    <thead>
                        <tr>
                            <th>Apartment number</th>
                            <th>Bathrooms</th>
                            <th>Bedrooms</th>
                            <th>Furnished</th>
                            <th>Rent in $</th>
                            <th>Apartment size in square feet</th>
                        </tr>
                    </thead>
                    <tbody>
                    {homeState.apartments.map((apartment, index) => (
                        <Apartment
                            key={index}
                            index={index}
                            apartment = {apartment}
                        />
                    ))}
                </tbody>
                </table>
            </div>
        )}
        </div>
    );
}

export default HomeScreen;
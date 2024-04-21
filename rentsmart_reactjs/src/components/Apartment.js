const Apartment = ({apartment, index}) => {
    return(
        <tr>
            <td>{apartment.apartmentNumber}</td>
            <td>{apartment.bathroom}</td>
            <td>{apartment.bedrooms}</td>
            <td>{apartment.furnished}</td>
            <td>{apartment.rent}</td>
            <td>{apartment.squareFeet}</td>
        </tr>
    );
};

export default Apartment;
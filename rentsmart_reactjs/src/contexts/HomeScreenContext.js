import { useReducer, createContext } from "react";

const initialState = {
    apartments: []
}

const reducer = (state, action) => {
    switch(action.type){
        case 'SET_APARTMENT_DATA':{
            const apartments = action.payload;
            return {
                ...state,
                apartments
            }
        }
        default:{
            return state;
        }
    }
};

export const HomeContext = createContext();

export const ApartmentProvider = ({children}) => {
    const value = useReducer(reducer, initialState);
    return <HomeContext.Provider value={value}>{children}</HomeContext.Provider>
}
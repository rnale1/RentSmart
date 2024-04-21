import React from 'react';
import ReactDOM from 'react-dom';
import Base from './components/Base'
import { ApartmentProvider } from './contexts/HomeScreenContext';
import 'bootstrap/dist/css/bootstrap.css';
import './css/home.css'

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
  <ApartmentProvider>
    <Base />
  </ApartmentProvider>
);
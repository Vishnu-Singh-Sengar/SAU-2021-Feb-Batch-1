import React from 'react';
import ReactDOM from 'react-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import './index.css';
import MainPage from './components/HomePage';
import BookDetail from './components/BookDetail';
import reportWebVitals from './reportWebVitals';
import {BrowserRouter as Router, Route, Link, Switch} from 'react-router-dom';


ReactDOM.render(
  <React.StrictMode>
  <React.Fragment>
    <Router>
      <Switch>
        <Route path="/" exact component={MainPage} />
        <Route path="/:id" component={BookDetail} />
      </Switch>
    </Router>
  </React.Fragment>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

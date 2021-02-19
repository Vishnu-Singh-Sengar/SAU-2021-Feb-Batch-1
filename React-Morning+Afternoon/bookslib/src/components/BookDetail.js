import React, {useState, useEffect, Component} from 'react';
import axios from 'axios';
import {Table, Button, Modal, ModalHeader, ModalBody, ModalFooter, FormGroup, Label, Input} from 'reactstrap';
import { render } from 'react-dom';
import {Link} from 'react-router-dom';

function BookDetail(props){
    useEffect( ()=> {
        fetchBook();
    },[]);

    const [book,setItem]=useState([]);

    const fetchBook= async () =>{
        const bid=props.match.params.id;
        const fetchBook= await fetch('http://localhost:3000/bookLib/'+bid);
        const book= await fetchBook.json();
        setItem(book);
    };

    return (
        <div>
            <h3 key="{book.id}" className="m-5">Book Name: {book.title}</h3><br></br><hr></hr>
            <h4 className="m-5 p-4">Author: {book.author}</h4>
            <br></br><hr></hr>
            <p className="m-5 p-4"><b>Description:</b> {book.description}</p>
        </div> 
    )
}

export default BookDetail;


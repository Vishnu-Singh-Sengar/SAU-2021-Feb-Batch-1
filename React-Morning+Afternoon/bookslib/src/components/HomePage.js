import React, {Component} from 'react';
import axios from 'axios';
import {Table, Button, Modal, ModalHeader, ModalBody, ModalFooter, FormGroup, Label, Input} from 'reactstrap';
import { render } from 'react-dom';
import {BrowserRouter as Router, Route, Link} from 'react-router-dom';

class MainPage extends Component {
  state={
    books: [],
    newBookData: {
      title:'',
      author:'',
      description:''
    },
    newBookModal: false
  }
  componentWillMount() {
    this.refreshBook();
  }
  toggleNewBookModal(){
    this.setState({
      newBookModal: ! this.state.newBookModal
    });
  }

  addBook(){
    axios.post('http://localhost:3000/bookLib',this.state.newBookData).then((response)=>{
    let {books}=this.state;
    books.push(response.data);
    this.setState({books, newBookModal: false,
      newBookData: {
        title:'',
        author:'',
        description:''
      }
    });
    });
  }

  delBook(id){
    axios.delete('http://localhost:3000/bookLib/'+id).then((response)=>{
      this.refreshBook();
    });
  }

  refreshBook(){
    axios.get('http://localhost:3000/bookLib').then((response) =>{
      this.setState({
        books:response.data
      })
    });
  }

  render(){
    let books=this.state.books.map((book) => {
      const bid=book.id;
      return(

        <tr key={book.id}>
            <td>{book.id}</td>
            <td>{book.title}</td>
            <td>{book.author}</td>
            <td>
            <Link to= {'/'+bid}>
                <Button color="success" size="sm" className="mr-2">View Details</Button>
            </Link>
            <Button color="danger" size="sm" onClick={this.delBook.bind(this,book.id)}>Delete</Button>
            </td>
        </tr>
      )
    });
    return (
      <div className="MainPage container">
        <h1 className="mt-5">Accolite University Library</h1>
        <Button className="my-3" color="primary" onClick={this.toggleNewBookModal.bind(this)}>Add Book</Button>
        <hr></hr>
        <Modal isOpen={this.state.newBookModal} toggle={this.toggleNewBookModal.bind(this)}>
          <ModalHeader toggle={this.toggleNewBookModal.bind(this)}>Add A New Book</ModalHeader>
          <ModalBody>
            <FormGroup>
              <Label for="title">Book Title</Label>
              <Input id="title" placeholder="Enter title of book" value={this.state.newBookData.title} onChange={(e)=> {
                let {newBookData}=this.state;
                newBookData.title=e.target.value;
                this.setState({newBookData});
              }} />
            </FormGroup>
            <FormGroup>
              <Label for="author">Author Name</Label>
              <Input id="author" placeholder="Enter name of author" value={this.state.newBookData.author} onChange={(e)=> {
                let {newBookData}=this.state;
                newBookData.author=e.target.value;
                this.setState({newBookData});
              }} />
            </FormGroup>
            <FormGroup>
              <Label for="description">Book description</Label>
              <Input type="textarea" id="description" placeholder="Give a description of book" value={this.state.newBookData.description} onChange={(e)=>{
                let {newBookData}=this.state;
                newBookData.description=e.target.value;
                this.setState({newBookData});
              }} />
            </FormGroup>
          </ModalBody>
          <ModalFooter>
            <Button color="primary" onClick={this.addBook.bind(this)}>Add Book</Button>{' '}
            <Button color="secondary" onClick={this.toggleNewBookModal.bind(this)}>Cancel</Button>
          </ModalFooter>
        </Modal>
        <Table>
          <thead>
            <tr>
              <th>ID</th>
              <th>Title</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {books}
          </tbody>
        </Table>
      </div>
    );
  }
}

export default MainPage;

import React, {useState, useEffect} from 'react';
import Table from './Table';
import Form from './Form';
import axios from 'axios';

function MyApp() {
  const [characters, setCharacters] = useState([]);

  useEffect(() => {
    fetchAll().then( result => {
       if (result)
          setCharacters(result);
     });
  }, [] );
  //___________________________________________________________________________________

  async function fetchAll(){
    try {
        const response = await axios.get('http://localhost:5000/users');
        if (response.status === 200){
          console.log('Get All Users Successfull!');
          return response.data.users_list
        }
    }
    catch (error){
        console.log(error); 
        return false;         
    }
  }
  //___________________________________________________________________________________

  async function makePostCall(person) {
    try {
      const response = await axios.post('http://localhost:5000/users', person);
      return response;
    }
    catch (error){
      console.log(error);
      return false;
    }
  }

  function updateList(person) { 
    makePostCall(person).then( result => {
    if (result && result.status === 201){
      console.log(result);
      setCharacters([...characters, result.data.users_list.at(-1)] );
    }

    });
  }
  //___________________________________________________________________________________

  async function makeDeleteCall(id) {
    try {
      const response = await axios.delete('http://localhost:5000/users/' + id);
      return response; 
    }
    catch (error){
      console.log(error);
      return false
    }
  }

  function deleteById(index) {
    makeDeleteCall(characters[index].id).then( response => {
      if (response.status === 204) {
          console.log("Sucessfully Deleted!")
          let updatedCharacters = characters.filter((character, i) => {
            return i !== index
          });
          setCharacters(updatedCharacters);

        }
      });
  }
  //___________________________________________________________________________________


    return (
        <div className="container">
            <Table characterData={characters} removeCharacter={deleteById} />
            <Form handleSubmit={updateList} />
        </div>
      );

}

export default MyApp;
const express = require('express');
const app = express();
const port = 5000;

const cors = require('cors');
app.use(cors());
app.use(express.json());
//___________________________________________________________________________________

let users = { 
   users_list :
   [
      { 
         id : 'xyz789',
         name : 'Charlie',
         job: 'Janitor',
      },
      {
         id : 'abc123', 
         name: 'Mac',
         job: 'Bouncer',
      },
      {
         id : 'ppp222', 
         name: 'Mac',
         job: 'Professor',
      }, 
      {
         id: 'yat999', 
         name: 'Dee',
         job: 'Aspring actress',
      },
      {
         id: 'zap555', 
         name: 'Dennis',
         job: 'Bartender',
      }
   ]
}
//___________________________________________________________________________________

app.listen(port, () => {
   console.log(`Example app listening at http://localhost:${port}`);
});

app.get('/', (req, res) => {
    res.send('Hello World!');
});

app.get('/users', (req, res) => {
   res.send(users).status(200).end();
});
//___________________________________________________________________________________

app.get('/users', (req, res) => {
   const name = req.query.name;
   const job = req.query.job;
   if (name != undefined){
       let result = findUserByName(name, job);
       result = {users_list: result};
       res.send(result);
   } else{
       res.send(users);
   }
});

const findUserByName = (name, job) => { 
   if (job == undefined){
   return users['users_list'].filter( (user) => user['name'] === name);
   } else{
      return users['users_list'].filter( (user) => user['name'] === name && user['job'] === job); 
   }
}
//___________________________________________________________________________________

app.get('/users/:id', (req, res) => {
   const id = req.params['id']; //or req.params.id
   let result = findUserById(id);
   if (result === undefined || result.length == 0)
       res.status(404).send('Resource not found.');
   else {
       result = {users_list: result};
       res.send(result);
   }
});

function findUserById(id) {
   return users['users_list'].find( (user) => user['id'] === id); // or line below
   // return users['users_list'].filter( (user) => user['id'] === id);
}
//___________________________________________________________________________________

app.post('/users', (req, res) => {
   const userToAdd = req.body;
   
   var randomId = Math.random().toString(16).slice(2, 8)
   userToAdd.id = randomId

   addUser(userToAdd);
   res.status(201).send(users).end();
});

function addUser(user){
   users['users_list'].push(user);
}
//___________________________________________________________________________________

app.delete('/users/:id', (req, res) => {
   const id = req.params['id']; //or req.params.id
   newUserList = deleteUser(id);
   res.status(204).send();
});

function deleteUser(id){
   const newUsersList = users['users_list'].filter( (user) => user['id'] !== id);
   users.users_list = newUsersList;
   return users.users_list;
}
//___________________________________________________________________________________

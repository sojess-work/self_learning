//importing express module
const Joi = require('joi');

const express =  require('express'); // this returns a function
const app = express(); //this express() returns a object 

app.use(express.json());



const courses = [
    {id:1, name:'course1'},
    {id:2, name:'course2'},
    {id:3, name:'course3'},
]

//GET METHOD
app.get('/', (req,res) => {
    res.send('Hello world!!!');
})

app.get('/api/courses', (req,res) => {
    res.send(courses);
})

app.get('/api/courses/:id', (req,res) => {
   const course = courses.find((c) => c.id === parseInt(req.params.id)) ;
   if(!course) res.status(404).send(`The course with the ID: ${req.params.id} not found`);
   res.send(course);
})

//POST METHOD

app.post('/api/courses', (req,res) => {
    const course = {
        id: courses.length+1,
        name:req.body.name
    };
    courses.push(course);
    res.send(course);
})


//PUT

app.put('/api/courses/:id', (req,res) =>{
    //check if the code exists
    const course = courses.find((c) => c.id === parseInt(req.params.id));
    if(!course) res.status(404).send(`The course with the ID: ${req.params.id} not found`);

    //validate
    const result = validateCourse(req.body);
    if(result.error) {
        res.status(400).send(result.error.details[0].message);
        return;
    }
    //update course

    course.name = req.body.name;
    res.send(course);

})

//LISTENING
const port = process.env.PORT || 3000;
app.listen(port, () => {
    console.log(`Listening on port ${port}`);
})

function validateCourse(course){
    const schema = {
        name: Joi.string().min(3).required()
    }
    return  Joi.validate(course, schema);
}
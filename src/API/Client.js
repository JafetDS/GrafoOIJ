const express = require('express');
const app = express();
const port = 3000;
const morgan = require('morgan');

app.set('port', process.env.PORT || port);
app.set('json spaces', 2);

app.use(morgan('dev'));
app.use(express.urlencoded({extended: false}));
app.use(express.json());

app.use(require('./routes/index'));

app.listen(port, () => {
    console.log('Server on port 3000');
});
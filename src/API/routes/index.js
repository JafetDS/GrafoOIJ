const { Router } = require('express');
const router = Router();

router.get('/test', (req, res) => {
   const data = {
       "name": "Gabriel",
       "website": "gabo.com"
   };
   res.json(data)
});

module.exports = router;
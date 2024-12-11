const http = require("http");
const fs = require("fs");
const url = require("url");

const myServer = http.createServer((req, res) => {
  // console.log("New reeq received");
  // console.log(req);
  if(req.url === "/favicon.ico")
      return res.end();
  const log = `${Date.now()}: ${req.url} New Request received\n`;
  const myUrl = url.parse(req.url, true);
  console.log(myUrl);
  
  fs.appendFile("log.txt", log, (err, data) => {
    res.end("hello from server");
  });

  switch(myUrl.pathname){
    case"/":
      res.end("Homepage");
      break;

    case "/about":
      const username = myUrl.query.myname;
      // res.end("I'm Pranjal");
      res.end(`Hi, ${username}`);
      break;
    
      default:
        res.end("404 not Found");
  }
});

myServer.listen(8800, () => console.log("Sserver started"));

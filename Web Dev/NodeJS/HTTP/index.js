const http = require("http");
const fs = require("fs");

const myServer = http.createServer((req, res) => {
  // console.log("New reeq received");
  // console.log(req);
  const log = `${Date.now()}: ${req.url} New Request received\n`;
  fs.appendFile("log.txt", log, (err, data) => {
    res.end("hello from server");
  });
});

myServer.listen(8800, () => console.log("Sserver started"));

const http = require("http");

const myServer = http.createServer((req, res) => {
  console.log("New reeq received");
  res.end("hello from server");
});

myServer.listen(8800, () => console.log("Sserver started"));

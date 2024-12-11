// server.js
const express = require("express");
const bodyParser = require("body-parser");
const cors = require("cors");

const app = express();
app.use(bodyParser.json());
app.use(cors());

let data = []; // To store user data

// Endpoint to handle POST request
app.post("/submit", (req, res) => {
  const userData = req.body;
  data.push(userData);
  res.status(200).json({ message: "Data received", data });
});

// Endpoint to fetch data
app.get("/data", (req, res) => {
  res.status(200).json(data);
});

app.listen(5000, () => console.log("Server running on http://localhost:5000"));

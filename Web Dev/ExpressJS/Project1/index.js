const express = require("express");
const user = require("./MOCK_DATA.json");
const app = express();

const port = 8000;


                                    //routes
//         1. GET /users - List all the users
app.get("/api/users", (req, res) => {
    return res.json(users);
})

app.get("/users", (req, res) => {
    const html =`
    <ul>
        ${user.map((user) => `<li>${user.first_name}</li>`).join("")}
    </ul>`;
    res.send(html);
    
});

app.listen(port, () => console.log("Server is running !!"));
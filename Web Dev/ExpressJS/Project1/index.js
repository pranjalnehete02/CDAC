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


// GET /users/1 - Get the user with id 1
// GET /users/2 - Get the user with id 2
//Dynamic Path parameters
//GET/api/users:id   --->dynamic


app.get("/api/users/:id", (req, res) => {
    const id = Number(req.params.id);
    const user = usersData.find((user) => user.id === id);
    if (!user) {
        return res.status(404).json({ message: "User  not found" });
    }
    return res.json(user);
});

app.listen(port, () => console.log("Server is running !!"));
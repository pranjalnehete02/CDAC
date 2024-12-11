import React, { useState } from "react";

const App = () => {
  const [loginData, setLoginData] = useState({ username: "", password: "" });
  const [registerData, setRegisterData] = useState({
    username: "",
    password: "",
    email: "",
  });

  const handleLoginChange = (e) => {
    const { name, value } = e.target;
    setLoginData((prev) => ({ ...prev, [name]: value }));
  };

  const handleRegisterChange = (e) => {
    const { name, value } = e.target;
    setRegisterData((prev) => ({ ...prev, [name]: value }));
  };

  const handleLoginSubmit = (e) => {
    e.preventDefault();
    console.log("Login Data:", loginData);
  };

  const handleRegisterSubmit = (e) => {
    e.preventDefault();
    console.log("Registration Data:", registerData);
  };

  return (
    <div style={styles.container}>
      <h1>Authentication</h1>
      <div style={styles.formContainer}>
        {/* Login Section */}
        <form onSubmit={handleLoginSubmit} style={styles.column}>
          <h2>Login</h2>
          <input
            type="text"
            name="username"
            placeholder="Username"
            value={loginData.username}
            onChange={handleLoginChange}
            required
            style={styles.input}
          />
          <input
            type="password"
            name="password"
            placeholder="Password"
            value={loginData.password}
            onChange={handleLoginChange}
            required
            style={styles.input}
          />
          <button type="submit" style={styles.button}>
            Login
          </button>
        </form>

        {/* Registration Section */}
        <form onSubmit={handleRegisterSubmit} style={styles.column}>
          <h2>Register</h2>
          <input
            type="text"
            name="username"
            placeholder="Username"
            value={registerData.username}
            onChange={handleRegisterChange}
            required
            style={styles.input}
          />
          <input
            type="password"
            name="password"
            placeholder="Password"
            value={registerData.password}
            onChange={handleRegisterChange}
            required
            style={styles.input}
          />
          <input
            type="email"
            name="email"
            placeholder="Email"
            value={registerData.email}
            onChange={handleRegisterChange}
            required
            style={styles.input}
          />
          <button type="submit" style={styles.button}>
            Submit
          </button>
        </form>
      </div>
    </div>
  );
};

const styles = {
  container: { textAlign: "center", marginTop: "50px", color: "#fff" },
  formContainer: {
    display: "flex",
    justifyContent: "space-between",
    padding: "20px",
    margin: "20px auto",
    maxWidth: "800px",
    gap: "20px",
  },
  column: {
    flex: 1,
    textAlign: "left",
    backgroundColor: "#fff", // Black background for both login and registration blocks
    color: "#000", // White text for contrast
    padding: "70px",
    borderRadius: "8px",
    boxShadow: "0 4px 8px rgba(0, 0, 0, 0.2)",
  },
  input: {
    display: "block",
    margin: "10px 0",
    padding: "10px",
    width: "100%",
    borderRadius: "4px",
    border: "1px solid #ccc",
    outline: "none",
  },
  button: {
    padding: "10px 20px",
    cursor: "pointer",
    backgroundColor: "#fff",
    color: "#000",
    border: "none",
    borderRadius: "4px",
    fontWeight: "bold",
  },
};

export default App;

import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./style.css";

const Login = () => {
  const [credentials, setCredentials] = useState({ username: "", password: "" });
  const navigate = useNavigate();

  const handleChange = (e) => {
    setCredentials({ ...credentials, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (credentials.username === "cdac" && credentials.password === "cdac") {
      navigate("/home"); // Redirect to the home page
    } else {
      alert("Invalid Username or Password!");
    }
  };

  return (
    <div id="webcrumbs">
      <div
        className="w-[100vw] h-[100vh] min-w-screen min-h-screen rounded-lg bg-gradient-to-t from-purple-300 via-purple-50 to-indigo-200 p-6 shadow-lg relative text-neutral-950 min-h-screen"
      >
        <div className="absolute top-[-100vh] left-1/2 transform -translate-x-1/2 bg-gradient-to-r from-purple-500 to-indigo-500 w-[100px] h-[10px] rounded-full flex items-center justify-center shadow-md">
          <span className="material-symbols-outlined text-white text-4xl">
            photo_camera
          </span>
        </div>
        <form onSubmit={handleSubmit} className="mt-20 flex flex-col gap-4 top-margin:mt-20 py-0	" >
          <h2 className="text-center text-2xl font-title text-neutral-800 font-extrabold tracking-wide">
            Welcome to the Drive !!
          </h2>
          <div className="flex items-center gap-2 border-2 border-white/40 backdrop-blur-md bg-white/30 hover:shadow-md transition-all rounded-full px-4 py-3 duration-300">
            <span className="material-symbols-outlined text-indigo-500">
              person
            </span>
            <input
              type="text"
              name="username"
              placeholder="Username"
              value={credentials.username}
              onChange={handleChange}
              className="flex-1 bg-transparent border-none text-neutral-800 placeholder-neutral-600 text-lg font-medium focus:outline-none focus:ring-0"
            />
          </div>
          <div className="flex items-center gap-2 border-2 border-white/40 backdrop-blur-md bg-white/30 hover:shadow-md transition-all rounded-full px-4 py-3 duration-300">
            <span className="material-symbols-outlined text-indigo-500">
              lock
            </span>
            <input
              type="password"
              name="password"
              placeholder="Password"
              value={credentials.password}
              onChange={handleChange}
              className="flex-1 bg-transparent border-none text-neutral-800 placeholder-neutral-600 text-lg font-medium focus:outline-none focus:ring-0"
            />
          </div>
          <button
            type="submit"
            className="w-full px-6 py-3 mt-6 bg-white/30 backdrop-blur-md border-2 border-white/40 text-neutral-800 rounded-full hover:bg-gradient-to-r hover:from-indigo-500 hover:to-purple-600 transition-shadow shadow-md hover:shadow-lg text-lg font-extrabold"
          >
            LOGIN
          </button>
        </form>
      </div>
    </div>
  );
};

export default Login;

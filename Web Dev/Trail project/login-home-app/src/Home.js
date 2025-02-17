import React from "react";
import { useNavigate } from "react-router-dom";
import "./home.css";

const Home = () => {
  const navigate = useNavigate();

  const handleLogout = () => {
    navigate("/"); // Redirect to the login page
  };

  return (
    <div id="webcrumbs">
      <div
        className="flex bg-gradient-to-t from-purple-300 via-purple-50 to-indigo-200 min-h-[600px] p-6 shadow-lg rounded-lg text-neutral-950 relative transition-transform duration-300"
        style={{ boxShadow: "0px 10px 30px rgba(0, 0, 0, 0.1)" }}
      >
        <div className="flex flex-col bg-white/40 backdrop-blur-md rounded-lg shadow-md p-4 w-[250px]">
          <div className="mb-8 flex items-center gap-2">
            <img
              src="https://tools-api.webcrumbs.org/image-placeholder/40/40/abstract/5"
              alt="Logo"
              className="w-[40px] h-[40px] object-contain"
            />
            <h1 className="font-title text-xl font-bold text-neutral-800">
              Drive
            </h1>
          </div>
          <ul className="space-y-6">
            <li className="flex items-center gap-4 text-neutral-800 shadow-md p-2 rounded-md hover:bg-indigo-100 transition">
              <span className="material-symbols-outlined text-indigo-500">
                home
              </span>
              Home
            </li>
            <li className="flex items-center gap-4 text-neutral-800 shadow-md p-2 rounded-md hover:bg-indigo-100 transition">
              <span className="material-symbols-outlined text-indigo-500">
                add
              </span>
              New
            </li>
            <li className="flex items-center gap-4 text-neutral-800 shadow-md p-2 rounded-md hover:bg-indigo-100 transition">
              <span className="material-symbols-outlined text-indigo-500">
                folder
              </span>
              My Drive
            </li>
            <li className="flex items-center gap-4 text-neutral-800 shadow-md p-2 rounded-md hover:bg-indigo-100 transition">
              <span className="material-symbols-outlined text-indigo-500">
                people
              </span>
              Shared
            </li>
          </ul>
        </div>
        <div className="flex-1 pl-8">
          <h1 className="text-4xl font-title font-bold text-center text-neutral-800 mb-6">
            Welcome to Drive
          </h1>
          <div className="flex-1 bg-white rounded-full p-2 shadow mb-6">
            <div className="flex gap-4 flex-row">
              <span className="material-symbols-outlined text-neutral-500 pl-4">
                search
              </span>
              <input
                type="text"
                placeholder="Search in Drive"
                className="w-full bg-transparent outline-none pl-4"
              />
            </div>
          </div>
          <div className="flex items-center gap-4 mb-6">
            <div className="flex gap-2">
              <button className="flex items-center gap-2 px-4 py-2 bg-indigo-200 rounded-md text-neutral-800 shadow hover:bg-indigo-300">
                <span className="material-symbols-outlined text-indigo-500">
                  category
                </span>
                Type
              </button>
              <button className="flex items-center gap-2 px-4 py-2 bg-indigo-200 rounded-md text-neutral-800 shadow hover:bg-indigo-300">
                <span className="material-symbols-outlined text-indigo-500">
                  person
                </span>
                People
              </button>
              <button className="flex items-center gap-2 px-4 py-2 bg-indigo-200 rounded-md text-neutral-800 shadow hover:bg-indigo-300">
                <span className="material-symbols-outlined text-indigo-500">
                  event
                </span>
                Modified
              </button>
              <button className="flex items-center gap-2 px-4 py-2 bg-indigo-200 rounded-md text-neutral-800 shadow hover:bg-indigo-300">
                <span className="material-symbols-outlined text-indigo-500">
                  location_on
                </span>
                Location
              </button>
            </div>
          </div>
          <div className="mt-6">
            <h2 className="font-medium text-lg mb-2">Suggested folders</h2>
            <div className="grid grid-cols-3 gap-4">
              <div className="p-4 bg-white rounded-md shadow-md flex justify-between items-center text-neutral-800 transform transition-transform duration-300 hover:scale-105">
                <span className="material-symbols-outlined text-indigo-500">
                  folder
                </span>
                <div>
                  <p className="font-medium">Student Folder</p>
                  <p className="text-sm text-neutral-500">In Shared with me</p>
                </div>
                <span className="material-symbols-outlined text-neutral-500">
                  more_vert
                </span>
              </div>
              <div className="p-4 bg-white rounded-md shadow-md flex justify-between items-center text-neutral-800 transform transition-transform duration-300 hover:scale-105">
                <span className="material-symbols-outlined text-indigo-500">
                  folder
                </span>
                <div>
                  <p className="font-medium">Folder 2</p>
                  <p className="text-sm text-neutral-500">
                    In Shared with CDAC
                  </p>
                </div>
                <span className="material-symbols-outlined text-neutral-500">
                  more_vert
                </span>
              </div>
            </div>
          </div>
          <div className="mt-6">
            <h2 className="font-medium text-lg mb-2">Suggested files</h2>
            <div className="grid grid-cols-3 gap-4">
              <div className="p-4 bg-white rounded-md shadow-md flex justify-between items-center text-neutral-800">
                <span className="material-symbols-outlined text-indigo-500">
                  insert_drive_file
                </span>
                <div>
                  <p className="font-medium">File 1</p>
                  <p className="text-sm text-neutral-500">In Shared with me</p>
                </div>
                <span className="material-symbols-outlined text-neutral-500">
                  more_vert
                </span>
              </div>
              <div className="p-4 bg-white rounded-md shadow-md flex justify-between items-center text-neutral-800">
                <span className="material-symbols-outlined text-indigo-500">
                  insert_drive_file
                </span>
                <div>
                  <p className="font-medium">File 2</p>
                  <p className="text-sm text-neutral-500">In Shared with me</p>
                </div>
                <span className="material-symbols-outlined text-neutral-500">
                  more_vert
                </span>
              </div>
              <div className="p-4 bg-white rounded-md shadow-md flex justify-between items-center text-neutral-800">
                <div>
                  <p className="font-medium">File 3</p>
                  <p className="text-sm text-neutral-500">In Shared with me</p>
                </div>
                <span className="material-symbols-outlined text-neutral-500">
                  more_vert
                </span>
              </div>
            </div>
          </div>
          <div className="mt-6 bg-white/40 backdrop-blur-md p-4 rounded-lg shadow-md">
            <h2 className="font-medium text-lg mb-4 text-neutral-800">
              Drive Space
            </h2>
            <div className="relative h-[16px] bg-neutral-200 rounded-full">
              <div
                className="absolute top-0 left-0 h-full bg-indigo-500 rounded-full"
                style={{ width: "70%" }}
              ></div>
            </div>
            <p className="text-sm text-neutral-500 mt-2 text-right">
              70% used - 7GB of 10GB
            </p>
          </div>
          
		  <button
            onClick={handleLogout}
            className="w-full px-6 py-3 mt-8 bg-white/40 backdrop-blur-md border-2 border-white/40 text-neutral-800 rounded-full hover:bg-indigo-500 hover:scale-105 hover:shadow-lg transition duration-300 text-lg font-bold"
          >
            LogOut
          </button>
        </div>
      </div>
    </div>
  );
};

export default Home;

import React from "react";


/* Don't forget to download the CSS file too 
OR remove the following line if you're already using Tailwind */

import "./style.css";

export const MyPlugin = () => {
  return (
    <div id="webcrumbs"> 
                	<div  className="w-[400px] rounded-lg bg-gradient-to-t from-purple-300 via-purple-50 to-indigo-200 p-6 shadow-lg relative text-neutral-950"
    	  style={{
    	    minHeight: "500px",
    	    boxShadow: "0px 10px 30px rgba(0, 0, 0, 0.1)",
    	  }}
    	>
    	  <div className="absolute top-[-50px] left-1/2 transform -translate-x-1/2 bg-gradient-to-r from-purple-500 to-indigo-500 w-[100px] h-[100px] rounded-full flex items-center justify-center shadow-md">
    	    <span className="material-symbols-outlined text-white text-4xl">photo_camera</span>
    	  </div>
    	  <div className="mt-20 flex flex-col gap-4">
    	    <h2 className="text-center text-2xl font-title text-neutral-800 font-extrabold tracking-wide">
    	      Welcome to the Drive !!
    	    </h2>
    	    <div className="flex items-center gap-2 border-2 border-white/40 backdrop-blur-md bg-white/30 hover:shadow-md transition-all rounded-full px-4 py-3 duration-300">
    	      <span className="material-symbols-outlined text-indigo-500">person</span>
    	      <input
    	        type="text"
    	        placeholder="Username"
    	        className="flex-1 bg-transparent border-none text-neutral-800 placeholder-neutral-600 text-lg font-medium focus:outline-none focus:ring-0"
    	      />
    	    </div>
    	    <div className="flex items-center gap-2 border-2 border-white/40 backdrop-blur-md bg-white/30 hover:shadow-md transition-all rounded-full px-4 py-3 duration-300 shadow-sm">
    	      <span className="material-symbols-outlined text-indigo-500">lock</span>
    	      <input
    	        type="password"
    	        placeholder="Password"
    	        className="flex-1 bg-transparent border-none text-neutral-800 placeholder-neutral-600 text-lg font-medium focus:outline-none focus:ring-0"
    	      />
    	    </div>
    	    <div className="flex items-center justify-between text-sm text-neutral-600 mt-2 font-medium">
    	      <label className="flex items-center gap-2 cursor-pointer">
    	        <input
    	          type="checkbox"
    	          className="form-checkbox h-[16px] w-[16px] text-indigo-500 focus:ring-indigo-200"
    	        />
    	        <span className="text-neutral-700">Remember me</span>
    	      </label>
    	      <a
    	        href="#"
    	        className="hover:underline text-indigo-500 hover:text-indigo-700 transition font-bold"
    	      >
    	        Forgot Password?
    	      </a>
    	    </div>
    	    <button className="w-full px-6 py-3 mt-6 bg-white/30 backdrop-blur-md border-2 border-white/40 text-neutral-800 rounded-full hover:bg-gradient-to-r hover:from-indigo-500 hover:to-purple-600 transition-shadow shadow-md hover:shadow-lg text-lg font-extrabold">
    	      LOGIN
    	    </button>
    	    <button className="w-full px-6 py-3 mt-2 bg-gradient-to-r from-indigo-500 to-purple-600 text-white rounded-full hover:opacity-90 transition-shadow shadow-md hover:shadow-lg text-lg font-extrabold">
    	      SIGNUP
    	    </button>
    	  </div>
    	</div> 
                </div>
  )
}


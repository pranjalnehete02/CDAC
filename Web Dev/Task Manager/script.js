const taskContainer = document.getElementsByClassName("task_container");

const saveChanges = () => {
  const taskData = {
    id: `${Date.now()}`, // This will provide a unique ID for every task we create
    imageUrl: document.getElementById("Image_url").value,
    taskTitle: document.getElementById("Task_title").value,
    taskType: document.getElementById("Task_type").value,
    taskDescription: document.getElementById("Task_description").value,
  };

  console.log(taskData);
};

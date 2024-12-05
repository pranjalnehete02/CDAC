const taskContainer = document.querySelector(".task_container");
console.log(taskContainer);

const newCard = ({
  id,
  imageUrl,
  taskTitle,
  taskDescription,
  taskType,
}) => `<div class="col-md-6 col-lg-4">
<div class="card text-center">
  <div class="card-header d-flex justify-content-end gap-2">
    <button type="button" class="btn btn-outline-success">
      <i class="fa-solid fa-pen"></i>
    </button>
    <button type="button" class="btn btn-outline-danger">
      <i class="fa-solid fa-trash"></i>
    </button>
  </div>
  <img
    src="https://shorturl.at/dZs1I"
    class="card-img-top"
    alt="..."
  />
  <div class="card-body">
    <h5 class="card-title">Special title treatment</h5>
    <p class="card-text">
      With supporting text below as a natural lead-in to additional
      content.
    </p>
    <span class="badge text-bg-primary">Amazing</span>
  </div>
  <div class="card-footer text-body-secondary">
    <button type="button" class="btn btn-outline-primary float-end">
      Open Task
    </button>
  </div>
</div>`;

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

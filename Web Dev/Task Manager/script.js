const taskContainer = document.querySelector(".task_container");
console.log(taskContainer);

//browser global storage
const globalStore = [];

const newCard = ({
  id,
  imageUrl,
  taskTitle,
  taskDescription,
  taskType,
}) => `<div class="col-md-6 col-lg-4" id=${id}>
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
    src= ${imageUrl}
    class="card-img-top"
    alt="..."
  />
  <div class="card-body">
    <h5 class="card-title">${taskTitle}</h5>
    <p class="card-text">
      ${taskDescription}
    </p>
    <span class="badge text-bg-primary">${taskType}</span>
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

  const createNewCard = newCard(taskData);

  taskContainer.insertAdjacentHTML("beforeend", createNewCard);
  globalStore.push(taskData);
  console.log(globalStore);
};

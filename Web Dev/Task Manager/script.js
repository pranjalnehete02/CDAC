const taskContainer = document.querySelector(".task_container");
console.log(taskContainer);

//browser global storage
let globalStore = [];

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
    <button type="button" id=${id} class="btn btn-outline-danger" onclick="deleteCard.apply(this, arguments)">
      <i class="fa-solid fa-trash" id=${id} onclick="deleteCard.apply(this, arguments)"></i>
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

const localInitialTasks = () => {
  //access the local Storage
  const getInitialData = localStorage.getItem("taskItems");
  if (!getInitialData) return;

  // convert the stringified object to object
  const { cards } = JSON.parse(getInitialData);

  //map around the array to generate the HTML cards and inject it into the DOM
  cards.map((cardObject) => {
    const createNewCard = newCard(cardObject);
    taskContainer.insertAdjacentHTML("beforeend", createNewCard);
    globalStore.push(cardObject);
  });
};

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

  //API for saving the global data to the browser
  localStorage.setItem(
    "taskItems",
    JSON.stringify({
      cards: globalStore,
    })
  );
};

const deleteCard = (event) => {
  //id
  event = window.event;
  const tagName = event.target.tagName;
  const targetID = event.target.id;
  //search the globalStorage,
  //remove which is matches

  const newUpadate = globalStore.filter(
    (cardObject) => cardObject.id !== targetID
  );

  globalStore = newUpadate;
  localStorage.setItem("taskItems", JSON.stringify({ cards: globalStore }));
  // access DOM to remove cards

  if (tagName === "BUTTON") {
    return event.target.parentNode.parentNode.parentNode.parentNode.removeChild(
      event.target.parentNode.parentNode.parentNode
    );
  }
};

//task container
return event.target.parentNode.parentNode.parentNode.parentNode.parentNode.removeChild(
  event.target.parentNode.parentNode.parentNode.parentNode
);

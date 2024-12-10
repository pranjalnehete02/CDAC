const button = document.getElementById("search-button");
const input = document.getElementById("city-input");

//http://api.weatherapi.com/v1/current.json?key=021386292ced422591c01723241012&q=London&aqi=yes

async function getData(cityName) {
  const data = await fetch(
    `http://api.weatherapi.com/v1/current.json?key=021386292ced422591c01723241012&q=${cityName}&aqi=yes`
  );

  //   console.log(await data.json());
  //   getData();
  //   console.log(getData);
  return await data.json();
}

button.addEventListener("click", async () => {
  const value = input.value;
  const result = await getData(value);
  console.log(result);
});

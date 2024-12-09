// Sample Chart Data using Chart.js
document.addEventListener("DOMContentLoaded", () => {
  const niftyChart = document.getElementById("niftyChart").getContext("2d");
  const sensexChart = document.getElementById("sensexChart").getContext("2d");

  // NIFTY Chart
  new Chart(niftyChart, {
    type: "line",
    data: {
      labels: ["10:00", "10:15", "10:30", "10:45", "11:00"],
      datasets: [
        {
          label: "NIFTY 50",
          data: [18050, 18100, 18125, 18075, 18150],
          borderColor: "#007bff",
          borderWidth: 2,
          fill: false,
        },
      ],
    },
    options: {
      responsive: true,
      plugins: {
        legend: { display: true },
      },
    },
  });

  // SENSEX Chart
  new Chart(sensexChart, {
    type: "line",
    data: {
      labels: ["10:00", "10:15", "10:30", "10:45", "11:00"],
      datasets: [
        {
          label: "SENSEX",
          data: [60800, 60850, 60750, 60825, 60900],
          borderColor: "#28a745",
          borderWidth: 2,
          fill: false,
        },
      ],
    },
    options: {
      responsive: true,
      plugins: {
        legend: { display: true },
      },
    },
  });
});

import Chart from 'react-apexcharts';
const DonutChart = () => {
   
    const mockData = {
        series: [477, 499, 444, 220, 473],
        labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    }
    
    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart
            options={{ ...options, labels: mockData.labels}}
            series={mockData.series}
            type="donut"
            height="240"
        />
    );
  }
  
  export default DonutChart;
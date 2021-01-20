const bigSliders = document.getElementsByClassName("bigSlider");
const displays = document.getElementsByClassName("valueDisplay");


for (let i = 0; i < bigSliders.length; i++) {
    bigSliders[i].oninput = () => {
        let display = "";

        if (bigSliders[i].value == 0) {
            display = "No exertion at all";
        } else if (bigSliders[i].value == 1) {
            display = "Extremely light";
        } else if (bigSliders[i].value == 3) {
            display = "Very light";
        } else if (bigSliders[i].value == 5) {
            display = "Light";
        } else if (bigSliders[i].value == 1) {
            display = "Extremely light";
        } else if (bigSliders[i].value == 7) {
            display = "Somewhat hard";
        } else if (bigSliders[i].value == 9) {
            display = "Hard";
        } else if (bigSliders[i].value == 11) {
            display = "Very hard";
        } else if (bigSliders[i].value == 13) {
            display = "Extremely hard";
        } else if (bigSliders[i].value == 15) {
            display = "Maximal exertion";
        }

        let percent = (bigSliders[i].value / 15) * 100;


        bigSliders[i].style.background = "linear-gradient(90deg, rgb(0,0,255)" + percent + "%, rgb(214,214,214)" + percent + "%)";
        console.log(bigSliders[i].value);
        displays[i].innerHTML = bigSliders[i].value + " " + display;
    }
    ;
}



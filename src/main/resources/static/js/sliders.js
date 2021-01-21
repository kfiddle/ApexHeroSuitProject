const bigSliders = document.getElementsByClassName("big");
const smallSliders = document.getElementsByClassName("small");
const bigDisplays = document.getElementsByClassName("bigValueDisplay");
const smallDisplays = document.getElementsByClassName("smallValueDisplay");
const bodyPartSliders = document.getElementsByClassName("bodySlider");
const bodyAnswers = document.getElementsByClassName("bodyPainDisplay");


for (let i = 0; i < bigSliders.length; i++) {
    bigSliders[i].oninput = () => {
        let display = "";

        if (bigSliders[i].value == 1) {
            display = "No exertion at all";
        } else if (bigSliders[i].value == 2) {
            display = "Extremely light";
        } else if (bigSliders[i].value == 4) {
            display = "Very light";
        } else if (bigSliders[i].value == 6) {
            display = "Light";
        } else if (bigSliders[i].value == 8) {
            display = "Somewhat hard";
        } else if (bigSliders[i].value == 10) {
            display = "Hard";
        } else if (bigSliders[i].value == 12) {
            display = "Very hard";
        } else if (bigSliders[i].value == 14) {
            display = "Extremely hard";
        } else if (bigSliders[i].value == 15) {
            display = "Maximal exertion";
        }

        let percent = (bigSliders[i].value / 15) * 100;


        bigSliders[i].style.background = "linear-gradient(90deg, rgb(0,0,255)" + percent + "%, rgb(214,214,214)" + percent + "%)";
        console.log(bigSliders[i].value);
        bigDisplays[i].innerHTML = bigSliders[i].value + " " + display;
    }
    ;
}

for (let i = 0; i < smallSliders.length; i++) {
    smallSliders[i].oninput = () => {
        let display = "";

        if (smallSliders[i].value == 0) {
            display = "Extremely easy";
        } else if (smallSliders[i].value == 2) {
            display = "Easy";
        } else if (smallSliders[i].value == 4) {
            display = "Somewhat easy";
        } else if (smallSliders[i].value == 6) {
            display = "Somewhat hard";
        } else if (smallSliders[i].value == 8) {
            display = "Hard";
        } else if (smallSliders[i].value == 10) {
            display = "Extremely hard";
        }
        let percent = (smallSliders[i].value / 10) * 100;


        smallSliders[i].style.background = "linear-gradient(90deg, rgb(0,0,255)" + percent + "%, rgb(214,214,214)" + percent + "%)";
        console.log(smallSliders[i].value);
        smallDisplays[i].innerHTML = smallSliders[i].value + " " + display;
    };
}

for (let i = 0; i < bodyPartSliders.length; i++) {
    bodyPartSliders[i].oninput = () => {
        let display = "";
        let percent = (bodyPartSliders[i].value / 10) * 100;

        bodyPartSliders[i].style.background = "linear-gradient(90deg, rgb(194,24,7)" + percent + "%, rgb(214,214,214)" + percent + "%)";
        console.log(bodyPartSliders[i].value);
        bodyAnswers[i].innerHTML = bodyPartSliders[i].value + " " + display;
    };
}




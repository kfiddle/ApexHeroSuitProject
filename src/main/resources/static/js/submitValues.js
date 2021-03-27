

let currentTime = new Date();

const firstName = document.getElementById("firstName");
const lastName = document.getElementById("lastName");
const company = document.getElementById("companyHeading");
const email = document.getElementById("email");
const gender = document.getElementById("gender");
const yearsAtCurrentJob = document.getElementById("yearsAtCurrentJob");
const weight = document.getElementById("weight");
const waist = document.getElementById("waist");
const feet = document.getElementById("feet");
const inches = document.getElementById("inches");

const lowerBackPain = document.getElementById("lowerBackPain");
const overallEffort = document.getElementById("overallEffort");
const typicalLiftEffort = document.getElementById("typicalLiftEffort");
const heaviestLiftEffort = document.getElementById("heaviestLiftEffort");

const rightShoulder = document.getElementById('rightShoulder');
const leftShoulder = document.getElementById("leftShoulder");
const upperBack = document.getElementById("upperBack");
const lowerBack = document.getElementById("lowerBack");
const rightHip = document.getElementById("rightHip");
const leftHip = document.getElementById("leftHip");
const rightThigh = document.getElementById("rightThigh");
const leftThigh = document.getElementById("leftThigh");
const rightKnee = document.getElementById("rightKnee");
const leftKnee = document.getElementById("leftKnee");


function subWithFetch() {

    let totalInches = parseInt(feet.value)*12 + parseInt(inches.value);

    let formDataForSpreadSheet = {
        "Timestamp": currentTime,
        "firstName": firstName.value,
        "lastName": lastName.value,

        "company": company.innerText,

        "email": email.value,
        "gender": gender.value,
        "yearsAtCurrentJob": yearsAtCurrentJob.value,
        "weight": weight.value,
        "waist": waist.value,
        "height": totalInches,
        "lowerBackPain": lowerBackPain.value,
        "overallEffort": overallEffort.value,
        "typicalLeftEffort": typicalLiftEffort.value,
        "heaviestLiftEffort": heaviestLiftEffort.value,

        "rightShoulder": rightShoulder.value,
        "leftShoulder": leftShoulder.value,
        "upperBack": upperBack.value,
        "lowerBack": lowerBack.value,
        "rightHip": rightHip.value,
        "leftHip": leftHip.value,
        "rightThigh": rightThigh.value,
        "leftThigh": leftThigh.value,
        "rightKnee": rightKnee.value,
        "leftKnee": leftKnee.value
    }


    fetch('https://api.apispreadsheets.com/data/6917/', {
        method: "POST",
        body: JSON.stringify({"data": formDataForSpreadSheet}),
    }).then(res => {
        if (res.status === 201) {
            alert("Thank you for submitting.")
        } else {
            alert("Thank you for submitting.")
        }
    })

    let formDataForJavaEmployee = {





    }








}









// function SubForm() {
//     $.ajax({
//         url: 'https://api.apispreadsheets.com/data/6917/',
//
//         type: 'POST',
//         data: $("#myForm").serializeArray(),
//
//         success: function () {
//             alert("Thank You for Submitting!)")
//         },
//         error: function () {
//             alert("There was an error :(")
//         }
//     });
//     console.log(slider1.value)
// }

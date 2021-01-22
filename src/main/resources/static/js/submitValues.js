const slider1 = document.getElementById("slider1");
//
// const firstName = document.getElementById("firstName");
// const lastName = document.getElementById("lastName");


// let formData = {
//
//     firstName: firstName.value,
//     lastName: lastName.value,
//     overallEffort: slider1.value
//
// }


function SubForm() {
    $.ajax({
        url: 'https://api.apispreadsheets.com/data/6917/',

        type: 'post',
        data: $("#myForm").serializeArray(),

        // data: JSON.stringify(formData),
        // dataType: 'json',

        success: function () {
            alert("Thank You for Submitting!)")
        },
        error: function () {
            alert("There was an error :(")
        }
    });
    console.log(slider1.value)

}

//
// data: JSON.stringify(formData),
//     dataType: 'json'

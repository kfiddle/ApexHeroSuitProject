const companyNameElement = document.getElementById("companyName");


const submitNewEmployees = () => {

    let firstNames = Array.from(document.querySelectorAll(".firstName"));
    let lastNames = Array.from(document.querySelectorAll(".lastName"));
    let companyName = companyNameElement.innerText;


    for (let i = 0; i < firstNames.length; i++) {
        let formData = {
            firstName: firstNames[i].value,
            lastName: lastNames[i].value,
            companyName: companyName
        }

        console.log(firstNames[i].value);
        // console.log(companyName);

        $.ajax({
                type: "POST",
                contentType: "application/json",
                url: "/add-employees",
                data: JSON.stringify(formData),
                dataType: 'json'
            }
        )
    }
    window.location = "/all-employees";
}

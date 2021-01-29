const submitNewEmployees = () => {

    let firstNames = Array.from(document.querySelectorAll(".firstName"));
    let lastNames = Array.from(document.querySelectorAll(".lastName"));

    for (let i = 0; i < firstNames.length; i++) {
        let formData = {
            firstName: firstNames[i].value,
            lastName: lastNames[i].value
        }

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

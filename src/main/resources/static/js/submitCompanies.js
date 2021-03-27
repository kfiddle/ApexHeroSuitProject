const submitCompanies = () => {
    let companies = Array.from(document.querySelectorAll(".input"));

    for (let i = 0; i < companies.length; i++) {
        let formData = {
            name:companies[i].value
        }

        $.ajax({
                type: "POST",
                contentType: "application/json",
                url: "/add-companies",
                data: JSON.stringify(formData),
                dataType: 'json'
            }
        )
    }
    window.location = "/companies";

}

// ({"data": formData}

// fetch('/add-companies', {
//     method: "POST",
//     headers: {
//         'Content-Type': 'application/json',
//     },
//     body: JSON.stringify(testData),
// });
// window.location = "/companies";





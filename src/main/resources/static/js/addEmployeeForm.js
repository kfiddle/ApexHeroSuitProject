const employeeDiv = document.getElementById("employeeFormDiv");

addEmployeeForm();


function addEmployeeForm() {

    let newEmployee = document.createElement("div");
    let firstName = document.createElement("input");
    let lastName = document.createElement("input");
    let inputs = [firstName, lastName];

    newEmployee.setAttribute("class", "firstLine");

    firstName.setAttribute("placeholder", "First Name");
    lastName.setAttribute("placeholder", "Last Name");

    firstName.setAttribute("class", "firstName");
    lastName.setAttribute("class", "lastName");

    inputs.forEach(input => {
        input.setAttribute("type", "text");
        input.style.width = "400px";
        input.style.height = "40px";
        newEmployee.appendChild(input);
    })
    employeeDiv.appendChild(newEmployee);
}

const submitEmployees = () => {



}

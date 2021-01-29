const entryFormDiv = document.getElementById("companyEntryFormDiv");

entryFormDiv.style.display = "grid";

const addForm = (placeholder) => {

    let newInput = document.createElement('input');
    newInput.setAttribute("placeholder", placeholder);
    newInput.setAttribute("type", "text");
    newInput.setAttribute("class", "input");
    newInput.style.width = "400px";
    newInput.style.height = "40px";
    entryFormDiv.appendChild(newInput);
}




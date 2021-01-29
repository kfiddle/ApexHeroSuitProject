const entryFormDiv = document.getElementById("companyEntryFormDiv");

entryFormDiv.style.display = "grid";

const addForm = (placeholder) => {

    let newInput = document.createElement('input');
    newInput.setAttribute("placeholder", placeholder);
    newInput.setAttribute("type", "text");
    newInput.setAttribute("class", "companyInput");
    newInput.style.width = "400px";
    newInput.style.height = "40px";
    entryFormDiv.appendChild(newInput);





    // <input type="text" id="companyNameInput" style="width:300px;height:40px" placeholder="company name" name="companyName">




    }

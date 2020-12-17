window.addEventListener("load", function () {

    function displayLecturer(lecturer) {
        let mainContent = document.querySelector("#content");

        for (let lecturers of lecturer) {
            mainContent.innerHTML += `
                <h2>${lecturers.name}</h2>
                <p>${lecturers.staffId}</p>
                <p>Papers taught:</p>`;
            let ul = document.createElement("ul");

            for (let i = 0; i < lecturers.papers.length; i++) {
                let li = document.createElement("li");
                li.innerText = lecturers.papers[i];

                ul.appendChild(li);
                //     text += "<li>" + lecturer.papers + "</li>";
                //
                // <
            }
            mainContent.appendChild(ul);
        }
    }

        async function loadLectures(){
            let responseObject = await fetch("./lecturersendpoint");
            let lecturers = await responseObject.json();

            displayLecturer(lecturers);
        }





        loadLectures();




    });


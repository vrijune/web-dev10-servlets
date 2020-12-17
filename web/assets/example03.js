window.addEventListener("load",function(){

    function displayMovies(movies){
        let mainContent = document.querySelector("#content");

        for (let movie of movies){
            mainContent.innerHTML += `
                <h2>${movie.name}</h2>
                <ul>
                    <li>Year: ${movie.year}</li>
                    <li>Length: ${movie.lengthInMinutes}</li>
                    <li>Director: ${movie.director}</li>
                </ul>
            `;
        }

    }

    async function loadMovies(){
        let responseObject = await fetch("./moviesendpoint");
        let movies = await responseObject.json();

        displayMovies(movies);
    }

    loadMovies();

});
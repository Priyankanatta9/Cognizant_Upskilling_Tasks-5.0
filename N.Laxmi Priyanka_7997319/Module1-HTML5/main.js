console.log("Welcome to the Community Portal");

window.onload = function(){

    alert("Page Fully Loaded");

    loadSavedEvent();
}

const portalName = "Local Community Event Portal";
const launchYear = 2026;

let totalSeats = 50;

console.log(`${portalName} Started in ${launchYear}`);

totalSeats++;

let events = [

    {
        name:"Music Festival",
        date:"2026-07-20",
        seats:10,
        category:"Music"
    },

    {
        name:"Hackathon",
        date:"2026-08-15",
        seats:15,
        category:"Coding"
    },

    {
        name:"Sports Meetup",
        date:"2026-09-01",
        seats:0,
        category:"Sports"
    }

];

events.forEach(function(event){

    if(event.seats > 0){

        console.log(
            `${event.name} Seats Available`
        );

    }

    else{

        console.log(
            `${event.name} Full`
        );
    }

});

function addEvent(event){

    events.push(event);

    console.log(events);
}

function filterEventsByCategory(category){

    return events.filter(
        event => event.category === category
    );
}

function registrationCounter(){

    let count = 0;

    return function(){

        count++;

        return count;
    };
}

let counter = registrationCounter();

console.log(counter());
console.log(counter());

class Event{

    constructor(name,date,seats){

        this.name = name;
        this.date = date;
        this.seats = seats;
    }
}

Event.prototype.checkAvailability = function(){

    if(this.seats > 0){

        return "Seats Available";
    }

    else{

        return "House Full";
    }
};

let newEvent = new Event(
    "Art Expo",
    "2026-09-15",
    20
);

console.log(
    newEvent.checkAvailability()
);

console.log(
    Object.entries(newEvent)
);

let musicEvents = events.filter(
    e => e.category === "Music"
);

console.log(musicEvents);

let formattedEvents = events.map(
    e => `Workshop : ${e.name}`
);

console.log(formattedEvents);

function validatePhone(){

    let phone =
        document.getElementById("phone").value;

    if(phone.length != 10){

        alert("Phone number must contain 10 digits");
    }
}

function showFee(){

    let fee =
        document.getElementById("eventType").value;

    document.getElementById("feeDisplay").innerHTML =
        "Event Fee : ₹" + fee;

    localStorage.setItem(
        "selectedEvent",
        fee
    );
}

function countCharacters(){

    let text =
        document.getElementById("feedback").value;

    document.getElementById("charCount").innerHTML =
        text.length;
}

function showConfirmation(){

    document.getElementById("outputMessage").value =
        "Registration Submitted Successfully";
}

function enlargeImage(img){

    img.style.width = "350px";
    img.style.height = "250px";
}

function videoReady(){

    alert("Video ready to play");
}

window.onbeforeunload = function(){

    return "Are you sure you want to leave?";
};

function loadSavedEvent(){

    let savedEvent =
        localStorage.getItem("selectedEvent");

    if(savedEvent){

        document.getElementById("eventType").value =
            savedEvent;
    }
}

function clearPreferences(){

    localStorage.clear();

    sessionStorage.clear();

    alert("Preferences Cleared");
}

function findLocation(){

    if(navigator.geolocation){

        navigator.geolocation.getCurrentPosition(
            showPosition,
            showError,
            {
                enableHighAccuracy:true,
                timeout:5000
            }
        );
    }

    else{

        alert("Geolocation not supported");
    }
}

function showPosition(position){

    document.getElementById("location").innerHTML =

        "Latitude : " +
        position.coords.latitude +

        "<br>Longitude : " +

        position.coords.longitude;
}

function showError(){

    alert("Location access denied or timeout");
}

let form =
    document.querySelector("#eventForm");

form.addEventListener(
    "submit",
    function(e){

        e.preventDefault();

        let name =
            document.getElementById("name").value;

        let email =
            form.elements[1].value;

        let selectedEvent =
            document.getElementById("eventType").value;

        console.log(name);
        console.log(email);
        console.log(selectedEvent);

        if(name === "" || email === ""){

            alert("Fill all fields");

            return;
        }

        submitRegistration({
            name,
            email,
            selectedEvent
        });
    }
);

function submitRegistration(data){

    console.log("Submitting Data");

    setTimeout(() => {

        fetch(
            "https://jsonplaceholder.typicode.com/posts",
            {
                method:"POST",

                headers:{
                    "Content-Type":"application/json"
                },

                body:JSON.stringify(data)
            }
        )

        .then(response => response.json())

        .then(result => {

            console.log(result);

            alert("Registration Successful");
        })

        .catch(error => {

            console.log("Submission Failed");
        });

    },2000);
}

async function loadEvents(){

    try{

        let response = await fetch(
            "https://jsonplaceholder.typicode.com/users"
        );

        let data = await response.json();

        console.log(data);

    }

    catch(error){

        console.log("Error Loading Events");
    }
}

loadEvents();

function showEventDetails(
    {
        name,
        date,
        seats
    } = {}
){

    console.log(
        `${name} ${date} ${seats}`
    );
}

showEventDetails(events[0]);

let clonedEvents = [...events];

console.log(clonedEvents);

document.getElementById("name").onkeyup =
function(){

    let text =
        this.value.toLowerCase();

    let searched =
        events.filter(event =>

            event.name
            .toLowerCase()
            .includes(text)
        );

    console.log(searched);
};

console.log(
    "React and Vue help create reusable UI components."
);
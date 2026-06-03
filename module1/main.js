// =====================================
// Exercise 1 - JavaScript Basics
// =====================================

console.log("Welcome to Community Portal");

window.addEventListener("load", () => {
    console.log("Page Loaded Successfully");
});

// =====================================
// Exercise 2 - Data Types and Operators
// =====================================

const eventName = "Community Music Festival";
const eventDate = "2026-06-15";
let seats = 100;

console.log(`${eventName} on ${eventDate}`);

// =====================================
// Exercise 3 - Registration Form
// =====================================

function showRegistration() {
    document.getElementById("outputMsg").value =
        "Registration Successful";

    seats--;
    console.log("Remaining Seats:", seats);
}

// =====================================
// Exercise 4 - Functions
// =====================================

function addEvent(name) {
    console.log("New Event Added:", name);
}

function registerUser(name) {
    console.log("Registered User:", name);
}

// =====================================
// Exercise 5 - Objects and Classes
// =====================================

class Event {
    constructor(name, date, seats) {
        this.name = name;
        this.date = date;
        this.seats = seats;
    }

    checkAvailability() {
        return this.seats > 0;
    }
}

const musicEvent = new Event("Music Festival", "2026-06-15", 50);
console.log(musicEvent.checkAvailability());

// =====================================
// Exercise 6 - Arrays
// =====================================

const events = [
    "Music Festival",
    "Sports Day",
    "Workshop"
];

events.push("Food Festival");

const filteredEvents = events.filter(event =>
    event.includes("Music")
);

console.log(filteredEvents);

// =====================================
// Exercise 7 - Phone Validation
// =====================================

function validatePhone() {
    let phone = document.getElementById("phone").value;

    if (phone.length !== 10) {
        alert("Invalid Phone Number");
    }
}

// =====================================
// Exercise 8 - Event Fee
// =====================================

function showFee() {
    let fee = document.getElementById("eventFee").value;
    document.getElementById("feeDisplay").innerHTML =
        "Event Fee: ₹" + fee;
}

// =====================================
// Exercise 9 - Feedback
// =====================================

function submitFeedback() {
    alert("Feedback Submitted Successfully");
}

// =====================================
// Exercise 10 - Character Counter
// =====================================

function countCharacters() {
    let count = document.getElementById("feedback").value.length;
    document.getElementById("charCount").innerHTML = count;
}

// =====================================
// Exercise 11 - Image Handling
// =====================================

function enlargeImage(img) {
    img.style.width = "400px";
}

// =====================================
// Exercise 12 - Video Events
// =====================================

function videoReady() {
    document.getElementById("videoStatus").innerHTML =
        "Video Ready To Play";
}

// =====================================
// Exercise 13 - Local Storage
// =====================================

function savePreference() {
    let event = document.getElementById("preferredEvent").value;
    localStorage.setItem("preferredEvent", event);
    alert("Preference Saved");
}

function loadPreference() {
    let saved = localStorage.getItem("preferredEvent");
    if (saved) {
        document.getElementById("preferredEvent").value = saved;
    }
}

function clearPreference() {
    localStorage.clear();
    sessionStorage.clear();
    alert("Preferences Cleared");
}

// =====================================
// Exercise 14 - Geolocation
// =====================================

function findLocation() {
    navigator.geolocation.getCurrentPosition(
        function (position) {
            document.getElementById("location").innerHTML =
                "Latitude : " + position.coords.latitude +
                "<br>Longitude : " + position.coords.longitude;
        },
        function (error) {
            alert(error.message);
        },
        {
            enableHighAccuracy: true,
            timeout: 5000
        }
    );
}

// =====================================
// Debugging Example
// =====================================

let count = 0;

function increment() {
    count++;
    console.log("Current Count:", count);
    document.getElementById("debugResult").innerHTML = count;
}

// =====================================
// Before Unload Warning
// =====================================

window.onbeforeunload = function () {
    return "You have unsaved changes.";
};

document.addEventListener("DOMContentLoaded", () => {
    let currentIndex = 0;
    const slides = document.querySelectorAll('.slide');

    // Debugging: Check if slides are correctly selected
    console.log("Slides detected:", slides);

    if (slides.length === 0) {
        console.error("No slides found! Ensure the '.slide' class is applied correctly.");
        return; // Stop execution if no slides are found
    }

    function showNextSlide() {
        // Debugging: Log current index
        console.log("Current index before:", currentIndex);

        // Hide the current slide
        slides[currentIndex].classList.remove('active');

        // Move to the next slide
        currentIndex = (currentIndex + 1) % slides.length;

        // Show the next slide
        slides[currentIndex].classList.add('active');

        // Debugging: Log current index after
        console.log("Current index after:", currentIndex);
    }

    // Change slide every 5 seconds
    setInterval(showNextSlide, 5000);
});

//Scroll
document.addEventListener("DOMContentLoaded", () => {
    const scrollContainer = document.getElementById('scroll-container');
    const scrollLeftButton = document.getElementById('scroll-left');
    const scrollRightButton = document.getElementById('scroll-right');

    if (!scrollContainer || !scrollLeftButton || !scrollRightButton) {
        console.error("Elements not found. Check your IDs.");
        return;
    }

    scrollLeftButton.addEventListener('click', () => {
        scrollContainer.scrollLeft -= 200;
        console.log("Scrolled left");
    });

    scrollRightButton.addEventListener('click', () => {
        scrollContainer.scrollLeft += 200;
        console.log("Scrolled right");
    });
});

//scroll destination
document.addEventListener("DOMContentLoaded", () => {
    const scrollContainer = document.getElementById('scroll-container-destination');
    const scrollLeftButton = document.getElementById('scroll-left-destination');
    const scrollRightButton = document.getElementById('scroll-right-destination');

    if (!scrollContainer || !scrollLeftButton || !scrollRightButton) {
        console.error("Elements not found. Check your IDs.");
        return;
    }

    scrollLeftButton.addEventListener('click', () => {
        scrollContainer.scrollLeft -= 200;
        console.log("Scrolled left");
    });

    scrollRightButton.addEventListener('click', () => {
        scrollContainer.scrollLeft += 200;
        console.log("Scrolled right");
    });
});

//faq
document.addEventListener("DOMContentLoaded", () => {
    const faqQuestions = document.querySelectorAll('.faq-question');

    faqQuestions.forEach(question => {
        question.addEventListener('click', () => {
            const answer = question.nextElementSibling;

            // Toggle the answer visibility
            if (answer.classList.contains('open')) {
                answer.classList.remove('open');
            } else {
                // Close other open answers
                document.querySelectorAll('.faq-answer.open').forEach(openAnswer => {
                    openAnswer.classList.remove('open');
                });

                // Open the current answer
                answer.classList.add('open');
            }
        });
    });
});


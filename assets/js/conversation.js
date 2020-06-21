const slider = document.getElementById('slider');
const prevSlider = document.getElementById('prev');
const nextSlider = document.getElementById('next');

nextSlider.addEventListener('click', (e) => {
  slider.scrollBy(300, 0);
});

nextSlider.addEventListener('click', (e) => {
  slider.scrollBy(-300, 0);
});

// Exercise 1
// You have to create a variable which is a string containing the text which is a link you are interested in. 

// You have to fetch all the links from a given page which contains this text

// javascript

const textOfInterest = 'Your specific text here'; // Replace this with the text you're interested in
const url = 'https://example.com'; // Replace this with the URL of the webpage you want to scrape

fetch(url)
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.text();
  })
  .then(html => {
    const parser = new DOMParser();
    const doc = parser.parseFromString(html, 'text/html');

    const linksWithText = [];
    const anchorTags = doc.querySelectorAll('a');

    anchorTags.forEach(tag => {
      const linkText = tag.textContent;
      if (linkText.includes(textOfInterest)) {
        linksWithText.push(tag.href);
      }
    });

    // Log the found links
    console.log(`Links containing the text '${textOfInterest}' on the page:`);
    linksWithText.forEach(link => console.log(link));
  })
  .catch(error => {
    console.error('There was a problem with the fetch operation:', error);
  });

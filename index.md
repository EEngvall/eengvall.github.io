## Welcome to Erik Engvall's CS-499 page

<a href="/videos/CS-499.mov" download>Download My Code Review</a>

### **Artifact 1: Software Design and Engineering**

1. **Briefly describe the artifact. What is it? When was it created?**

   The artifact that is being submitted in Milestone 2 is the zoo authentication system from IT-145. This artifact focuses on verifying user input against provided credentials and displaying a given text file based on the role the user is associated with. This artifact was originally created during one of the first terms I participated in here at SNHU and I feel it demonstrates some of the progress I’ve made as a developer throughout this program.

2. **Justify the inclusion of the artifact in your ePortfolio. Why did you select this item? What specific components of the artifact showcase your skills and abilities in software development? How was the artifact improved?**

   I selected this item because it was originally written in Java and at first glance it’s a very basic program to create, however it does demonstrate many of the aspects of OOP and software development in general. I would say that the original artifact doesn’t demonstrate very many of my skills at this point since I’ve gained many new and improved skillsets. I believe that the enhancements I have made to the original artifact go a long way in demonstrating my skills with OOP and code style/structure as a whole.

3. **Did you meet the course objectives you planned to meet with this enhancement in Module One? Do you have any updates to your outcome-coverage plans?**

   I feel that I met the course objectives I set out to with this enhancement. The code I created is more robust and efficient overall and covers more use cases and possible exceptions than the original artifact, however I do feel that it can still be improved upon given enough time and insight.

4. **Reflect on the process of enhancing and/or modifying the artifact. What did you learn as you were creating it and improving it? What challenges did you face?**

   I feel the biggest thing I learned while working on the enhancements for this artifact are that stepping away from a project for a long enough time frame can drastically improve your understanding of the core problems. For example, with this artifact having been originally created over a year ago I can look back on it now with a new perspective and see things that I may have missed or even implemented but did so incorrectly. I also can see where my commenting needs work as some things were unclear to me even as the person that originally wrote the code.

### **Artifact 2: Algorithms and Data Structures**

1. **Briefly describe the artifact. What is it? When was it created?**

   The artifact that is being submitted in Milestone 3 is the zoo authentication system from IT-145. This artifact focuses on verifying user input against provided credentials and displaying a given text file based on the role the user is associated with. This artifact was originally created during one of the first terms I participated in here at SNHU and I feel it demonstrates some of the progress I’ve made as a developer throughout this program. The distinction between this artifact submission and the one from Milestone 2 is that this artifact focuses on the data structures used, in this case the inclusion of a JSON file.

2. **Justify the inclusion of the artifact in your ePortfolio. Why did you select this item? What specific components of the artifact showcase your skills and abilities in software development? How was the artifact improved?**

   I selected this item because it originally used a simple text file to hold all the user information including the username and password. This type of data structure is a poor choice for storing such information as it is easily accessible to an outside source looking to gain access. Using a simple text file to store user information is also beholden to how it is formatted as far as parsing the string for the information you’re looking for. When switching to a JSON object its much easier to read, much easier to determine what items you would like to access and much easier to maintain formatting when adding or editing individual user information.

3. **Did you meet the course objectives you planned to meet with this enhancement in Module One? Do you have any updates to your outcome-coverage plans?**

   I feel that I met the course objectives I set out to with this enhancement. I feel that converting the project from using a simple text file to using a JSON structured file is the first step in addressing potential design or structural flaws related to security within the program. Although the JSON file itself does not contain any functional code the inclusion of it does lend credence to solving logical problems involving data structures and algorithms.

4. **Reflect on the process of enhancing and/or modifying the artifact. What did you learn as you were creating it and improving it? What challenges did you face?**

   I feel the biggest challenge to overcome with this enhancement was altering the hash function. Although it wasn’t too difficult, I feel that it provided the most benefit and so I wanted to make sure I implemented it correctly. Converting the text file to a JSON file and altering the code to perform CRUD operations on that JSON file instead wasn’t too difficult. I feel that improving the hash function and utilizing the inclusion of a salt parameter make immense increases as far as file security.

### **Artifact 3: Databases**

1. **Briefly describe the artifact. What is it? When was it created?**

   The artifact that is being submitted in Milestone 4 is the database used in CS-340 for the AAC Animal shelter. This artifact is a database used to query animal records for animals processed by the animal shelter. It was created last term and I would consider it one of the more difficult projects I have worked on mostly due to the nature of the full stack approach and having to work with multiple languages and frameworks/libraries. I have included both the files for the project, as well as a link to the live web app. The current iteration of the project only allows for reading from the database. The goal is to have the final iteration capable of both adding and removing entries into the database.
   Erik Engvall CS-499 Artifact 3

2. **Justify the inclusion of the artifact in your ePortfolio. Why did you select this item? What specific components of the artifact showcase your skills and abilities in software development? How was the artifact improved?**

   I selected this item because it was originally written using Python and a few of its frameworks/libraries. I wanted to take the same basic concept of a database and rework it to use a different full stack approach, in this case the MERN stack. I chose this stack because I have read that it is one of the more popular and most often used stacks in production today and adding the ability to work with it to my skill set may be seen as a great benefit by potential future employers. I improved on the artifact by more on the back end than on the front end. By this I mean that I set up Node and deployed the app on Heroku so that it is a live web app and can be accessed by anyone. This improves upon the original artifact that was only run on a local host. As for the front end, I wouldn’t say I improved upon it much, however I did make changes that made the app a little more straight forward as a database search tool.

3. **Did you meet the course objectives you planned to meet with this enhancement in Module One? Do you have any updates to your outcome-coverage plans?**

   I met the course outcomes I set out to when it comes to implementing a database as well as solving problems involving storing, manipulating, and accessing data within that database. I do believe that my overall plan has changed since I originally presented it in Module 1 or 2. My original goal was to mainly utilize React and create multiple components, however getting the database set up and running on the node server and getting the mongoDB commands to function properly took me much longer than I originally anticipated. I still plan to attempt the original goal but may need to settle for a slightly refined and toned-down outcome in order to be successful.

4. **Reflect on the process of enhancing and/or modifying the artifact. What did you learn as you were creating it and improving it? What challenges did you face?**

   I would say the main thing I learned during the process of enhancing this artifact is how to properly set up and deploy an app on a web server. I had previously done so using AWS Amplify which was kind of like deploying an app using training wheels as it took many of the steps and did them behind the scenes for you. Heroku still handles many steps but does require more work than the process I had used before. One of the challenges I faced was getting the dropdown selector to properly pass it’s value back to the database query function, but this seemed to be a simple syntax error that took me a while to find. The biggest challenge I faced that I still have not properly resolved is iterating through an object passed to my front end with EJS. I was able to work around this by iterating through the object and pushing its individual attributes to an array, then passing that array to my front end and iterating through it to create my table. This takes many more lines of code than I know is necessary and I’m sure it uses much more memory than is needed but I wanted to make sure I could get the app working before I started working on increasing efficiency or line counts.

## Welcome to Erik Engvall's CS-499 page


### **Professional Self Assessment**

<p>   A portfolio by definition is a sample of an artist’s work, used to showcase and highlight their abilities. An ePortfolio is the same thing but for software developers and software engineers. Although I may not use paints or charcoals to create art, the code I write is an artform in and of itself. By creating this portfolio my goal is to demonstrate the skills I have creating, enhancing, and deploying software which is my art medium. The enhancements made to previous projects will showcase the progress I’ve made throughout the Computer Science program. You will be able to see the way I accomplished goals during my first few terms as I came to understand just how to use the tools I had at my disposal. You will also see where I’ve ended up and how I was able to go back and further enhance and refactor these projects implementing what I’ve learned to not only make them better, but also easier to understand and expand upon in the future.</p>
<p>   Throughout my experience at SNHU I’ve worked with a wide variety of both instructors and other students, collaborating and discussing both current and future endeavors. Being able to work with such a wide variety of peers has allowed me to better understand not only differing viewpoints but be open to other solutions to the same problems I’ve faced. By opening myself up to other opinions and viewpoints I’ve made myself stronger not only as a developer but also as an overall employee. I’m able to not let my own opinion cloud my judgment and instead look to others to see where I may be faltering.</p>
During my coursework I was also brought onto a project with my current employer to help deploy a new customer facing web app. We collaborated with Oracle as they were the provider of the base software we would be using. By working with a large company such as Oracle I was able to see how a team works on a day-to-day basis and the workflow associated with such a large project. I was able to use not only my coursework from throughout the SNHU CS program, but my experience working on a real-life team to help me create this ePortfolio and highlight what makes me a good candidate for employment.
<p>   The projects I’ve included in the ePortfolio include a user authentication system that was originally created during IT-145. I utilized this project to help establish my understanding of not only data structures and algorithms but my ability to take a project originally created in one language and recreate it using an entirely different language. Doing so I was able to design and evaluate computing solutions that solve a given problem using algorithmic principles and computer science practices, all while managing the trade-offs involved in design choices. By restructuring the hash function I originally used and adding additional features such as a password “salt” I showcased a security mindset that anticipates adversarial exploits in software architecture and designs to expose potential vulnerabilities, mitigate design flaws, and ensure privacy and enhanced security of data and resources.</p>
<p>   The second project I chose to showcase was the animal shelter database used in CS-340. This database was originally created to help a fictional animal shelter visualize the animals they had within their shelters as well as the various attributes associated with those animals. I utilized the same animal data and instead of using the original Python and Python web frameworks, created a full stack web app using the MERN stack. I hosted the final project using the Heroku PaaS so that a live version is available to demonstrate. This project enhancement allowed me to demonstrate my ability to use well-founded and innovative techniques, skills, and tools for the purpose of implementing computer solutions that deliver value and accomplish industry-specific goals.</p>

### **Video Code Review**

The below code review shows that I have the ability to use interaction to create code-reviews, as well as the ability to understand code reviews both individually and within a team environment. The code review also demonstrates my ability to provide contextual in-code comments that are eaisly readable and understandable and allow others to not only understand my thought process but also follow the logical flow and order of operations present within the code.The code review demonstrates my ability to design, develop, and deliver professional-quality oral, written, and visual communications that are coherent, technically sound, and appropriately adapted to specific audiences and contexts.

<a href="/videos/CS-499.mov" download>Download My Code Review</a>



### **Artifact 1: Software Design and Engineering**

<a href="https://github.com/EEngvall/Python-Auth-System">Github Repo - Artifacts 1&2</a>

<a href="/Python-Auth-System-master.zip" download>Download Artifact</a>


1. **Briefly describe the artifact. What is it? When was it created?**

   The artifact that is being submitted in Milestone 2 is the zoo authentication system from IT-145. This artifact focuses on verifying user input against provided credentials and displaying a given text file based on the role the user is associated with. This artifact was originally created during one of the first terms I participated in here at SNHU and I feel it demonstrates some of the progress I’ve made as a developer throughout this program.

2. **Justify the inclusion of the artifact in your ePortfolio. Why did you select this item? What specific components of the artifact showcase your skills and abilities in software development? How was the artifact improved?**

   I selected this item because it was originally written in Java and at first glance it’s a very basic program to create, however it does demonstrate many of the aspects of OOP and software development in general. I would say that the original artifact doesn’t demonstrate very many of my skills at this point since I’ve gained many new and improved skillsets. I believe that the enhancements I have made to the original artifact go a long way in demonstrating my skills with OOP and code style/structure as a whole.

3. **Did you meet the course objectives you planned to meet with this enhancement in Module One? Do you have any updates to your outcome-coverage plans?**

   I feel that I met the course objectives I set out to with this enhancement. The code I created is more robust and efficient overall and covers more use cases and possible exceptions than the original artifact, however I do feel that it can still be improved upon given enough time and insight.

4. **Reflect on the process of enhancing and/or modifying the artifact. What did you learn as you were creating it and improving it? What challenges did you face?**

   I feel the biggest thing I learned while working on the enhancements for this artifact are that stepping away from a project for a long enough time frame can drastically improve your understanding of the core problems. For example, with this artifact having been originally created over a year ago I can look back on it now with a new perspective and see things that I may have missed or even implemented but did so incorrectly. I also can see where my commenting needs work as some things were unclear to me even as the person that originally wrote the code.  A good example of this is the UserInfo class from the original project basically only being used for getters and setters of some basic information instead of housing other methods or functions appropriate to the class. This artifact helps to demonstrate my ability to use well-founded and innovative techniques, skills, and tools in computing practices for the purpose of implementing computer solutions that deliver value and accomplish industry-specific goals.

   ```java
      public class UserInfo {
      
      String userRole = "";
      String userCredentialStr = "";
      
      //Sets user role for object user1
      public void setUserRole(String role){
         userRole = role;
      }
      
      //Retrieves user role from main method.
      public String getUserRole(){
         return userRole;    
      }
      //Fills credential string from credetial file.
      public void setUserCredentialStr(String credential){
         userCredentialStr = credential;
      }
      //Retrieves credential string.
      public String getUserCredentialStr(){
         return userCredentialStr;
      }
      
   }
   ```

   Where as the UserInfo class in the enhanced Python project now has many additional functions that allow for more manipulation of data as well as better use of the principles of OOP. 

   ```python

   from pprint import pprint
   import json
   import hashlib
   from os.path import exists


   class userInfo:
      userRole = ""
      userCredentialStr = ""
      hashedPassword = ""
      salt = "x455L0"
      isExistingUser = False

      def __init__(self, userName, userPassword, credentialFile):
         self.userName = userName
         self.userPassword = userPassword
         self.credentialFile = credentialFile
         # Apply MD5 hash to user input for password value.
         result = hashlib.md5((self.userPassword + self.salt).encode())
         self.hashedPassword = result.hexdigest()

      def getUserName(self):
         return self.userName

      def getUserPassword(self):
         return self.userPassword

      def getUserRole(self):
         return self.userRole

      def setUserRole(self, role):
         self.userRole = role

      def setUserCredentialStr(self, credentialStr):
         self.userCredentialStr = credentialStr

      # Validates uername and password against JSON contents
      def validateUser(self):
         userValidated = False
         with open(self.credentialFile, 'r') as dataFile:
               data = json.load(dataFile)
               # Iterate through the JSON file searching for the matching Key:Values
               for key in data["credentials"]:
                  if self.userName == key["username"]:
                     # print(self.hashedPassword)
                     if self.hashedPassword == key["passwordHash"]:
                           userValidated = True
                           self.userRole = key["role"]
                     else:
                           print("Incorrect Password")
         return userValidated

      # Cross checks existing usernames in the JSON file to prevent duplicate usernames from being added.
      def checkUsernameAvailability(self):
         userNameAvailable = True
         with open(self.credentialFile, 'r') as dataFile:
               data = json.load(dataFile)
               # Iterate through the JSON file searching for the matching Key:Values
               for key in data["credentials"]:
                  if self.userName == key["username"]:
                     userNameAvailable = False

         return userNameAvailable

      # Creates a new user based on input collected and appends the JSON file with these values.
      def createNewUser(self):
         new_data = {"username": self.userName, "password": self.userPassword,
                     "role": self.userRole, "passwordHash": self.hashedPassword}

         if self.checkUsernameAvailability():
               with open(self.credentialFile, 'r+') as file:
                  # First we load existing data into a dict.
                  file_data = json.load(file)
                  # Join new_data with file_data inside emp_details
                  file_data["credentials"].append(new_data)
                  # Sets file's current position at offset.
                  file.seek(0)
                  # convert back to json.
                  json.dump(file_data, file, indent=4)
                  print("You've successfully registered a new account!")
                  self.isExistingUser = True
         else:
               print("Username already exists")
               self.isExistingUser = False
         return self.isExistingUser

      # Prints contents of user role file to screen
      def displayRoleFile(self):
         if exists(self.userRole + ".txt"):
               print()
               with open(self.userRole + ".txt", "r") as file:
                  for line in file:
                     print(line)
               print()
         else:
               print("No role file exists for selected role")

   ```

### **Artifact 2: Algorithms and Data Structures**

<a href="https://github.com/EEngvall/Python-Auth-System">Github Repo - Artifacts 1&2</a>

<a href="/Python-Auth-System-master.zip" download>Download Artifact</a>



1. **Briefly describe the artifact. What is it? When was it created?**

   The artifact that is being submitted in Milestone 3 is the zoo authentication system from IT-145. This artifact focuses on verifying user input against provided credentials and displaying a given text file based on the role the user is associated with. This artifact was originally created during one of the first terms I participated in here at SNHU and I feel it demonstrates some of the progress I’ve made as a developer throughout this program. The distinction between this artifact submission and the one from Milestone 2 is that this artifact focuses on the data structures used, in this case the inclusion of a JSON file.

2. **Justify the inclusion of the artifact in your ePortfolio. Why did you select this item? What specific components of the artifact showcase your skills and abilities in software development? How was the artifact improved?**

   I selected this item because it originally used a simple text file to hold all the user information including the username and password. This type of data structure is a poor choice for storing such information as it is easily accessible to an outside source looking to gain access. Using a simple text file to store user information is also beholden to how it is formatted as far as parsing the string for the information you’re looking for. When switching to a JSON object its much easier to read, much easier to determine what items you would like to access and much easier to maintain formatting when adding or editing individual user information.

3. **Did you meet the course objectives you planned to meet with this enhancement in Module One? Do you have any updates to your outcome-coverage plans?**

   I feel that I met the course objectives I set out to with this enhancement. I feel that converting the project from using a simple text file to using a JSON structured file is the first step in addressing potential design or structural flaws related to security within the program. Although the JSON file itself does not contain any functional code the inclusion of it does lend credence to solving logical problems involving data structures and algorithms.

4. **Reflect on the process of enhancing and/or modifying the artifact. What did you learn as you were creating it and improving it? What challenges did you face?**

   I feel the biggest challenge to overcome with this enhancement was altering the hash function. Although it wasn’t too difficult, I feel that it provided the most benefit and so I wanted to make sure I implemented it correctly. I feel that improving the hash function and utilizing the inclusion of a salt parameter make immense increases as far as file security.  You can see the basics of this function in the userInfo class below. The use of JSON and the hash functionality show both my ability to design and evaluate computing solutions that solve a given problem using algorithmic principles and computer science practices and standards appropriate to its solution, while managing the trade-offs involved in design choices as well as develop a security mindset that anticipates adversarial exploits in software architecture and designs to expose potential vulnerabilities, mitigate design flaws, and ensure privacy and enhanced security of data and resources
   
   ```python
      class userInfo:
         userRole = ""
         userCredentialStr = ""
         hashedPassword = ""
         salt = "x455L0"
         isExistingUser = False

         def __init__(self, userName, userPassword, credentialFile):
            self.userName = userName
            self.userPassword = userPassword
            self.credentialFile = credentialFile
            # Apply MD5 hash to user input for password value.
            result = hashlib.md5((self.userPassword + self.salt).encode())
            self.hashedPassword = result.hexdigest()
   ```
   
    Converting the text file to a JSON file and altering the code to perform CRUD operations on that JSON file instead wasn’t too difficult. 

   Text file that would previously be parsed for credential information
   ```
   griffin.keyes	108de81c31bf9c622f76876b74e9285f	"alphabet soup"	zookeeper
   rosario.dawson	3e34baa4ee2ff767af8c120a496742b5	"animal doctor"	admin
   bernie.gorilla	a584efafa8f9ea7fe5cf18442f32b07b	"secret password"	veterinarian
   donald.monkey	17b1b7d8a706696ed220bc414f729ad3	"M0nk3y business"	zookeeper
   jerome.grizzlybear	3adea92111e6307f8f2aae4721e77900	"grizzly1234"	veterinarian
   bruce.grizzlybear	0d107d09f5bbe40cade3de5c71e9e9b7	"letmein"	admin

   ```

   New JSON formatted file that contains credential information as objects, password strings only included for testing and demonstration purposes.  The final JSON file would only include the hashed password. 

   ```json

      {
      "credentials": [
         {
               "username": "griffin.keyes",
               "password": "alphabet soup",
               "role": "zookeeper",
               "passwordHash": "ff1f9e082f8b6aeeca834dbc33d5fde5"
         },
         {
               "username": "rosario.dawson",
               "password": "animal doctor",
               "role": "admin",
               "passwordHash": "1adb11cbe310efa9e7a9a62f494af654"
         },
         {
               "username": "bernie.gorilla",
               "password": "secret password",
               "role": "veterinarian",
               "passwordHash": "76002f9f4398aa3113d2328aa217fa65"
         },
         {
               "username": "donald.monkey",
               "password": "M0nk3y business",
               "role": "zookeeper",
               "passwordHash": "d6f5bb56dfe4e37c6d94866d7fd74f91"
         },
         {
               "username": "jerome.grizzlybear",
               "password": "grizzly1234",
               "role": "veterinarian",
               "passwordHash": "5bc2045355bfa171dd828cb94acece12"
         },
         {
               "username": "bruce.grizzlybear",
               "password": "letmein",
               "role": "admin",
               "passwordHash": "986d8418d227b255a7666ccd08816548"
         },
         {
               "username": "Max",
               "password": "newpassword1234",
               "role": "veterinarian",
               "passwordHash": "532aecdc16e450ad64ea9ff3716d80e1"
         }
      ]
   }

   ```

   
### **Artifact 3: Databases**

<a href="https://github.com/EEngvall/rescue-app">Github Repo - Artifact 3</a>

<a href="https://glacial-anchorage-77889.herokuapp.com/">Live Version - Artifact 3</a>

<a href="/rescue-app-master.zip" download>Download Artifact</a>




1. **Briefly describe the artifact. What is it? When was it created?**

   The artifact that is being submitted in Milestone 4 is the database used in CS-340 for the AAC Animal shelter. This artifact is a database used to query animal records for animals processed by the animal shelter. It was created last term and I would consider it one of the more difficult projects I have worked on mostly due to the nature of the full stack approach and having to work with multiple languages and frameworks/libraries. I have included both the files for the project, as well as a link to the live web app. The current iteration of the project only allows for reading from the database. The goal is to have the final iteration capable of both adding and removing entries into the database.
   Erik Engvall CS-499 Artifact 3

2. **Justify the inclusion of the artifact in your ePortfolio. Why did you select this item? What specific components of the artifact showcase your skills and abilities in software development? How was the artifact improved?**

   I selected this item because it was originally written using Python and a few of its frameworks/libraries. I wanted to take the same basic concept of a database and rework it to use a different full stack approach, in this case the MERN stack. I chose this stack because I have read that it is one of the more popular and most often used stacks in production today and adding the ability to work with it to my skill set may be seen as a great benefit by potential future employers. I improved on the artifact by more on the back end than on the front end. By this I mean that I set up Node and deployed the app on Heroku so that it is a live web app and can be accessed by anyone. This improves upon the original artifact that was only run on a local host. As for the front end, I wouldn’t say I improved upon it much, however I did make changes that made the app a little more straight forward as a database search tool.

3. **Did you meet the course objectives you planned to meet with this enhancement in Module One? Do you have any updates to your outcome-coverage plans?**

   I met the course outcomes I set out to when it comes to implementing a database as well as solving problems involving storing, manipulating, and accessing data within that database. I do believe that my overall plan has changed since I originally presented it in Module 1 or 2. My original goal was to mainly utilize React and create multiple components, however getting the database set up and running on the node server and getting the mongoDB commands to function properly took me much longer than I originally anticipated. I still plan to attempt the original goal but may need to settle for a slightly refined and toned-down outcome in order to be successful.

4. **Reflect on the process of enhancing and/or modifying the artifact. What did you learn as you were creating it and improving it? What challenges did you face?**

   I would say the main thing I learned during the process of enhancing this artifact is how to properly set up and deploy an app on a web server. I had previously done so using AWS Amplify which was kind of like deploying an app using training wheels as it took many of the steps and did them behind the scenes for you. Heroku still handles many steps but does require more work than the process I had used before. One of the challenges I faced was getting the dropdown selector to properly pass it’s value back to the database query function, but this seemed to be a simple syntax error that took me a while to find. The biggest challenge I faced that I still have not properly resolved is iterating through an object passed to my front end with EJS. I was able to work around this by iterating through the object and pushing its individual attributes to an array, then passing that array to my front end and iterating through it to create my table. This takes many more lines of code than I know is necessary and I’m sure it uses much more memory than is needed but I wanted to make sure I could get the app working before I started working on increasing efficiency or line counts.  You can see this solution so far below. 

   ```javascript

   app.post("/submit", function(req, res){
      var input = req.body.input;
      var filter = req.body.filter;
      var age_upon_outcome = []
      var animal_id = []
      var animal_type = []
      var breed = []
      var color = []
      var date_of_birth =[]
      var name = []
      var outcome_type = []
      var sex_upon_outcome = []
      Animal.find({[filter]:input}, function (err, animals) {
         if (err) {
               //if error print to console
               console.log(err);
         } else {
               //If no error loop through animals and print names to console.
               //This for each loop inserts the animals attributes into the above empty arrays.  I currently do this becuase I'm
               //having a difficult time iterating over the animal objects using EJS and getting them to appear correctly. 
               //This method requires more memory since I'm using individualy arrays so it will need to be refactored at some point to resolve this issue.  
               animals.forEach(function(animal){
                  age_upon_outcome.push(animal.age_upon_outcome);
                  animal_id.push(animal.animal_id);
                  animal_type.push(animal.animal_type);
                  breed.push(animal.breed);
                  color.push(animal.color);
                  date_of_birth.push(animal.date_of_birth);
                  name.push(animal.name);
                  outcome_type.push(animal.outcome_type);
                  sex_upon_outcome.push(animal.sex_upon_outcome);

               })
               console.log(filter, input)
               //Passes the value of each array back to the ejs file for use. 
               res.render("animals", {
                  name: name, 
                  animal_id: animal_id, 
                  animal_type: animal_type, 
                  breed:breed, color:color, 
                  date_of_birth:date_of_birth,
                  name:name,
                  outcome_type:outcome_type,
                  sex_upon_outcome:sex_upon_outcome
               });

         }
      });

    ```

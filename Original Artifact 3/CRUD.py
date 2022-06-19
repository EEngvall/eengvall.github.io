from pymongo import MongoClient
from bson.objectid import ObjectId
#Removed pprint as it was printing the objects for read instead of the cursor.
from pprint import pprint

class AnimalShelter(object):
    """ CRUD operations for Animal collection in MongoDB """

    def __init__(self, userName, userPassword):
        # Initializing the MongoClient. This helps to
        # access the MongoDB databases and collections.
        self.client = MongoClient('mongodb://%s:%s@localhost:43106/AAC' % (userName, userPassword))
        self.database = self.client['AAC']

    # Complete this create method to implement the C in CRUD.
    def create(self, data):
        if data is not None:
            result = self.database.animals.insert_one(data) # data should be dictionary
            if result.inserted_id is not None:
                print(result.inserted_id) #Prints object ID if insert is successful
                return True
        else:
            raise Exception("Nothing to save, because data parameter is empty")
            return False

# Create method to implement the R in CRUD.

    def read(self, data):
        if data is not None:
            return self.database.animals.find_one(data)
        else:
            raise Exception("Nothing to read, because data parameter is empty")
            
    def readAll(self, target):
        # try/except block for testing in the unit tests
        try:
            if target is not None:
                #print(type(target))       # target should be dictionary - confirmed
                read_result = list(self.database.animals.find(target, {"_id": False}))
                #pprint(read_result)   # displays the results in the console
                return read_result
            else:
                #lets the user know there was a problem
                raise Exception("Nothing to search, because the target parameter is empty")
                return False
        except Exception as e:
            print("An exception occurred: ", e)

# Method to implement the U in CRUD.
#I had a difficult time getting the update functon to operate using two dictionaries for the current data and the data needing to be updated, therefore I used strings as input to get the proper functionality. 

    def update(self, updateField, currentData, newData):
        if currentData is not None:
            filterData = {updateField:currentData}
            update = {"$set":{updateField:newData}}
            self.database.animals.update_one(filterData, update)
            pprint(self.database.animals.find_one({updateField:newData}))
            return True
                   
        else:
            raise Exception("Nothing to Update")
            return False
        
    def delete(self, data):
        if data is not None:
            print("File Found and Deleted")
            print(self.database.animals.find_one(data))
            result = self.database.animals.delete_one(data)
            pprint(result)
            return True
        else:
            raise Exception("Nothing to Update")
            return False

                
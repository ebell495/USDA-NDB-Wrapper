# USDA-NDB-Wrapper
A Java library that provides a connection and a wrapper to the [USDA Food Database](https://ndb.nal.usda.gov/ndb/doc/index).

## Library Goals
The goal is to provide a connection to the USDA Food API and return the data from the API requests in an easy-to-manipulate Java object. The objects returned are designed to encapsulate and emulate the API as best as possible.

## Usage
- First, get a data.gov API key from [this link](https://api.data.gov/signup/)
- Next, before any api requests can happen, the connector needs to be initialized.
```Java
USDAConnector.initConnector("API_KEY"); //API_KEY replaced with your key
```
- To get a single food report from the database.
```Java
USDAConnector.getFoodReport("NDBNO"); //The string representation of the unique food id or ndbno
```
This returns a FoodReport object that stores all of the data about that specific food item. The API reference for a FoodReport can be found [here](https://ndb.nal.usda.gov/ndb/doc/apilist/API-FOOD-REPORTV2.md).

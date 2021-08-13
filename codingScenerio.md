# Reading HTML Form Data
we are going to create a form jsp page and on the page we will hava a single input
asking for the user name. Once they click enter we will take them to a new jsp
page and say Hello + the entered information

# Adding Data to the Spring model
We want a new method to process form data. THe method will read in the students name and convert it to uppercase. then add the uppercase verion to the model. 

# Vaildation
We are going to make a new calss customer and make sure the customer's last name is not null.

#InitBinder
we are going to use init binder to trim white space off an entry and if it is all whitespace we will return null
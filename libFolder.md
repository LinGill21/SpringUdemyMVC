The lib file has been added to the git ignore to avoid uploading spring to github
How to recreate the lib file
1. Go to https://repo.spring.io/
1.  Click on artifacts
1.  Then libs-release>org>springframework>spring>5.3.9>
1.  Click 5.3.9-dist.zip and URL to file
1.  Copy the lib file from spring-5.3.9-dist to the repo lib file
1. Add to build path
	1. right click project and click properties
	2.select javabuild path and then libaries
	3. click classpath and add jars
	4.select all files in lib folder

For spring MVC I have added in two new jar files from udemy
The files are
1.javax.servlet.jsp.jstl-1.2.1
2.javax.servlet.jsp.jstl-api-1.2.1

* Note in the MVC there is no need to update the build path the MVC does it for you

How to add in the validation Files
1. Go to hibernate.org
2. Click on Validator -> Releases -> 6.2
3. Click download Zip Archive
4. Open the zip Copy the jars for the dist folderS
5. Open dist->lib -> required and copy those jar files over
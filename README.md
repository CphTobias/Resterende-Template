# Template for java webproject

This is the starter template for De-Resterende's web project structure.
It's based on a command pattern created by one of our teachers Kasper.
We primarily use bootstrap for our .jsp sites, but you can you whatever you want.

# Download

1. Copy the template.
2. Change to your name in maven, web.xml etc.
3. Setup Tomcat.
4. Enjoy

# Migrate
the class migrate inside the dbsetup package, can be used to "migrate" your database though all of your .sql files.

1. Create 1.sql file in the resources.migrate folder.
2. Insert your sql, then update the properties table to the next version.
3. Inside the Database.java class, change the version value to the current version.
4. Run the main method inside Migrate.java



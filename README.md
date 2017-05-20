# spring-boot-custom-starter

## pre-requirements
- jdk 1.8
- maven
- Java IDE(eclipse or intellij idea)

## how to run the project
- use git clone https://github.com/BarkZhang/spring-boot-custom-starter.git or download zip to local disk and import to your ide(idea or eclipse)
- in command line, go to spring-boot-custom-starter folder, run mvn install to compile the project
- run MyInfoApplication class in your IDE, by default you will see "This is MR leasy" in console

## how to change configs
there are four keys in the configuration
- person.info.name
- person.info.age
- person.info.gender
- person.info.address
you can add, update or delete this line in application.properties file. and rerun the MyInfoApplication to see what chanegs in console

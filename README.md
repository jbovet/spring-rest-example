
Instructions:
* git clone 

if you don't have gradle, just run ./gradlew bootRun
or you can 

* Install SDKMan - http://sdkman.io 
* Install Gradle - sdk install gradle
* run: gradle bootRun

After running bootRun, just test:

		sum curl: --data '{"a":"12222", "b":"3332"}' -v -X POST -H 'Content-Type:application/json' http://localhost:8080/suma
		
        subtract: curl --data '{"a":"12222", "b":"3332"}' -v -X POST -H 'Content-Type:application/json' http://localhost:8080/resta
        
        prime list: curl -v http://localhost:8080/listarPrimos
              

This is a basic implementation of e2e test engine. Libs used: Spring Boot, Atlas, Selenium, Cucumber, Hamcrest + Yandex Matchers.

You need Java SE 17 to be installed on your machine.

To run tests on linux/macOS in Chrome just call
```
$ ./gradlew test
```
To run tests on Windows in Chrome just call
```
> gradlew.bat test
```

After execution test report can be found at `build/reports/tests/test/index.html`

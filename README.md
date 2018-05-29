# Test applications for different web-application authentication schemes
Here you can find simple spring-boot applications for different authentication schemes. This repo is created to test [ZAP](https://www.owasp.org/index.php/OWASP_Zed_Attack_Proxy_Project "OWASP ZAP home page") against different authentication schemes.
This is part of my GSoC project. A comprehensive list of different web-authentication schemes are maintained [here](https://docs.google.com/document/d/1LSg8CMb4LI5yP-8jYDTVJw1ZIJD2W_WDWXLtJNk3rsQ/edit "web-app authentication schemes"). You are warmly welcomed to share your knowledge :)
Meanwhile if you have any suggestions to improve ZAP authentication, feel free to post in [this](https://groups.google.com/forum/#!topic/zaproxy-develop/P83P8d7GJLI "ZAP Dev Group-authentication-gsoc") ZAP Dev Group thread.

## Currently implemented authentication schemes
1. Form based authentication.
2. Form based authentication with anti-CSRF token.
3. Basic authentication.

## How to run the examples
1. Import the project as `maven` project using your favorite IDE.
2. Right click `TestLoginApplication` class and run as `Spring Boot App`
3. Navigate to http://localhost:8080/ in browser
4. Default username: `user` Default password: `secret123`

I am a beginner to `SpringBoot` and `SpringSecurity`, so It is not recommended to use this repo for reference purposes other than testing.
Hearty thanks to the internet-community and `Spring` documentation :)


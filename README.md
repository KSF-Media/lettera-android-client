# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.ArticlesApi;

public class ArticlesApiExample {

    public static void main(String[] args) {
        ArticlesApi apiInstance = new ArticlesApi();
        String contentQuery = null; // String | 
        try {
            List<Article> result = apiInstance.articleSearchGet(contentQuery);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArticlesApi#articleSearchGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://http:/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ArticlesApi* | [**articleSearchGet**](docs/ArticlesApi.md#articleSearchGet) | **GET** /article/search | 
*ArticlesApi* | [**articleUuidGet**](docs/ArticlesApi.md#articleUuidGet) | **GET** /article/{uuid} | 
*ListsApi* | [**frontpageGet**](docs/ListsApi.md#frontpageGet) | **GET** /frontpage | Returns a list for a front page
*ListsApi* | [**latestGet**](docs/ListsApi.md#latestGet) | **GET** /latest | Returns a list of latest articles
*ListsApi* | [**mostreadGet**](docs/ListsApi.md#mostreadGet) | **GET** /mostread | Returns a list of most read articles


## Documentation for Models

 - [Alignment](docs/Alignment.md)
 - [Article](docs/Article.md)
 - [ArticleType](docs/ArticleType.md)
 - [Block](docs/Block.md)
 - [BlockShortcodeError](docs/BlockShortcodeError.md)
 - [FactInfo](docs/FactInfo.md)
 - [ImageInfo](docs/ImageInfo.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




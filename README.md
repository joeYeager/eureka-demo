# Eureka Demo

## Overview

This demo will hopefully answer the folowing questions:

1) What is Eureka?
2) How do I setup a Eureka Server?
3) How do I register applications with Eureka?
4) How do I access the applications once I have registered them?

## What is Eureka?

https://github.com/Netflix/eureka/wiki/Eureka-at-a-glance

Eureka is a service registry.  If you are unfamiliar with service registries, think of
it as a phone book for micro-services.  A service is configured to register with
a Eureka server and provides the server with all the information that it needs
to access that particular instance of the micro-service.  This information
includes, but is not limited to: host, port, and service name.

Eureka is designed to be used in the mid-tier for appl

## How do I setup a Eureka Server?

Setting up a Eureka server is pretty simple.  If you have ever created a
Spring Boot application, this should be nothing too new for you.  It comes
down to just a few simple steps

- Create a Spring Boot Application
- Add spring-cloud-starter-eureka to the applications dependencies
- Add an annotation to your main class
- Configure
- Run

That's all it takes to get a Eureka server up and running.  It's a pretty
boring Eureka server because nothing is registered with it yet, but we will fix that
in the next section.

## How do I register applications with Eureka?

Now that the Eureka server is running, we need to register an application
with it.  This section is going to be very similar with what we went through
setting up the discovery server.  The steps are going to be exactly the same:

- Create a Spring Boot Application
- Add spring-cloud-starter-eureka to the applications dependencies
- Add an annotation to your main class
- Configure
- Run

The annotation and the configuration steps are going to differ slightly
for application configuration.

Since the discovery server is running, every instance of the eureka-application
we spin up will register with the server.  You can visit the eureka dashboard
and view the registered services.

## How do I access the applications once I have registered them?

# Caching

## Types of Caching

* In-Memory
* Distributed
* Disk-based
* Application-level
* HTTP Caching
* Database Caching

## Java In-Memory Caching

Stores cacheable data in server RAM's. \
Provides DataStructures - ConcurrentHashMap for concurrent access to the data. \
Guava and Caffeine are third party libraries that can be used for in-memory cache.

## Distributed Cache

Distributes cache is used to be highly available, scalable and fault
tolerant to data loss throughout distributed systems. \
Distributes and locally servers cached data across nodes.\
Useful for webapps and microservices. \
Technologies that can be used for this  - Hazelcast, Encache, Redis(Distributed Mode) and Terracota.

## Disk Based Caching

Data is stored in data store where its relatively easier and faster to retrieve when compared to external applications. \
Tools - Apache DiskStore and DiskStore on Encache.

## Application Level Caching

Store the necessary data inside the application, when its running. \
Classes Such as ConcurrentHashMap and Tools - Guava and Caffeine.

## HTTP Caching

Frequently accessed data is cached.\
Frameworks - Spring Cache and Apache HttpClient.

## Database Caching

Store data of frequently accessed queries.\
Implementations - Using EnCache with Hibernate or JPA. \
Redis can also be used as an external cache.

# Java Caching Techniques





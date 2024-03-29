---
title: Difficulties
layout: default
nav_order: 2
parent: Timeline
---

# Difficulties

This is a document that describes the obstacles encountered in the project, providing detailed information about the problems encountered and possible solutions.
{: .fs-6 .fw-300 }

## Module 1

1. The development meeting had to be rescheduled from Wednesdays to Tuesdays and Thursdays due a scheduling conflict with the "Coda Comigo" live sessions;

2. We encountered problems with the Live Share extension while using Visual Studio Code for group coding, leading us to switch to the paid version of IntelliJ provided by FIAP for using Code With Me" service;

3. Changing the primary key of all entities from Long to UUID caused numerous issues;

4. Generating the Javadoc for the project was huge challenge, because we couldn't create a page similar to the one generated by Swagger UI;

5. Implementing a toggle button for light/dark mode using the Just-the-docs template proved to be a difficult task, as it required creating a custom layout (with custom HTML, CSS, and Javascript);

6. Understanding the exact assignment for the Tech Challenge was difficult, because each professor and channel/platform provided different information;

7. Using Enums for attributes added extra complexity to the implementation;

8. Exception handling using ExceptionHandler led us to some errors hard to solve, resulting in significant time spent searching for solutions on Stack Overflow;

9. Attempting to use JMapper for class mapping caused multiple errors, having to do manual conversion between entities and DTOs;

10. While testing the documentation generated by Swagger UI, we noticed that it was not possible to make requests through the example page due to CORS not being enabled;

11. The FIAP ON platform presented numerous issues (e.g.: content changing, and not rotating videos).

---
## Module 2

1. Many errors in the FIAP ON platform have been fixed; however, there are still issues with the lessons, where the player stops working, impacting studies and delivery schedules. Another noteworthy error is related to the completion of Fast Tests, where the results are not sent, hindering submission;

2. Availability of team members to attend weekly meetings;

3. New members of the group faced difficulties in catching up with the project since they were not involved with the group during the first phase;

4. Based on the project structure we built, entity deletion became more complex, and we encountered difficulties with cascading deletion;

5. During the implementation of Pageable and dynamic attribute filtering for entities, we faced an issue where Pageable was not being recognized and couldn't be used in the URL. However, it was fixed, and we were able to separate dynamic filtering and Pageable, making them work together.
# Sample project for jtsgen

This project consists of the following parts:

 *  **api**: The API between the frontend and the backend. The service and
    client project are depending on types exported by this project
 *  **service** JAX-RS services that the client calls. It is Jersey/Jackson
    based, demonstrating a user defined type conversion. It is exported
    as web fragment
 *  **client** a very simple angular app calling the service. it is
    exported as web-fragemnt, too
 *  **war** the integration project generating a deployable WAR file

Currently it is not fully functional, and exists only to demonstrate
how to extract the java types:

1. The Types are exported in the api project using the jtsgen annotation
   processor
2. Currently the types are directky expoerted into the source folder
   of the Angular client
3. The `Person` class is used in the person component  ( client/src/app/person/list/list.component.ts )


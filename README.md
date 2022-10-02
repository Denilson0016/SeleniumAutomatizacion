### AUTOMATIZACIÓN DE PRUEBAS PARA AMAZON

el presente proyecto presenta la automatización de pruebas, para validar  la funcionalidad de búsqueda de Amazon.
#### Diferencias con el curso de udemy en donde se realiza el ejercicio de muestra:
Se modificó la estructura del feature, para una mejor comprensión a la hora de presentarlo a personas externas, en este caso, el ejemplo base, tenía la estructura Given, When, And, And, And. Y fue modificado por la estructura: Given, When, And, And, Then. 

#### Errores encontrados:
La característica a probar era entrar a la página de Amazon, escribir "Alexa" en la barra de búsqueda, dirigirse a la segunda página, escoger el producto npumero 3 de esta y añadirlo al carrito.
Al momento de realizar la prueba, se encontró que algunos productos de la página, no estaban disponibles para añadir al carrito, lo que generaba un error, si nos ceñíamos a las peticiones iniciales, por eso mismo, se decidió escribir otro producto en la barra de búsqueda y hacer todo el proceso siguiente, para poder probar finalmente, que la característica de añadir productos al carrito, funcionaba correctamente.
# springboot-async
Springboot 2.2 project demonstrating the Sync vs Async call (Using Java 8 CompletableFuture and its performances

This project follows the typical Spring Flow of Controller (Returns the Model) -> Service (takes domain and converts to model) -> Repository

UserController vs UserAsyncController 


Create User -> ab -n 1000 -c 10 -p /Users/vsugumaran/Documents/personal/code/springboot-async/create_user.txt -T application/json  http://localhost:8080/springboot-async/user/create


Sync Test --> ab -n 4000 -c 150 http://localhost:8080/springboot-async/user/name/vimal

Async Test --> ab -n 4000 -c 150 http://localhost:8080/springboot-async/userAsync/name/vimal

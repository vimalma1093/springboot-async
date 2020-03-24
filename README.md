# springboot-async
Springboot 2.2 project demonstrating the Sync vs Async call and its performances

UserController vs UserAsyncController (Uses CompletableFuture)


Create User -> ab -n 1000 -c 10 -p /Users/vsugumaran/Documents/personal/code/springboot-async/create_user.txt -T application/json  http://localhost:8080/springboot-async/user/create


Sync Test --> ab -n 4000 -c 150 http://localhost:8080/springboot-async/user/name/vimal

Async Test --> ab -n 4000 -c 150 http://localhost:8080/springboot-async/userAsync/name/vimal

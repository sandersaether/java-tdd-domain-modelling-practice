

```
1. When I run the program I see a menu giving 
me options to use each of the functions of the program.

```

| Classes       | Methods         | Scenario    | Output                           |
|---------------|-----------------|-------------|----------------------------------|
| RandomStudent | void showMenu() | run program | menu showing options you can use |
|               |                 |             |                                  |


```
2. When I select the option it will output a randomly chosen student from the list.
```

| Classes       | Methods                   | Scenario          | Output           |
|---------------|---------------------------|-------------------|------------------|
| RandomStudent | void showMenu()           | choosing option 1 | "random student" |
|               | String getRandomStudent() |                   |                  |


```
3. When I select the option it will output a list of all
 of the students as randomly chosen pairs.
```

| Classes       | Methods                          | Scenario          | Output                         |
|---------------|----------------------------------|-------------------|--------------------------------|
| RandomStudent | void showMenu()                  | choosing option 2 | prints list with student pairs |
|               | ArrayList getRandomStudentPair() |                   |                                |


```
4. When I select the option it will output a random list of
 Peer Groups for all of the students (groups of 4 students).
```

| Classes       | Methods                            | Scenario          | Output                 |
|---------------|------------------------------------|-------------------|------------------------|
| RandomStudent | void showMenu()                    | choosing option 3 | list of student groups |
|               | Arraylist getRandomStudentGroups() |                   |                        |

```
5. When I run the program it should load the list of current students from a text file.
```

| Classes       | Methods | Scenario    | Output               |
|---------------|---------|-------------|----------------------|
| RandomStudent | load()  | run program | list of all students |
|               |         |             |                      |

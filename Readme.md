

# السؤال الاول :

Write a Java program that read two user numbers and choose between arithmetic operation

- Enter your first number: 125
- Enter your second number: 24
- Choose your operation :
1. ( + )
2. ( - )
3. ( / )
4. ( * )
5. ( % )

Expected Output :
125 + 24 = 149


----------



# السؤال الثاني :

![image](https://user-images.githubusercontent.com/93971372/169213129-241145be-56a9-4fd2-a74f-902510356ba3.png)

- A class called MyTime, which models a time instance, is designed as shown in the class diagram.
- It contains the following private instance variables:
- hour: between 0 to 23.
- minute: between 0 to 59.
- Second: between 0 to 59.
- You are required to perform input validation.
- It contains the following public methods:
- setTime(int hour, int minute, int second): It shall check if the given hour, minute and second are valid before setting the instance variables.
- (Advanced: Otherwise, it shall throw an IllegalArgumentException with the message "Invalid hour, minute, or second!".)
- Setters setHour(int hour), setMinute(int minute), setSecond(int second): It shall check if the parameters are valid, similar to the above.
- Getters getHour(), getMinute(), getSecond().
- toString(): returns "HH:MM:SS".
- nextSecond(): Update this instance to the next second and return this instance. Take note that the nextSecond() of 23:59:59 is 00:00:00.
- nextMinute(), nextHour(), previousSecond(), previousMinute(), previousHour(): similar to the above.
- Write the code for the MyTime class. Also write a test driver (called TestMyTime) to test all the public methods defined in the MyTime class.



السؤال الثالث :

![image](https://user-images.githubusercontent.com/93971372/169211167-8c057c54-b535-4cd3-98d2-65fd212ced4d.png)






السؤال الرابع :

![image](https://user-images.githubusercontent.com/93971372/169216946-f8481046-ce64-4344-a75f-b5a3892fa1ce.png)

----------
السؤال الخامس :

![image](https://user-images.githubusercontent.com/93971372/169212291-da5dd27e-b6ea-464e-8830-f1b879b76e84.png)

- Three private instance variables v1, v2, v3 (instances of MyPoint), for the three vertices.
- A constructor that constructs a MyTriangle with three set of coordinates, v1=(x1, y1), v2=(x2, y2), v3=(x3, y3).
- An overloaded constructor that constructs a MyTriangle given three instances of MyPoint.
- A toString() method that returns a string description of the instance in the format "MyTriangle[v1=(x1,y1),v2=(x2,y2),v3=(x3,y3)]".
- A getPerimeter() method that returns the length of the perimeter in double. You should use the distance() method of MyPoint to compute the perimeter.
- A method printType(), which prints "equilateral" if all the three sides are equal, "isosceles" if any two of the three sides are equal, or "scalene" if the three sides are different.
- Write the MyTriangle class. Also write a test driver (called TestMyTriangle) to test all the public methods defined in the class.
----------




السؤال السادس :

![image](https://user-images.githubusercontent.com/93971372/169211438-f40546be-1587-44d0-ad12-ab608860de32.png)



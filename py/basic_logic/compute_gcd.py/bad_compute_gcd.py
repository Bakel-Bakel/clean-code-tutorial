#!usr/bin/python
def brute(c,x,y,n):
         print("Solving")
         i=1
         while i < n:
            for a in range(1,n+1):
               c2 = a*x - i*y
               if c2 == c:
                  print(c,"= "+str(a)+"."+str(x)+" - "+str(i)+"."+str(y))
                  
            i+=1
         j = 0
         while j < n:
            for a in range(1,n+1):
               c2 = a*y - j*x
               if c2 == c:
                  print(c,"= "+str(a)+"."+str(y)+" - "+str(j)+"."+str(x))
                  
            j+=1
         print("___________________________________________________\nIf no solution was given or you need more solution pls increase the engine depth\n___________________________________________________\n")
         inputs()
def express(c,x,y,n):
   if x%c==0 and y%c==0:
      brute(c,x,y,n)
   else:
      print("Sorry the numbers are not compartible")
      
def gcdsteps(x,y):
   ans =""
   if x>y:
      a = x%y
      if a == 0 :
         print (x,"= "+str(y)+"."+str(round(x/y,None)))
         print("So therefore the GCD =",y)
         print("----------------------\n")
         inputs()
      else:
         print (x,"= "+str(y)+"."+str(x//y)+" + "+str(x%y))
         gcdsteps(y,x%y)
   elif x==y:
      print (x)
   else:
      gcdsteps(y,x)

def inputs():
   print("|+==========================================================================+|")
   print("|+Coded by Bakel/yoda_of_codas   \t\t \t\t\t    +|\n|+^^^^^^^^^^^^^^^^^^^^^^^^^^^^\t\t\t\t\t\t    +|\n|+Show step by step method on how to solve gcd Enter 1\t\t\t    +|\n|+Express gcd or number as a linear expression of two other numbers Press 2 +|")      
   print("|+==========================================================================+|")
   a = input()
   if a=='1':
      x = int(input("Enter the first number: "))
      y = int(input("Enter the second number: "))
      gcdsteps(x,y)
   elif a == '2':
      c = int(input("Enter the divisor or the number to be expressed: "))
      x = int(input("Enter the first number: "))
      y = int(input("Enter the second number: "))
      n = int(input("Set Engine Calculation Depth e.g 100,1000,9334. Enter 0 to use code default(1000): "))
      if n == 0:
         n=1000
      express(c,x,y,n)
   else:
      inputs()

inputs()
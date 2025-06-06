x = float(input ("what is your first value"))
y = float(input ("what is your second value"))

opp = input("1: Addition " "2: Subtraction " "3: Multiplication " "4: Division ")

if opp == "4":
    if y == 0 :
        print ("Invalid")
    else :
        print (x/y)
if opp == "1":
    print (x+y);
if opp == "2":
    print(x-y);
if opp =="3":
    print(x*y)
    


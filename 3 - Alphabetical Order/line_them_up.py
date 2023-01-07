n = int(input())
increasing = False
decreasing = False
previous_person = input() # HOPE

for i in range(n-1):
    current_person = input() # ALI
    if current_person < previous_person:
        decreasing = True
    if current_person > previous_person:
        increasing = True
    previous_person = current_person

if increasing and decreasing:
    print("NEITHER")
elif increasing:
    print("INCREASING")
else:
    print("DECREASING")

 





